package com.websarva.wings.android.abiityofbaseball.activity

import android.os.Bundle
import android.view.View
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.fragment.FielderListFragment
import com.websarva.wings.android.abiityofbaseball.fragment.PitcherListFragment

class DisplaySavedPlayerActivity : BaseOptionMenuActivity() {

    private lateinit var fielderListFrag: FielderListFragment
    private lateinit var pitcherListFrag: PitcherListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_saved_player)


        fielderListFrag = FielderListFragment()
        pitcherListFrag = PitcherListFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_list, fielderListFrag)
        transaction.add(R.id.frame_for_player_list, pitcherListFrag)
        transaction.commit()
        showHideFragment(Constants.TYPE_FIELDER)
    }

    private fun showHideFragment(fragmentName: String) {

        val transaction = supportFragmentManager.beginTransaction()

        when (fragmentName) {
            Constants.TYPE_FIELDER -> {
                transaction.show(fielderListFrag)
                transaction.hide(pitcherListFrag)
            }
            Constants.TYPE_PITCHER -> {
                transaction.show(pitcherListFrag)
                transaction.hide(fielderListFrag)
            }
        }

        transaction.commit()
    }

    fun onFielderClick(view: View) {
        showHideFragment(Constants.TYPE_FIELDER)
    }

    fun onPitcherClick(view: View) {
        showHideFragment(Constants.TYPE_PITCHER)
    }

}