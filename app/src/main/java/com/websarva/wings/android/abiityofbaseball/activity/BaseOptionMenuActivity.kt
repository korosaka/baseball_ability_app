package com.websarva.wings.android.abiityofbaseball.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.fragment.PrivacyPolicyFragment

abstract class BaseOptionMenuActivity : AppCompatActivity() {


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu_list, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.policy -> {
                val dialog = PrivacyPolicyFragment.newInstance(Constants.CLOSE)
                dialog.show(supportFragmentManager, Constants.PRIVACY_POLICY)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}