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

        nameDisplay.setText(player.getName())
        contactDisplay.setText(player.getContact())
        powerDisplay.setText(player.getPower())
        speedDisplay.setText(player.getSpeed())
        armDisplay.setText(player.getArm())
        fieldDisplay.setText(player.getFielding())





    }
}
