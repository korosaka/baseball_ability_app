package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.fragment.PrivacyPolicyFragment

class TopActivity : BaseOptionMenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)

        if (!PrivacyPolicyFragment.isPolicyAgreed(this)) showPrivacyPolicy()
    }

    // はじめるボタンクリックで画面遷移
    fun onClickAppStart(view: View) {

        val intent = Intent(this, SelectPlayerTypeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun onClickSeeData(view: View) {

        val intent = Intent(this, DisplaySavedPlayerActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showPrivacyPolicy() {
        val policyDialog = PrivacyPolicyFragment.newInstance(Constants.AGREE)
        policyDialog.show(supportFragmentManager, Constants.PRIVACY_POLICY)
    }

    override fun keyBackFunction() {
        finishApp()
    }

    private fun finishApp() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(resources.getString(R.string.ask_finish_app))
        // _ means argument which is never used
        builder.setPositiveButton(resources.getString(R.string.yes)) { _, _ ->
            finish()
        }
        builder.setNegativeButton(resources.getString(R.string.cancel), null)
        builder.show()
    }

}
