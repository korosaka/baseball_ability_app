package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_making_status.*

class MakingStatusPitcherActivity : AppCompatActivity() {

    companion object {
        const val PLAYER_NAME = "playerName"
        const val BALL_SPEED = "ballSpeed_status"
        const val CONTROL = "control_status"
        const val STAMINA = "stamina_status"
        const val KIND_CHANGE = "kindsOfChangeBall_status"
        const val AMOUNT_CHANGE = "amountOfChangeBall_status"
        const val PRIORITY_CHANGE = "priorityOfChangeBall"

        const val CHANCE = "chance"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_status_pitcher)


        // 広告処理
        MobileAds.initialize(this,"ca-app-pub-6298264304843789~4492140864")
        val adRequest = AdRequest.Builder().build()
        adView_status.loadAd(adRequest)

        val playerPitcher = PlayerPitcherClass(
                intent.getStringExtra(MakingStatusPitcherActivity.PLAYER_NAME),
                intent.getIntExtra(MakingStatusPitcherActivity.BALL_SPEED,0),
                intent.getIntExtra(MakingStatusPitcherActivity.CONTROL,0),
                intent.getIntExtra(MakingStatusPitcherActivity.STAMINA,0),
                intent.getIntExtra(MakingStatusPitcherActivity.KIND_CHANGE,0),
                intent.getIntExtra(MakingStatusPitcherActivity.AMOUNT_CHANGE,0),
                intent.getIntegerArrayListExtra(MakingStatusPitcherActivity.PRIORITY_CHANGE),
                intent.getDoubleExtra(MakingStatusPitcherActivity.CHANCE,1.0)
        )

    }

}
