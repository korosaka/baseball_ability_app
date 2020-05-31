package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_player_making.*
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_personality.*
import kotlinx.android.synthetic.main.fragment_question_of_popularity.*

class PlayerMakingActivity : BaseBannerActivity() {

    // for using on child fragment
    companion object {
        var sex_id = -1
    }

    var currentName = Constants.APPEARANCE

    var playerName: String? = null
    var playerType: String? = null

    private val appearanceFrag: QuestionOfAppearanceFragment = QuestionOfAppearanceFragment.newInstance()
    private val personalityFrag: Fragment = QuestionOfPersonalityFragment.newInstance()
    private val popularityFrag: Fragment = QuestionOfPopularityFragment.newInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_player_making)
        setAdViewContainer(ad_view_container_on_player_making)
        super.onCreate(savedInstanceState)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment, appearanceFrag)
        transaction.add(R.id.frame_for_fragment, personalityFrag)
        transaction.add(R.id.frame_for_fragment, popularityFrag)
        transaction.commit()
        showHideFragment(Constants.APPEARANCE)

        playerName = intent.getStringExtra(Constants.PLAYER_NAME)
        playerType = intent.getStringExtra(Constants.PLAYER_TYPE)
        sex_id = intent.getIntExtra(Constants.SEX_ID, -1)

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
        bt_next.text = Constants.GO_NEXT
    }

    /**
     * -> 性格
     */
    private fun changeToPerson() {
        showHideFragment(Constants.PERSONALITY)
        currentName = Constants.PERSONALITY
        bt_next.text = Constants.GO_NEXT
    }

    /**
     * -> 人気
     */
    private fun changeToPopularity() {
        showHideFragment(Constants.POPULARITY)
        currentName = Constants.POPULARITY
        bt_next.text = Constants.GO_TO_RESULT
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
        builder.setTitle(Constants.CONFIRM_INPUT)
        builder.setMessage(Constants.DO_YOU_FINISH_INPUT)
        builder.setPositiveButton(Constants.DONE) { dialog, which ->

            // 全ての入力値から計算
            val calcAbility = CalcAbility(spinner_q1_a.selectedItem as String, spinner_q2_a.selectedItem as String, spinner_q3_a.selectedItem as String, spinner_q4_a.selectedItem as String, spinner_q5_a.selectedItem as String,
                    spinner_q1_p.selectedItem as String, spinner_q2_p.selectedItem as String, spinner_q3_p.selectedItem as String, spinner_q4_p.selectedItem as String, spinner_q5_p.selectedItem as String,
                    spinner_q1_o.selectedItem as String, spinner_q2_o.selectedItem as String, spinner_q3_o.selectedItem as String, spinner_q4_o.selectedItem as String, spinner_q5_o.selectedItem as String)

            if (playerType.equals(Constants.TYPE_FIELDER)) {
                val intent = Intent(this, MakingStatusActivity::class.java)
                intent.putExtra(Constants.PLAYER_NAME, playerName)
                intent.putExtra(Constants.BALLISTIC, calcAbility.ballistic)
                intent.putExtra(Constants.CONTACT, calcAbility.contact)
                intent.putExtra(Constants.POWER, calcAbility.power)
                intent.putExtra(Constants.SPEED, calcAbility.speed)
                intent.putExtra(Constants.ARM_STRENGTH, calcAbility.armStrength)
                intent.putExtra(Constants.FIELDING, calcAbility.fielding)
                intent.putExtra(Constants.CATCHING, calcAbility.catching)
                intent.putExtra(Constants.CHANCE, calcAbility.chance)

                startActivity(intent)
            } else {
                val intent = Intent(this, MakingStatusPitcherActivity::class.java)
                intent.putExtra(Constants.PLAYER_NAME, playerName)
                intent.putExtra(Constants.PITCHER_TYPE, calcAbility.getPitcherType())
                intent.putExtra(Constants.BALL_SPEED, calcAbility.ballSpeed)
                intent.putExtra(Constants.CONTROL, calcAbility.control)
                intent.putExtra(Constants.STAMINA, calcAbility.stamina)
                intent.putExtra(Constants.KIND_CHANGE, calcAbility.kindsOfChangeBall)
                intent.putExtra(Constants.AMOUNT_CHANGE, calcAbility.amountOfCange)
                intent.putExtra(Constants.PRIORITY_CHANGE, calcAbility.priorityOfChange)

                startActivity(intent)
            }
            finish()
        }
        builder.setNegativeButton(Constants.NO, null)
        builder.show()
    }

    private fun backToPrevious() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(Constants.GO_BACK)
        builder.setMessage(Constants.DO_YOU_GO_BACK)
        builder.setPositiveButton(Constants.YES) { dialog, which ->
            val intent = Intent(this, SelectPlayerTypeActivity::class.java)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton(Constants.CANCEL, null)
        builder.show()
    }

}