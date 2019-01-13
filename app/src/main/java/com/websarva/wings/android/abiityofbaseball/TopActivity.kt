package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class TopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
    }

    // はじめるボタンクリックで画面遷移
    fun onClickAppStart(view : View){

        val intent = Intent(this,SelectTypeActivity::class.java)
        startActivity(intent)

    }
}
