package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.UtilisingDB
import com.websarva.wings.android.abiityofbaseball.fragment.PrivacyPolicyFragment

class TopActivity : BaseOptionMenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)

        if (!PrivacyPolicyFragment.isPolicyAgreed(this)) showPrivacyPolicy()

        // TODO test
        val db = UtilisingDB(this, applicationContext)
        db.getFielders()
        db.getPitcher()
    }

    // はじめるボタンクリックで画面遷移
    fun onClickAppStart(view: View) {

        // 今回機能として作成選手の確認は無いため、飛ばす
//        val intent = Intent(this,SelectOptionActivity::class.java)
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
}
