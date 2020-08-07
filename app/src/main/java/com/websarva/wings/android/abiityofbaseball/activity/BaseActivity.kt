package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && event!!.action == KeyEvent.ACTION_DOWN) {
            keyBackFunction()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    abstract fun keyBackFunction()

    protected fun backToTop() {
        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }
}