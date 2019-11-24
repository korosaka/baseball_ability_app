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
    fun onClickAppStart(view: View) {

        // 今回機能として作成選手の確認は無いため、飛ばす
//        val intent = Intent(this,SelectOptionActivity::class.java)
        val intent = Intent(this, SelectPlayerTypeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
