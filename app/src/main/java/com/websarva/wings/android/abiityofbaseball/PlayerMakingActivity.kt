package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Spinner

class PlayerMakingActivity : AppCompatActivity(){

    companion object {
        const val PLAYER_NAME = "playerName"
        const val CONTACT = "contact_status"
        const val POWER = "power_status"
        const val SPEED = "speed_status"
        const val ARM = "arm_status"
        const val FIELDING = "fielding_status"

    }


    private val fragmentA:Fragment = QuestionOfAppearanceFragment.newInstance("a","b")
    private val fragmentP:Fragment = QuestionOfPersonalityFragment.newInstance("a","b")
    private val fragmentO:Fragment = QuestionOfOtherFragment.newInstance("a","b")



    val calcAbility = CalcAbility()

    var playerName:String? = null
    var sex_id:Int? = null


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

        val spinnerQ1_A = findViewById<Spinner>(R.id.spinner_q1_a) as Spinner
        val spinnerQ2_A = findViewById<Spinner>(R.id.spinner_q2_a) as Spinner
        val spinnerQ3_A = findViewById<Spinner>(R.id.spinner_q3_a) as Spinner
        val spinnerQ4_A = findViewById<Spinner>(R.id.spinner_q4_a) as Spinner

        val spinnerQ1_P = findViewById<Spinner>(R.id.spinner_q1_p) as Spinner
        val spinnerQ2_P = findViewById<Spinner>(R.id.spinner_q2_p) as Spinner
        val spinnerQ3_P = findViewById<Spinner>(R.id.spinner_q3_p) as Spinner
        val spinnerQ4_P = findViewById<Spinner>(R.id.spinner_q4_p) as Spinner

        val spinnerQ1_O = findViewById<Spinner>(R.id.spinner_q1_o) as Spinner
        val spinnerQ2_O = findViewById<Spinner>(R.id.spinner_q2_o) as Spinner
        val spinnerQ3_O = findViewById<Spinner>(R.id.spinner_q3_o) as Spinner
        val spinnerQ4_O = findViewById<Spinner>(R.id.spinner_q4_o) as Spinner



        calcAbility.tall = Integer.parseInt(spinnerQ1_A.selectedItem as String)
        calcAbility.bodyShape = Integer.parseInt(spinnerQ2_A.selectedItem as String)
        calcAbility.muscle = Integer.parseInt(spinnerQ3_A.selectedItem as String)
        calcAbility.looks = Integer.parseInt(spinnerQ4_A.selectedItem as String)

        calcAbility.kindness = Integer.parseInt(spinnerQ1_P.selectedItem as String)
        calcAbility.reliable = Integer.parseInt(spinnerQ2_P.selectedItem as String)
        calcAbility.attitude = Integer.parseInt(spinnerQ3_P.selectedItem as String)
        calcAbility.intelligence = Integer.parseInt(spinnerQ4_P.selectedItem as String)

        calcAbility.popularWithOpposite = Integer.parseInt(spinnerQ1_O.selectedItem as String)
        calcAbility.popularWithSame = Integer.parseInt(spinnerQ2_O.selectedItem as String)
        calcAbility.clutch = Integer.parseInt(spinnerQ3_O.selectedItem as String)
        calcAbility.favorabilityFromYou = Integer.parseInt(spinnerQ4_O.selectedItem as String)

        calcAbility.calcAbility()

        val intent = Intent(this,MakingStatusActivity::class.java)
        intent.putExtra(PLAYER_NAME,playerName)
        intent.putExtra(CONTACT,calcAbility.contact)
        intent.putExtra(POWER,calcAbility.power)
        intent.putExtra(SPEED,calcAbility.speed)
        intent.putExtra(ARM,calcAbility.armStrength)
        intent.putExtra(FIELDING,calcAbility.fielding)

        startActivity(intent)

    }

}