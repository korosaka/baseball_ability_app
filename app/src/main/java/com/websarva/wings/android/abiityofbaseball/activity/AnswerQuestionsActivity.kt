package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.calc_ability.*
import com.websarva.wings.android.abiityofbaseball.fragment.question.QuestionOfAppearanceFragment
import com.websarva.wings.android.abiityofbaseball.fragment.question.QuestionOfPersonalityFragment
import com.websarva.wings.android.abiityofbaseball.fragment.question.QuestionOfOtherFragment
import kotlinx.android.synthetic.main.activity_answer_questions.*
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_personality.*
import kotlinx.android.synthetic.main.fragment_question_of_other.*
import kotlin.properties.Delegates

class AnswerQuestionsActivity : AppCompatActivity() {

    // for using on child fragment
    companion object {
        var sex_id by Delegates.notNull<Int>()
        lateinit var playerType: String
    }

    var currentName = Constants.APPEARANCE

    private lateinit var playerName: String

    private lateinit var appearanceFrag: Fragment
    private lateinit var personalityFrag: Fragment
    private lateinit var otherFrag: Fragment

    private lateinit var answersAppearance: Array<String>
    private lateinit var answersPersonality: Array<String>
    private lateinit var answersOther: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_questions)
//        setAdViewContainer(ad_view_container_on_player_making)

        assignInfo()
        addFragments()
    }

    private fun assignInfo() {
        playerName = intent.getStringExtra(Constants.PLAYER_NAME).toString()
        playerType = intent.getStringExtra(Constants.PLAYER_TYPE).toString()
        sex_id = intent.getIntExtra(Constants.SEX_ID, Constants.ID_ERROR)
    }

    private fun addFragments() {
        appearanceFrag = QuestionOfAppearanceFragment()
        personalityFrag = QuestionOfPersonalityFragment()
        otherFrag = QuestionOfOtherFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment, appearanceFrag)
        transaction.add(R.id.frame_for_fragment, personalityFrag)
        transaction.add(R.id.frame_for_fragment, otherFrag)
        transaction.commit()
        showHideFragment(Constants.APPEARANCE)
    }

    fun onClickBack(view: View) {
        when (currentName) {
            Constants.APPEARANCE -> backToPrevious()
            Constants.PERSONALITY -> changeToAppearance()
            Constants.OTHER -> changeToPerson()
        }
    }

    fun onClickNext(view: View) {
        when (currentName) {
            Constants.APPEARANCE -> changeToPerson()
            Constants.PERSONALITY -> changeToOther()
            Constants.OTHER -> makePlayer()
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
    private fun changeToOther() {
        showHideFragment(Constants.OTHER)
        currentName = Constants.OTHER
        bt_next.text = resources.getString(R.string.go_result)
    }


    private fun showHideFragment(fragmentName: String) {

        val transaction = supportFragmentManager.beginTransaction()

        when (fragmentName) {
            Constants.APPEARANCE -> {
                transaction.show(appearanceFrag)
                transaction.hide(personalityFrag)
                transaction.hide(otherFrag)

                label_A.setBackgroundColor(Color.WHITE)
                label_P.setBackgroundColor(Color.GRAY)
                label_O.setBackgroundColor(Color.GRAY)
            }
            Constants.PERSONALITY -> {
                transaction.show(personalityFrag)
                transaction.hide(appearanceFrag)
                transaction.hide(otherFrag)

                label_A.setBackgroundColor(Color.GRAY)
                label_P.setBackgroundColor(Color.WHITE)
                label_O.setBackgroundColor(Color.GRAY)
            }
            Constants.OTHER -> {
                transaction.show(otherFrag)
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
        // _ means argument which is never used
        builder.setPositiveButton(resources.getString(R.string.done)) { _, _ ->
            assignAnswers()
            when (playerType) {
                Constants.TYPE_FIELDER -> makeFielder()
                Constants.TYPE_PITCHER -> makePitcher()
            }
            finish()
        }
        builder.setNegativeButton(resources.getString(R.string.no), null)
        builder.show()
    }

    private fun assignAnswers() {
        answersAppearance = arrayOf(
                spinner_q1_a.selectedItem as String,
                spinner_q2_a.selectedItem as String,
                spinner_q3_a.selectedItem as String,
                spinner_q4_a.selectedItem as String,
                spinner_q5_a.selectedItem as String,
                spinner_q6_a.selectedItem as String)
        answersPersonality = arrayOf(
                spinner_q1_p.selectedItem as String,
                spinner_q2_p.selectedItem as String,
                spinner_q3_p.selectedItem as String,
                spinner_q4_p.selectedItem as String,
                spinner_q5_p.selectedItem as String,
                spinner_q6_p.selectedItem as String)
        answersOther = arrayOf(
                spinner_q1_o.selectedItem as String,
                spinner_q2_o.selectedItem as String,
                spinner_q3_o.selectedItem as String,
                spinner_q4_o.selectedItem as String,
                spinner_q5_o.selectedItem as String,
                spinner_q6_o.selectedItem as String)
    }

    private fun makeFielder() {
        when (sex_id) {
            Constants.ID_MAN -> makeMaleFielder()
            Constants.ID_WOMAN -> makeFemaleFielder()
        }
    }

    private fun makePitcher() {
        when (sex_id) {
            Constants.ID_MAN -> makeMalePitcher()
            Constants.ID_WOMAN -> makeFemalePitcher()
        }
    }

    private fun makeMaleFielder() {
        startFielderActivity(
                CalcMaleFielderAbility(
                        this,
                        answersAppearance,
                        answersPersonality,
                        answersOther
                )
        )
    }

    private fun makeFemaleFielder() {
        startFielderActivity(
                CalcFemaleFielderAbility(
                        this,
                        answersAppearance,
                        answersPersonality,
                        answersOther
                )
        )
    }

    private fun makeMalePitcher() {
        startPitcherActivity(
                CalcMalePitcherAbility(
                        this,
                        answersAppearance,
                        answersPersonality,
                        answersOther
                )
        )
    }

    private fun makeFemalePitcher() {
        startPitcherActivity(
                CalcFemalePitcherAbility(
                        this,
                        answersAppearance,
                        answersPersonality,
                        answersOther
                )
        )
    }

    private fun startFielderActivity(calcAbility: CalcFielderAbility) {
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

    private fun startPitcherActivity(calcAbility: CalcPitcherAbility) {
        val intent = Intent(this, ShowResultActivity::class.java)
        intent.putExtra(Constants.PLAYER_NAME, playerName)
        intent.putExtra(Constants.PITCHER_TYPE, calcAbility.pitcherType)
        intent.putExtra(Constants.BALL_SPEED, calcAbility.maxBallSpeed)
        intent.putExtra(Constants.CONTROL, calcAbility.control)
        intent.putExtra(Constants.STAMINA, calcAbility.stamina)
        intent.putExtra(Constants.KIND_CHANGE, calcAbility.numberOfChange)
        intent.putExtra(Constants.AMOUNT_CHANGE, calcAbility.totalAmountOfChange)
        intent.putExtra(Constants.CHANGE_BALLS, calcAbility.changeBalls)
        intent.putExtra(Constants.CHANCE, calcAbility.chance)

        startActivity(intent)
    }

    private fun backToPrevious() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(resources.getString(R.string.go_back))
        builder.setMessage(resources.getString(R.string.ask_go_back))
        // _ means argument which is never used
        builder.setPositiveButton(resources.getString(R.string.yes)) { _, _ ->
            val intent = Intent(this, SelectPlayerTypeActivity::class.java)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton(resources.getString(R.string.cancel), null)
        builder.show()
    }

}