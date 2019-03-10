package com.websarva.wings.android.abiityofbaseball

import android.graphics.Color
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
        // TODO ポジションで条件分岐
        nameDisplay.setBackgroundColor(Color.YELLOW)

        // 字数でサイズ変更
        var fontCount = nameDisplay.length()
        when(fontCount){
            in 0..4 -> nameDisplay.width = 500
            in 5..6 -> nameDisplay.width = 700
            else -> nameDisplay.width = 900
        }


        contactDisplay.setText(player.contact_lank)
        powerDisplay.setText(player.power_lank)
        speedDisplay.setText(player.speed_lank)
        armDisplay.setText(player.arm_lank)
        fieldDisplay.setText(player.fielding_lank)

        setTextColor(contactDisplay)
        setTextColor(powerDisplay)
        setTextColor(speedDisplay)
        setTextColor(armDisplay)
        setTextColor(fieldDisplay)


        calcStats(player)

    }

    fun calcStats(player:PlayerClass){

        var ave = 85 + (player.contact_ability * 4.5).toInt() + (player.power_ability * 0.5).toInt() + (player.speed_ability * 0.2).toInt()
        if(ave < 150) {
            ave = 120 + (ave * 0.3).toInt()
        } else if (ave < 200) {
            ave = 150 + (ave * 0.3).toInt()
        } else if (ave > 300) {
            ave = ((ave - 300) * 0.5).toInt() + 300
        }
        var hr = ((player.power_ability * 0.85) + (player.contact_ability * 0.15)).toInt() - 35
        if (hr < 0){
            hr = (player.power_ability * 0.1).toInt()
        } else {
          hr += 10
        }
        var rbi = ((player.contact_ability * 0.9) + (player.power_ability * 0.9)).toInt()
        if (rbi < 0){
            rbi = 0
        }
        var sb = (player.speed_ability * 0.8).toInt() -25
        if (sb < 0){
            sb = (player.speed_ability * 0.2).toInt() + 1
        } else {
            sb += 3
        }


        val ave_dis = findViewById<TextView>(R.id.average_display)
        val hr_dis = findViewById<TextView>(R.id.homer_display)
        val rbi_dis = findViewById<TextView>(R.id.rbi_display)
        val sb_dis = findViewById<TextView>(R.id.steel_display)

        // 打率表示
        var ave_string:String? = null
        if (ave < 100){
            ave_string = "." + "0" + Integer.toString(ave)
        } else {
            ave_string = "." + Integer.toString(ave)
        }
        ave_dis.setText(ave_string)

        // HR表示
        val hr_string = Integer.toString(hr) + "本"
        hr_dis.setText(hr_string)

        // 打点表示
        val rbi_string = Integer.toString(rbi) + "点"
        rbi_dis.setText(rbi_string)

        // 盗塁表示
        val sb_string = Integer.toString(sb) + "個"
        sb_dis.setText(sb_string)


    }

    fun setTextColor(alphabet:TextView){

        when(alphabet.text){
            "A" -> alphabet.setTextColor(Color.parseColor("#ff1493"))
            "B" -> alphabet.setTextColor(Color.parseColor("#ff0000"))
            "C" -> alphabet.setTextColor(Color.parseColor("#ffa500"))
            "D" -> alphabet.setTextColor(Color.parseColor("#ffff00"))
            "E" -> alphabet.setTextColor(Color.parseColor("#7cfc00"))
            "F" -> alphabet.setTextColor(Color.parseColor("#00ffff"))
            "G" -> alphabet.setTextColor(Color.parseColor("#696969"))

        }
    }
}
