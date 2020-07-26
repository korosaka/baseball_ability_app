package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.websarva.wings.android.abiityofbaseball.R

class SelectOptionActivity : BaseOptionMenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)
    }

    // 選手をつくるボタンクリックで画面遷移
    fun onClickStartMaking(view: View) {

        val intent = Intent(this, SelectPlayerTypeActivity::class.java)
        startActivity(intent)

    }
}