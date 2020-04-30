package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_making_status.*

class MakingStatusActivity : AppCompatActivity() {

    companion object {
        const val PLAYER_NAME = "playerName"
        const val CONTACT = "contact_status"
        const val POWER = "power_status"
        const val SPEED = "speed_status"
        const val ARM = "arm_status"
        const val FIELDING = "fielding_status"

        const val CHANCE = "chance"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_making_status)

        // 広告処理
        MobileAds.initialize(this,"ca-app-pub-6298264304843789~4492140864")
        val adRequest = AdRequest.Builder().build()
        adView_status.loadAd(adRequest)

        val player = PlayerClass(
                intent.getStringExtra(PLAYER_NAME),
                intent.getIntExtra(CONTACT,0),
                intent.getIntExtra(POWER,0),
                intent.getIntExtra(SPEED,0),
                intent.getIntExtra(ARM,0),
                intent.getIntExtra(FIELDING,0),
                intent.getDoubleExtra(CHANCE,1.0)
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

    /**
     * 能力から成績を算出
     */
    fun calcStats(player:PlayerClass){

        var ave = 85 + (player.contact_ability * 4.5).toInt() + (player.power_ability * 0.45).toInt() + (player.speed_ability * 0.15).toInt()
        if(ave < 150) {
            ave = 120 + (ave * 0.3).toInt()
        } else if (ave < 200) {
            ave = 150 + (ave * 0.3).toInt()
        } else if (ave > 300) {
            ave = ((ave - 300) * 0.5).toInt() + 300
        }
        var hr = ((player.power_ability * 0.8) + (player.contact_ability * 0.1)).toInt() - 35
        if (hr < 0){
            hr = (player.power_ability * 0.1).toInt()
        } else {
          hr += 10
        }
        var rbi = (((player.contact_ability * 0.7) + (player.power_ability * 0.8)) * player.chance).toInt()
        if (rbi < 0){
            rbi = 1
        } else if (rbi < 30){
            rbi = (rbi * 0.5).toInt()
        } else if (rbi < 50){
            rbi = (rbi * 0.65).toInt()
        } else if (rbi < 70){
            rbi = (rbi * 0.8).toInt()
        }
        if(rbi < hr){
            rbi = hr
        }
        var sb = (player.speed_ability * 0.8).toInt() -25
        if (sb < -10){
            sb = (player.speed_ability * 0.1).toInt()
        } else if (sb < 5){
            sb = (player.speed_ability * 0.1).toInt() + 1
        }
        else if (sb > 30){
            sb = (sb * 1.1).toInt()
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

        calcSaraly(ave,hr,rbi, sb, player)

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

    /**
     * 成績・能力から年俸算出
     */
    fun calcSaraly(ave : Int,hr : Int,rbi : Int,sb : Int,player: PlayerClass){
        var salaryPoint = 0
        var salary = 0
        when(ave){
            in 0..199 -> salaryPoint += ave
            in 200..224 -> salaryPoint += ave * 2
            in 225..249 -> salaryPoint += ave * 4
            in 250..274 -> salaryPoint += ave * 8
            in 275..299 -> salaryPoint += ave * 15
            in 300..332 -> salaryPoint += ave * 25
            in 333..349 -> salaryPoint += ave * 35
            in 350..399 -> salaryPoint += ave * 45
            else -> salaryPoint += ave * 50
        }
        when(hr){
            in 0..9 -> salaryPoint += hr * 70
            in 10..14 -> salaryPoint += hr * 130
            in 15..19 -> salaryPoint += hr * 160
            in 20..24 -> salaryPoint += hr * 220
            in 25..29 -> salaryPoint += hr * 250
            in 30..39 -> salaryPoint += hr * 360
            in 40..49 -> salaryPoint += hr * 450
            else -> salaryPoint += hr * 500
        }
        when(rbi){
            in 0..9 -> salaryPoint += rbi * 10
            in 10..19 -> salaryPoint += rbi * 15
            in 20..39 -> salaryPoint += rbi * 20
            in 40..59 -> salaryPoint += rbi * 25
            in 60..79 -> salaryPoint += rbi * 30
            in 80..99 -> salaryPoint += rbi * 35
            in 100..129 -> salaryPoint += rbi * 50
            else -> salaryPoint += rbi * 60
        }
        when(sb){
            in 0..3 -> salaryPoint += sb * 10
            in 4..9 -> salaryPoint += sb * 25
            in 10..19 -> salaryPoint += sb * 50
            in 20..29 -> salaryPoint += sb * 80
            in 30..39 -> salaryPoint += sb * 120
            else -> salaryPoint += sb * 150
        }
        salaryPoint += ((player.speed_ability * 0.15) * (player.arm_ability * 0.3) * (player.fielding_ability * 1.2)).toInt()

        when(salaryPoint){
            in 0..240 -> salary = 240
            in 241..4999 -> salary = (salaryPoint/10) * 10
            in 5000..9999 -> salary = (salaryPoint/100) * 100
            else -> salary = (salaryPoint/1000) * 1000
        }

        if (salary < 10000){
            oku_unit.visibility = View.GONE
            man_number.text = Integer.toString(salary)
        } else{
            var okuNumber = 0
            while (salary >= 10000) {
                salary -= 10000
                okuNumber++
            }
            oku_number.text = Integer.toString(okuNumber)

            if (salary == 0){
                man_unit.visibility = View.GONE
            } else {
                man_number.text = Integer.toString(salary)
            }
        }


    }

    // Topへ戻る
    fun onClickFinish(view : View){

        val intent = Intent(this,TopActivity::class.java)
        startActivity(intent)
        finish()
    }

}
