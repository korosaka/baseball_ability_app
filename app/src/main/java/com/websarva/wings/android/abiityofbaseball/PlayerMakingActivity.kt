package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class PlayerMakingActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_making)


        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_fragment,QuestionOfAppearanceFragment.newInstance("a","b"))
        transaction.commit()


    }

}