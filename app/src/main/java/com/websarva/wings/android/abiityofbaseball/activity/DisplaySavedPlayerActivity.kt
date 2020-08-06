package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.fragment.PlayerListFragment
import kotlinx.android.synthetic.main.activity_display_saved_player.*

class DisplaySavedPlayerActivity : BaseBannerActivity() {

    private lateinit var fielderListFrag: PlayerListFragment
    private lateinit var pitcherListFrag: PlayerListFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_display_saved_player)
        setAdViewContainer(ad_view_container_on_saved_player)
        super.onCreate(savedInstanceState)

        prepareFragment()
    }

    private fun prepareFragment() {
        fielderListFrag = PlayerListFragment.newInstance(Constants.TYPE_FIELDER)
        pitcherListFrag = PlayerListFragment.newInstance(Constants.TYPE_PITCHER)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_player_list, fielderListFrag)
        transaction.add(R.id.frame_for_player_list, pitcherListFrag)
        transaction.commit()
        showHideFragment(Constants.TYPE_FIELDER)
    }

    private fun showHideFragment(playerType: String) {

        val transaction = supportFragmentManager.beginTransaction()

        when (playerType) {
            Constants.TYPE_FIELDER -> {
                transaction.show(fielderListFrag)
                transaction.hide(pitcherListFrag)
                changeTabStatement(Constants.TYPE_FIELDER)
            }
            Constants.TYPE_PITCHER -> {
                transaction.show(pitcherListFrag)
                transaction.hide(fielderListFrag)
                changeTabStatement(Constants.TYPE_PITCHER)
            }
        }

        transaction.commit()
    }

    private fun changeTabStatement(selectedTab: String) {
        when (selectedTab) {
            Constants.TYPE_FIELDER -> {
                lightUpFielderTab()
                lightOffTab(pitcher_tab)
            }
            Constants.TYPE_PITCHER -> {
                lightUpPitcherTab()
                lightOffTab(fielder_tab)
            }
        }
    }

    private fun lightUpFielderTab() {
        fielder_tab.background =
                ResourcesCompat.getDrawable(resources, R.drawable.fielder_tab_background, null)
        fielder_tab.setTextColor(Color.parseColor("#ffffff"))
    }

    private fun lightUpPitcherTab() {
        pitcher_tab.background =
                ResourcesCompat.getDrawable(resources, R.drawable.pitcher_tab_background, null)
        pitcher_tab.setTextColor(Color.parseColor("#ffffff"))
    }

    private fun lightOffTab(tab: TextView) {
        tab.background =
                ResourcesCompat.getDrawable(resources, R.drawable.player_tab_unselected, null)
        tab.setTextColor(Color.parseColor("#cccccc"))
    }

    fun onFielderClick(view: View) {
        showHideFragment(Constants.TYPE_FIELDER)
    }

    fun onPitcherClick(view: View) {
        showHideFragment(Constants.TYPE_PITCHER)
    }

    fun onClickBackToTop(view: View) {
        backToTop()
    }

    private fun backToTop() {
        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }


}