package com.websarva.wings.android.abiityofbaseball.activity

import android.os.Bundle
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.fragment.FielderListFragment

class DisplaySavedPlayerActivity : BaseOptionMenuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_saved_player)


        val fielderListFrag = FielderListFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_list, fielderListFrag)
        transaction.commit()
    }
}