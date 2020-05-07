package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_player_making.*
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_other.*
import kotlinx.android.synthetic.main.fragment_question_of_personality.*

class PlayerMakingActivity : BaseBannerActivity() {

    companion object {
        const val PLAYER_NAME = "playerName"
        const val PLAYER_TYPE = "playerType"
        const val CONTACT = "contact_status"
        const val POWER = "power_status"
        const val SPEED = "speed_status"
        const val ARM = "arm_status"
        const val FIELDING = "fielding_status"

        const val BALL_SPEED = "ballSpeed_status"
        const val CONTROL = "control_status"
        const val STAMINA = "stamina_status"
        const val KIND_CHANGE = "kindsOfChangeBall_status"
        const val AMOUNT_CHANGE = "amountOfChangeBall_status"
        const val PRIORITY_CHANGE = "priorityOfChangeBall"

        const val CHANCE = "chance"


        var sex_id = -1
    }

    val current_A = "appearance"
    val current_P = "personality"
    val current_O = "other"

    var currentName = current_A

    var playerName: String? = null
    var playerType: String? = null

    private val fragmentA: QuestionOfAppearanceFragment = QuestionOfAppearanceFragment.newInstance()
    private val fragmentP: Fragment = QuestionOfPersonalityFragment.newInstance()
    private val fragmentO: Fragment = QuestionOfOtherFragment.newInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_player_making)
        setAdViewContainer(ad_view_container_on_player_making)
        super.onCreate(savedInstanceState)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment, fragmentA)
        transaction.add(R.id.frame_for_fragment, fragmentP)
        transaction.add(R.id.frame_for_fragment, fragmentO)
        transaction.commit()
        showHideFragment(current_A)

        playerName = intent.getStringExtra(PLAYER_NAME)
        playerType = intent.getStringExtra(PLAYER_TYPE)
        sex_id = intent.getIntExtra(SelectPlayerTypeActivity.SEXID, -1)

    }

    fun onClickBack(view: View) {
        when (currentName) {
            current_A -> backToPrevious()
            current_P -> changeToAppearance()
            current_O -> changeToPerson()
        }
    }

    fun onClickNext(view: View) {
        when (currentName) {
            current_A -> changeToPerson()
            current_P -> changeToOther()
            current_O -> makePlayer()
        }
    }

    /**
     * -> 見た目
     */
    fun changeToAppearance() {
        showHideFragment(current_A)
        currentName = current_A
        bt_next.setText("次へ")
    }

    /**
     * -> 性格
     */
    fun changeToPerson() {
        showHideFragment(current_P)
        currentName = current_P
        bt_next.setText("次へ")
    }

    /**
     * -> その他
     */
    fun changeToOther() {
        showHideFragment(current_O)
        currentName = current_O
        bt_next.setText("査定結果へ")
    }


    fun showHideFragment(fragmentName: String) {

        val transaction = supportFragmentManager.beginTransaction()

        when (fragmentName) {
            current_A -> {
                transaction.show(fragmentA)
                transaction.hide(fragmentP)
                transaction.hide(fragmentO)

                label_A.setBackgroundColor(Color.WHITE)
                label_P.setBackgroundColor(Color.GRAY)
                label_O.setBackgroundColor(Color.GRAY)
            }
            current_P -> {
                transaction.show(fragmentP)
                transaction.hide(fragmentA)
                transaction.hide(fragmentO)

                label_A.setBackgroundColor(Color.GRAY)
                label_P.setBackgroundColor(Color.WHITE)
                label_O.setBackgroundColor(Color.GRAY)
            }
            current_O -> {
                transaction.show(fragmentO)
                transaction.hide(fragmentA)
                transaction.hide(fragmentP)

                label_A.setBackgroundColor(Color.GRAY)
                label_P.setBackgroundColor(Color.GRAY)
                label_O.setBackgroundColor(Color.WHITE)
            }
        }

        transaction.commit()
    }

    fun makePlayer() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("入力確認")
        builder.setMessage("入力はお済みでしょうか？")
        builder.setPositiveButton("完了") { dialog, which ->

            // 全ての入力値から計算
            val calcAbility = CalcAbility(spinner_q1_a.selectedItem as String, spinner_q2_a.selectedItem as String, spinner_q3_a.selectedItem as String, spinner_q4_a.selectedItem as String, spinner_q5_a.selectedItem as String,
                    spinner_q1_p.selectedItem as String, spinner_q2_p.selectedItem as String, spinner_q3_p.selectedItem as String, spinner_q4_p.selectedItem as String, spinner_q5_p.selectedItem as String,
                    spinner_q1_o.selectedItem as String, spinner_q2_o.selectedItem as String, spinner_q3_o.selectedItem as String, spinner_q4_o.selectedItem as String, spinner_q5_o.selectedItem as String)

            if (playerType.equals("fielder")) {
                val intent = Intent(this, MakingStatusActivity::class.java)
                intent.putExtra(PLAYER_NAME, playerName)
                intent.putExtra(CONTACT, calcAbility.contact)
                intent.putExtra(POWER, calcAbility.power)
                intent.putExtra(SPEED, calcAbility.speed)
                intent.putExtra(ARM, calcAbility.armStrength)
                intent.putExtra(FIELDING, calcAbility.fielding)

                intent.putExtra(CHANCE, calcAbility.chance)

                startActivity(intent)
            } else {
                val intent = Intent(this, MakingStatusPitcherActivity::class.java)
                intent.putExtra(PLAYER_NAME, playerName)
                intent.putExtra(MakingStatusPitcherActivity.PITCHER_TYPE, calcAbility.getPitcherType())
                intent.putExtra(BALL_SPEED, calcAbility.ballSpeed)
                intent.putExtra(CONTROL, calcAbility.control)
                intent.putExtra(STAMINA, calcAbility.stamina)
                intent.putExtra(KIND_CHANGE, calcAbility.kindsOfChangeBall)
                intent.putExtra(AMOUNT_CHANGE, calcAbility.amountOfCange)
                intent.putExtra(PRIORITY_CHANGE, calcAbility.priorityOfChange)

                startActivity(intent)
            }
            finish()
        }
        builder.setNegativeButton("いいえ", null)
        builder.show()
    }

    fun backToPrevious() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("戻る")
        builder.setMessage("前の画面に戻りますか？")
        builder.setPositiveButton("はい") { dialog, which ->
            val intent = Intent(this, SelectPlayerTypeActivity::class.java)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton("キャンセル", null)
        builder.show()
    }

}