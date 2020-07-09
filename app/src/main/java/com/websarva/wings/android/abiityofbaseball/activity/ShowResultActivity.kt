package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.fragment.player_info.PlayerInfoFragment
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerFielderClass
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerPitcherClass
import kotlinx.android.synthetic.main.activity_show_result.*
import java.util.ArrayList

class ShowResultActivity : BaseBannerActivity() {

    private lateinit var mInterstitialAd: InterstitialAd

    companion object {
        // Interstitial AD's ID
        const val AD_UNIT_ID: String = "ca-app-pub-3940256099942544/1033173712"
        const val AD_FREQUENCY = 2
        var makingPlayerCounter = 0
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_show_result)
        setAdViewContainer(ad_view_container_on_show_result)
        super.onCreate(savedInstanceState)

        displayPlayerInfo()
        loadInterstitialAd()
    }

    /**
     * reference
     * https://developers.google.com/admob/android/interstitial
     */
    private fun loadInterstitialAd() {
        makingPlayerCounter++

        MobileAds.initialize(this) {}
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = AD_UNIT_ID
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClicked() {
                backToTop()
            }
            override fun onAdClosed() {
                backToTop()
            }
        }

        mInterstitialAd.loadAd(AdRequest.Builder().build())
    }

    private fun displayPlayerInfo() {
        when (AnswerQuestionsActivity.playerType) {
            Constants.TYPE_FIELDER -> {
                val fielderPlayerFrag = PlayerInfoFragment.newInstance(makeFielder())
                addPlayerInfoFrag(fielderPlayerFrag)
            }
            Constants.TYPE_PITCHER -> {
                val pitcherPlayerFrag = PlayerInfoFragment.newInstance(makePitcher())
                addPlayerInfoFrag(pitcherPlayerFrag)
            }
        }
    }

    private fun addPlayerInfoFrag(playerInfoFrag: PlayerInfoFragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_info, playerInfoFrag)
        transaction.commit()
    }

    private fun makeFielder(): PlayerFielderClass {
        return PlayerFielderClass(
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
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
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
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
        else backToTop()
    }

    private fun checkStatement(): Boolean {
        return mInterstitialAd.isLoaded
                && makingPlayerCounter % AD_FREQUENCY == 0
    }

    private fun backToTop() {
        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }

}