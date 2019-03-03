package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class SelectPlayerTypeActivity : AppCompatActivity(){

    companion object {
        const val PLAYER_NAME = "playerName"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_player_type)

    }

    // 選手をつくるボタンクリックで画面遷移
    fun onClickSelectFielder(view : View){

        val editText = findViewById<EditText>(R.id.player_name) as EditText
        val playerName = editText.text.toString()

        if(playerName.isNotEmpty()){

            val intent = Intent(this,PlayerMakingActivity::class.java)

            intent.putExtra(PLAYER_NAME,playerName)

            startActivity(intent)

        }


    }


}