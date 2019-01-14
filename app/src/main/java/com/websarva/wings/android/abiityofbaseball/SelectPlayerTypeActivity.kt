package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class SelectPlayerTypeActivity : AppCompatActivity(){

    companion object {
        const val EXTRA_TEXTDATA = "playerName"
    }

    private val editText = findViewById<EditText>(R.id.player_name) as EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_player_type)

    }

    // 選手をつくるボタンクリックで画面遷移
    fun onClickSelectFielder(view : View){

        if(editText != null){

            val playerName = editText.text.toString()

            val intent = Intent(this,PlayerMakingActivity::class.java)

            intent.putExtra(EXTRA_TEXTDATA,playerName)

            startActivity(intent)

        }


    }


}