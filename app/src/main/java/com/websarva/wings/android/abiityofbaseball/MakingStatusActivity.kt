package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MakingStatusActivity : AppCompatActivity() {

    companion object {
        const val PLAYER_NAME = "playerName"
        const val CONTACT = "contact_status"
        const val POWER = "power_status"
        const val SPEED = "speed_status"
        const val ARM = "arm_status"
        const val FIELDING = "fielding_status"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_status)


        val player = PlayerClass(
                intent.getStringExtra(PLAYER_NAME),
                intent.getIntExtra(CONTACT,0),
                intent.getIntExtra(POWER,0),
                intent.getIntExtra(SPEED,0),
                intent.getIntExtra(ARM,0),
                intent.getIntExtra(FIELDING,0)
        )



        val nameDisplay = findViewById<TextView>(R.id.name_display)
        val contactDisplay = findViewById<TextView>(R.id.contact_display)
        val powerDisplay = findViewById<TextView>(R.id.power_display)
        val speedDisplay = findViewById<TextView>(R.id.speed_display)
        val armDisplay = findViewById<TextView>(R.id.arm_display)
        val fieldDisplay = findViewById<TextView>(R.id.field_display)

        nameDisplay.setText(player.playerName)
        contactDisplay.setText(player.contact_lank)
        powerDisplay.setText(player.power_lank)
        speedDisplay.setText(player.speed_lank)
        armDisplay.setText(player.arm_lank)
        fieldDisplay.setText(player.fielding_lank)

        calcStats(player)

    }

    fun calcStats(player:PlayerClass){

        val ave = player.contact_ability *3
        val hr = player.power_ability
        val rbi = player.contact_ability + player.power_ability
        val sb = player.speed_ability

        val ave_dis = findViewById<TextView>(R.id.average_display)
        val hr_dis = findViewById<TextView>(R.id.homer_display)
        val rbi_dis = findViewById<TextView>(R.id.rbi_display)
        val sb_dis = findViewById<TextView>(R.id.steel_display)

        ave_dis.setText(Integer.toString(ave))
        hr_dis.setText(Integer.toString(hr))
        rbi_dis.setText(Integer.toString(rbi))
        sb_dis.setText(Integer.toString(sb))


    }
}
