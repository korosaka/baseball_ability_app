package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_other.*
import kotlinx.android.synthetic.main.fragment_question_of_personality.*

class PlayerMakingActivity : AppCompatActivity(){

    companion object {
        const val PLAYER_NAME = "playerName"
        const val CONTACT = "contact_status"
        const val POWER = "power_status"
        const val SPEED = "speed_status"
        const val ARM = "arm_status"
        const val FIELDING = "fielding_status"

        const val CHANCE = "chance"


        var sex_id = -1
    }

    var playerName : String? = null

    private val fragmentA:QuestionOfAppearanceFragment = QuestionOfAppearanceFragment.newInstance()
    private val fragmentP:Fragment = QuestionOfPersonalityFragment.newInstance()
    private val fragmentO:Fragment = QuestionOfOtherFragment.newInstance()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_making)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment,fragmentA)
        transaction.add(R.id.frame_for_fragment,fragmentP)
        transaction.add(R.id.frame_for_fragment,fragmentO)
        transaction.show(fragmentA)
        transaction.hide(fragmentP)
        transaction.hide(fragmentO)
        transaction.commit()

        playerName = intent.getStringExtra(PLAYER_NAME)
        sex_id = intent.getIntExtra(SelectPlayerTypeActivity.SEXID,-1)

    }


    fun onClickAppearance(view: View) {
        showHideFragment("appearance")
    }
    fun onClickPersonality(view: View) {
        showHideFragment("personality")
    }
    fun onClickOther(view: View){
        showHideFragment("other")
    }


    fun showHideFragment(fragmentName:String){

        val transaction = supportFragmentManager.beginTransaction()

        when(fragmentName){
            "appearance" -> {
                transaction.show(fragmentA)
                transaction.hide(fragmentP)
                transaction.hide(fragmentO)
            }
            "personality" -> {
                transaction.show(fragmentP)
                transaction.hide(fragmentA)
                transaction.hide(fragmentO)
            }
            "other" -> {
                transaction.show(fragmentO)
                transaction.hide(fragmentA)
                transaction.hide(fragmentP)
            }
        }

        transaction.commit()
    }

    fun onClickMakePlayer(view: View){

        val calcAbility = CalcAbility(spinner_q1_a.selectedItem as String,spinner_q2_a.selectedItem as String,spinner_q3_a.selectedItem as String,spinner_q4_a.selectedItem as String,spinner_q5_a.selectedItem as String,
                spinner_q1_p.selectedItem as String,spinner_q2_p.selectedItem as String,spinner_q3_p.selectedItem as String,spinner_q4_p.selectedItem as String,spinner_q5_p.selectedItem as String,
                spinner_q1_o.selectedItem as String,spinner_q2_o.selectedItem as String,spinner_q3_o.selectedItem as String,spinner_q4_o.selectedItem as String,spinner_q5_o.selectedItem as String)

        val intent = Intent(this,MakingStatusActivity::class.java)
        intent.putExtra(PLAYER_NAME,playerName)
        intent.putExtra(CONTACT,calcAbility.contact)
        intent.putExtra(POWER,calcAbility.power)
        intent.putExtra(SPEED,calcAbility.speed)
        intent.putExtra(ARM,calcAbility.armStrength)
        intent.putExtra(FIELDING,calcAbility.fielding)

        intent.putExtra(CHANCE,calcAbility.chance)

        startActivity(intent)

    }

}