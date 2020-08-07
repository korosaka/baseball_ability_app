package com.websarva.wings.android.abiityofbaseball.activity

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.res.ResourcesCompat
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.database.UtilisingDB
import com.websarva.wings.android.abiityofbaseball.fragment.player_info.PlayerInfoFragment
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerFielderClass
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerPitcherClass
import kotlinx.android.synthetic.main.activity_show_result.*
import kotlinx.android.synthetic.main.fragment_player_info.*
import java.util.ArrayList

class ShowResultActivity : BaseBannerActivity() {

    private lateinit var mInterstitialAd: InterstitialAd
    private lateinit var currentStatus: String

    companion object {
        // Interstitial AD's ID
        const val AD_UNIT_ID: String = "ca-app-pub-3940256099942544/1033173712"
        const val AD_FREQUENCY_CREATING_NEW = 2
        const val AD_FREQUENCY_SAVED_PLAYER = 8

        const val LIMIT_PLAYER_DATA = 250
        var makingPlayerCounter = 0
        var seeingSavedPlayerCounter = 0
    }

    private lateinit var playerName: String

    private var fielder: PlayerFielderClass? = null
    private var pitcher: PlayerPitcherClass? = null

    override fun keyBackFunction() {
        if (checkStatement()) mInterstitialAd.show()
        else finishActivity()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_show_result)
        setAdViewContainer(ad_view_container_on_show_result)
        super.onCreate(savedInstanceState)

        currentStatus = intent.getStringExtra(Constants.USE).toString()
        makePlayer()
        displayPlayerInfo()
        loadInterstitialAd()
    }

    /**
     * reference
     * https://developers.google.com/admob/android/interstitial
     */
    private fun loadInterstitialAd() {
        incrementCount()

        MobileAds.initialize(this) {}
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = AD_UNIT_ID
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClicked() {
                finishActivity()
            }

            override fun onAdClosed() {
                finishActivity()
            }
        }

        mInterstitialAd.loadAd(AdRequest.Builder().build())
    }

    private fun incrementCount() {
        when (currentStatus) {
            Constants.NEW_PLAYER -> makingPlayerCounter++
            Constants.SAVED_PLAYER -> seeingSavedPlayerCounter++
        }
    }

    private fun finishActivity() {
        if (currentStatus == Constants.NEW_PLAYER) backToTop()
        else finish()
    }

    private fun makePlayer() {
        playerName = intent.getStringExtra(Constants.PLAYER_NAME)!!
        when (AnswerQuestionsActivity.playerType) {
            Constants.TYPE_FIELDER -> fielder = makeFielder()
            Constants.TYPE_PITCHER -> pitcher = makePitcher()
        }
    }

    private fun displayPlayerInfo() {
        when (AnswerQuestionsActivity.playerType) {
            Constants.TYPE_FIELDER -> {
                if (fielder != null) {
                    val fielderPlayerFrag = PlayerInfoFragment.newInstance(fielder!!)
                    addPlayerInfoFrag(fielderPlayerFrag)
                }
            }
            Constants.TYPE_PITCHER -> {
                if (pitcher != null) {
                    val pitcherPlayerFrag = PlayerInfoFragment.newInstance(pitcher!!)
                    addPlayerInfoFrag(pitcherPlayerFrag)
                }
            }
        }

        if (currentStatus == Constants.SAVED_PLAYER) disableSaveButton()
    }

    private fun disableSaveButton() {
        save_button.isEnabled = false
        save_button.setTextColor(Color.parseColor(Constants.SAVE_DISABLE_COLOR))
        val disableBackground =
                ResourcesCompat.getDrawable(resources, R.drawable.save_button_disable, null)
        save_button.background = disableBackground
    }

    private fun addPlayerInfoFrag(playerInfoFrag: PlayerInfoFragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_info, playerInfoFrag)
        transaction.commit()
    }

    private fun makeFielder(): PlayerFielderClass {
        return PlayerFielderClass(
                playerName,
                intent.getStringExtra(Constants.POSITION)!!,
                intent.getIntExtra(Constants.BALLISTIC, 1),
                intent.getIntExtra(Constants.CONTACT, 0),
                intent.getIntExtra(Constants.POWER, 0),
                intent.getIntExtra(Constants.SPEED, 0),
                intent.getIntExtra(Constants.ARM_STRENGTH, 0),
                intent.getIntExtra(Constants.FIELDING, 0),
                intent.getIntExtra(Constants.CATCHING, 0),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }

    private fun makePitcher(): PlayerPitcherClass {
        return PlayerPitcherClass(
                playerName,
                intent.getStringExtra(Constants.PITCHER_TYPE)!!,
                intent.getIntExtra(Constants.BALL_SPEED, 0),
                intent.getIntExtra(Constants.CONTROL, 0),
                intent.getIntExtra(Constants.STAMINA, 0),
                intent.getIntExtra(Constants.KIND_CHANGE, 0),
                intent.getIntExtra(Constants.AMOUNT_CHANGE, 0),
                obtainChangeBalls(),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }

    private fun obtainChangeBalls(): ArrayList<Int> {
        val changeBalls = intent.getIntegerArrayListExtra(Constants.CHANGE_BALLS)
        val emptyChange = arrayListOf(0, 0, 0, 0, 0)

        return when {
            changeBalls != null -> changeBalls
            else -> emptyChange
        }
    }

    fun onClickFinish(view: View) {
        if (checkStatement()) mInterstitialAd.show()
        else finishActivity()
    }

    private fun checkStatement(): Boolean {
        if (!mInterstitialAd.isLoaded) return false
        return when (currentStatus) {
            Constants.NEW_PLAYER -> makingPlayerCounter % AD_FREQUENCY_CREATING_NEW == 0
            Constants.SAVED_PLAYER -> seeingSavedPlayerCounter % AD_FREQUENCY_SAVED_PLAYER == 0
            else -> false
        }
    }


    fun onClickTweet(view: View) {
        Tweet(applicationContext, this, player_info_frame, playerName).tweet()
    }

    fun onClickSave(view: View) {
        if (canSave()) showSaveDialog()
        else Toast.makeText(applicationContext,
                resources.getString(R.string.full_data),
                Toast.LENGTH_SHORT)
                .show()
    }

    private fun canSave(): Boolean {
        val uDB = UtilisingDB(this, applicationContext)
        val numberOfData = when (AnswerQuestionsActivity.playerType) {
            Constants.TYPE_FIELDER -> uDB.countSavedPlayer(Constants.TYPE_FIELDER)
            Constants.TYPE_PITCHER -> uDB.countSavedPlayer(Constants.TYPE_PITCHER)
            else -> LIMIT_PLAYER_DATA
        }

        return numberOfData < LIMIT_PLAYER_DATA
    }

    private fun showSaveDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(resources.getString(R.string.ask_save))
        // _ means argument which is never used
        builder.setPositiveButton(resources.getString(R.string.done)) { _, _ ->
            savePlayerInfo()
        }
        builder.setNegativeButton(resources.getString(R.string.no), null)
        builder.show()
    }

    private fun savePlayerInfo() {
        val uDB = UtilisingDB(this, applicationContext)
        when (AnswerQuestionsActivity.playerType) {
            Constants.TYPE_FIELDER -> fielder?.let { uDB.saveFielder(it, save_button) }
            Constants.TYPE_PITCHER -> pitcher?.let { uDB.savePitcher(it, save_button) }
        }
    }

}