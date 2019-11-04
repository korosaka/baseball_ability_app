package com.websarva.wings.android.abiityofbaseball

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
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

        val nameDisplay = findViewById<TextView>(R.id.name_display_p)
        val ballSpeedDisplay = findViewById<TextView>(R.id.ball_speed_display)
        val controlDisplay = findViewById<TextView>(R.id.control_display)
        val staminaDisplay = findViewById<TextView>(R.id.stamina_display)

        // 各変化球
        var sliderDisplay: Array<TextView?> = arrayOfNulls(7)
        sliderDisplay[0] = findViewById<TextView>(R.id.slider_1)
        sliderDisplay[1] = findViewById<TextView>(R.id.slider_2)
        sliderDisplay[2] = findViewById<TextView>(R.id.slider_3)
        sliderDisplay[3] = findViewById<TextView>(R.id.slider_4)
        sliderDisplay[4] = findViewById<TextView>(R.id.slider_5)
        sliderDisplay[5] = findViewById<TextView>(R.id.slider_6)
        sliderDisplay[6] = findViewById<TextView>(R.id.slider_7)

        var curbDisplay: Array<TextView?> = arrayOfNulls(7)
        curbDisplay[0] = findViewById<TextView>(R.id.curb_1)
        curbDisplay[1] = findViewById<TextView>(R.id.curb_2)
        curbDisplay[2] = findViewById<TextView>(R.id.curb_3)
        curbDisplay[3] = findViewById<TextView>(R.id.curb_4)
        curbDisplay[4] = findViewById<TextView>(R.id.curb_5)
        curbDisplay[5] = findViewById<TextView>(R.id.curb_6)
        curbDisplay[6] = findViewById<TextView>(R.id.curb_7)

        var forkDisplay: Array<TextView?> = arrayOfNulls(7)
        forkDisplay[0] = findViewById<TextView>(R.id.fork_1)
        forkDisplay[1] = findViewById<TextView>(R.id.fork_2)
        forkDisplay[2] = findViewById<TextView>(R.id.fork_3)
        forkDisplay[3] = findViewById<TextView>(R.id.fork_4)
        forkDisplay[4] = findViewById<TextView>(R.id.fork_5)
        forkDisplay[5] = findViewById<TextView>(R.id.fork_6)
        forkDisplay[6] = findViewById<TextView>(R.id.fork_7)

        var sinkerDisplay: Array<TextView?> = arrayOfNulls(7)
        sinkerDisplay[0] = findViewById<TextView>(R.id.sinker_1)
        sinkerDisplay[1] = findViewById<TextView>(R.id.sinker_2)
        sinkerDisplay[2] = findViewById<TextView>(R.id.sinker_3)
        sinkerDisplay[3] = findViewById<TextView>(R.id.sinker_4)
        sinkerDisplay[4] = findViewById<TextView>(R.id.sinker_5)
        sinkerDisplay[5] = findViewById<TextView>(R.id.sinker_6)
        sinkerDisplay[6] = findViewById<TextView>(R.id.sinker_7)

        var shootDisplay: Array<TextView?> = arrayOfNulls(7)
        shootDisplay[0] = findViewById<TextView>(R.id.shoot_1)
        shootDisplay[1] = findViewById<TextView>(R.id.shoot_2)
        shootDisplay[2] = findViewById<TextView>(R.id.shoot_3)
        shootDisplay[3] = findViewById<TextView>(R.id.shoot_4)
        shootDisplay[4] = findViewById<TextView>(R.id.shoot_5)
        shootDisplay[5] = findViewById<TextView>(R.id.shoot_6)
        shootDisplay[6] = findViewById<TextView>(R.id.shoot_7)

        var changeDisplays = Array(5, {arrayOfNulls<TextView>(7)})
        changeDisplays[0] = sliderDisplay
        changeDisplays[1] = curbDisplay
        changeDisplays[2] = forkDisplay
        changeDisplays[3] = sinkerDisplay
        changeDisplays[4] = shootDisplay


        nameDisplay.setText(playerPitcher.playerName)
        ballSpeedDisplay.setText(playerPitcher.max_speed)
        controlDisplay.setText(playerPitcher.control_lank)
        staminaDisplay.setText(playerPitcher.stamina_lank)

        var colors = Array(5, {arrayOfNulls<Int>(7)})

        var sliderColors: Array<Int?> = arrayOfNulls(7)
        sliderColors[0] = Color.parseColor("#ffefef")
        sliderColors[1] = Color.parseColor("#ffe0e0")
        sliderColors[2] = Color.parseColor("#ffc6c6")
        sliderColors[3] = Color.parseColor("#ffa3a3")
        sliderColors[4] = Color.parseColor("#ff7f7f")
        sliderColors[5] = Color.parseColor("#ff3d3d")
        sliderColors[6] = Color.parseColor("#ff0000")

        var curbColors: Array<Int?> = arrayOfNulls(7)
        curbColors[0] = Color.parseColor("#fff7ef")
        curbColors[1] = Color.parseColor("#ffefe0")
        curbColors[2] = Color.parseColor("#ffe2c6")
        curbColors[3] = Color.parseColor("#ffd1a3")
        curbColors[4] = Color.parseColor("#ffbf7f")
        curbColors[5] = Color.parseColor("#ff9e3d")
        curbColors[6] = Color.parseColor("#ff7f00")

        var forkColors: Array<Int?> = arrayOfNulls(7)
        forkColors[0] = Color.parseColor("#ffffef")
        forkColors[1] = Color.parseColor("#ffffe0")
        forkColors[2] = Color.parseColor("#ffffc6")
        forkColors[3] = Color.parseColor("#ffffa3")
        forkColors[4] = Color.parseColor("#ffff7f")
        forkColors[5] = Color.parseColor("#ffff3d")
        forkColors[6] = Color.parseColor("#ffff00")

        var sinkerColors: Array<Int?> = arrayOfNulls(7)
        sinkerColors[0] = Color.parseColor("#efffef")
        sinkerColors[1] = Color.parseColor("#e0ffe0")
        sinkerColors[2] = Color.parseColor("#c6ffc6")
        sinkerColors[3] = Color.parseColor("#a3ffa3")
        sinkerColors[4] = Color.parseColor("#7fff7f")
        sinkerColors[5] = Color.parseColor("#3dff3d")
        sinkerColors[6] = Color.parseColor("#00ff00")

        var shootColors: Array<Int?> = arrayOfNulls(7)
        shootColors[0] = Color.parseColor("#efffff")
        shootColors[1] = Color.parseColor("#e0ffff")
        shootColors[2] = Color.parseColor("#c6ffff")
        shootColors[3] = Color.parseColor("#a3ffff")
        shootColors[4] = Color.parseColor("#7fffff")
        shootColors[5] = Color.parseColor("#3dffff")
        shootColors[6] = Color.parseColor("#00ffff")


        colors[0] = sliderColors
        colors[1] = curbColors
        colors[2] = forkColors
        colors[3] = sinkerColors
        colors[4] = shootColors


        for (changeKindIndex in 0..(playerPitcher.changeballs.size - 1)) {

            for (changeAmountIndex in 0..(playerPitcher.changeballs[changeKindIndex] - 1)){

                changeDisplays[changeKindIndex][changeAmountIndex]!!.setBackgroundColor(colors[changeKindIndex][changeAmountIndex]!!)
            }
        }


    }

}
