package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View

class PlayerMakingActivity : AppCompatActivity(){

    private val fragmentA:Fragment = QuestionOfAppearanceFragment.newInstance("a","b")
    private val fragmentP:Fragment = QuestionOfPersonalityFragment.newInstance("a","b")
    private val fragmentO:Fragment = QuestionOfOtherFragment.newInstance("a","b")

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

}