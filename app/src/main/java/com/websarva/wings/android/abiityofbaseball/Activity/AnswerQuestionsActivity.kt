package com.websarva.wings.android.abiityofbaseball.Activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.Fragment.QuestionOfAppearanceFragment
import com.websarva.wings.android.abiityofbaseball.Fragment.QuestionOfPersonalityFragment
import com.websarva.wings.android.abiityofbaseball.Fragment.QuestionOfPopularityFragment
import kotlinx.android.synthetic.main.activity_player_making.*
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_personality.*
import kotlinx.android.synthetic.main.fragment_question_of_popularity.*

class AnswerQuestionsActivity : BaseBannerActivity() {

    // for using on child fragment
    companion object {
        var sex_id = Constants.ID_ERROR
        lateinit var playerType: String
    }

    var currentName = Constants.APPEARANCE

    private lateinit var playerName: String

    private lateinit var appearanceFrag: Fragment
    private lateinit var personalityFrag: Fragment
    private lateinit var popularityFrag: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_player_making)
        setAdViewContainer(ad_view_container_on_player_making)
        super.onCreate(savedInstanceState)

        addFragments()

        takeInfo()
    }

    private fun takeInfo() {
        playerName = intent.getStringExtra(Constants.PLAYER_NAME).toString()
        playerType = intent.getStringExtra(Constants.PLAYER_TYPE).toString()
        sex_id = intent.getIntExtra(Constants.SEX_ID, Constants.ID_ERROR)
    }

    private fun addFragments() {
        appearanceFrag = QuestionOfAppearanceFragment()
        personalityFrag = QuestionOfPersonalityFragment()
        popularityFrag = QuestionOfPopularityFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment, appearanceFrag)
        transaction.add(R.id.frame_for_fragment, personalityFrag)
        transaction.add(R.id.frame_for_fragment, popularityFrag)
        transaction.commit()
        showHideFragment(Constants.APPEARANCE)
    }

    fun onClickBack(view: View) {
        when (currentName) {
            Constants.APPEARANCE -> backToPrevious()
            Constants.PERSONALITY -> changeToAppearance()
            Constants.POPULARITY -> changeToPerson()
        }
    }

    fun onClickNext(view: View) {
        when (currentName) {
            Constants.APPEARANCE -> changeToPerson()
            Constants.PERSONALITY -> changeToPopularity()
            Constants.POPULARITY -> makePlayer()
        }
    }

    /**
     * -> 見た目
     */
    private fun changeToAppearance() {
        showHideFragment(Constants.APPEARANCE)
        currentName = Constants.APPEARANCE
        bt_next.text = resources.getString(R.string.go_next)
    }

    /**
     * -> 性格
     */
    private fun changeToPerson() {
        showHideFragment(Constants.PERSONALITY)
        currentName = Constants.PERSONALITY
        bt_next.text = resources.getString(R.string.go_next)
    }

    /**
     * -> 人気
     */
    private fun changeToPopularity() {
        showHideFragment(Constants.POPULARITY)
        currentName = Constants.POPULARITY
        bt_next.text = resources.getString(R.string.go_result)
    }


    private fun showHideFragment(fragmentName: String) {

        val transaction = supportFragmentManager.beginTransaction()

        when (fragmentName) {
            Constants.APPEARANCE -> {
                transaction.show(appearanceFrag)
                transaction.hide(personalityFrag)
                transaction.hide(popularityFrag)

                label_A.setBackgroundColor(Color.WHITE)
                label_P.setBackgroundColor(Color.GRAY)
                label_O.setBackgroundColor(Color.GRAY)
            }
            Constants.PERSONALITY -> {
                transaction.show(personalityFrag)
                transaction.hide(appearanceFrag)
                transaction.hide(popularityFrag)

                label_A.setBackgroundColor(Color.GRAY)
                label_P.setBackgroundColor(Color.WHITE)
                label_O.setBackgroundColor(Color.GRAY)
            }
            Constants.POPULARITY -> {
                transaction.show(popularityFrag)
                transaction.hide(appearanceFrag)
                transaction.hide(personalityFrag)

                label_A.setBackgroundColor(Color.GRAY)
                label_P.setBackgroundColor(Color.GRAY)
                label_O.setBackgroundColor(Color.WHITE)
            }
        }

        transaction.commit()
    }

    private fun makePlayer() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle(resources.getString(R.string.confirm_input))
        builder.setMessage(resources.getString(R.string.ask_complete))
        builder.setPositiveButton(resources.getString(R.string.done)) { dialog, which ->
            // 全ての入力値から計算
            val calcAbility = CalcAbility(this,
                    spinner_q1_a.selectedItem as String, spinner_q2_a.selectedItem as String, spinner_q3_a.selectedItem as String, spinner_q4_a.selectedItem as String, spinner_q5_a.selectedItem as String,
                    spinner_q1_p.selectedItem as String, spinner_q2_p.selectedItem as String, spinner_q3_p.selectedItem as String, spinner_q4_p.selectedItem as String, spinner_q5_p.selectedItem as String,
                    spinner_q1_o.selectedItem as String, spinner_q2_o.selectedItem as String, spinner_q3_o.selectedItem as String, spinner_q4_o.selectedItem as String, spinner_q5_o.selectedItem as String)

            when(playerType) {
                Constants.TYPE_FIELDER -> startFielderActivity(calcAbility)
                Constants.TYPE_PITCHER -> startPitcherActivity(calcAbility)
            }
            finish()
        }
        builder.setNegativeButton(resources.getString(R.string.no), null)
        builder.show()
    }

    private fun startFielderActivity(calcAbility: CalcAbility) {
        val intent = Intent(this, ShowResultActivity::class.java)
        intent.putExtra(Constants.PLAYER_NAME, playerName)
        intent.putExtra(Constants.POSITION, calcAbility.position)
        intent.putExtra(Constants.BALLISTIC, calcAbility.ballistic)
        intent.putExtra(Constants.CONTACT, calcAbility.contact)
        intent.putExtra(Constants.POWER, calcAbility.power)
        intent.putExtra(Constants.SPEED, calcAbility.speed)
        intent.putExtra(Constants.ARM_STRENGTH, calcAbility.armStrength)
        intent.putExtra(Constants.FIELDING, calcAbility.fielding)
        intent.putExtra(Constants.CATCHING, calcAbility.catching)
        intent.putExtra(Constants.CHANCE, calcAbility.chance)

        startActivity(intent)
    }

    private fun startPitcherActivity(calcAbility: CalcAbility) {
        val intent = Intent(this, ShowResultActivity::class.java)
        intent.putExtra(Constants.PLAYER_NAME, playerName)
        intent.putExtra(Constants.PITCHER_TYPE, calcAbility.pitcherType)
        intent.putExtra(Constants.BALL_SPEED, calcAbility.ballSpeed)
        intent.putExtra(Constants.CONTROL, calcAbility.control)
        intent.putExtra(Constants.STAMINA, calcAbility.stamina)
        intent.putExtra(Constants.KIND_CHANGE, calcAbility.kindsOfChangeBall)
        intent.putExtra(Constants.AMOUNT_CHANGE, calcAbility.amountOfChange)
        intent.putExtra(Constants.PRIORITY_CHANGE, calcAbility.priorityOfChange)

        startActivity(intent)
    }

    private fun backToPrevious() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(resources.getString(R.string.go_back))
        builder.setMessage(resources.getString(R.string.ask_go_back))
        builder.setPositiveButton(resources.getString(R.string.yes)) { dialog, which ->
            val intent = Intent(this, SelectPlayerTypeActivity::class.java)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton(resources.getString(R.string.cancel), null)
        builder.show()
    }

}