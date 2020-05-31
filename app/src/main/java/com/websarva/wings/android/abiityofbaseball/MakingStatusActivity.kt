package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_making_status.*

class MakingStatusActivity : BaseBannerActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_making_status)
        setAdViewContainer(ad_view_container_on_making_status_batter)
        super.onCreate(savedInstanceState)

        val player = PlayerClass(
                intent.getStringExtra(Constants.PLAYER_NAME),
                intent.getIntExtra(Constants.CONTACT, 0),
                intent.getIntExtra(Constants.POWER, 0),
                intent.getIntExtra(Constants.SPEED, 0),
                intent.getIntExtra(Constants.ARM_STRENGTH, 0),
                intent.getIntExtra(Constants.FIELDING, 0),
                intent.getIntExtra(Constants.CATCHING, 0),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )


        name_display.text = player.playerName
        // TODO ポジションで条件分岐
        name_display.setBackgroundColor(Color.YELLOW)

        // 字数でサイズ変更
        var fontCount = name_display.length()
        when (fontCount) {
            in 0..4 -> name_display.width = 500
            in 5..6 -> name_display.width = 700
            else -> name_display.width = 900
        }


        contact_display.text = player.contactLank
        power_display.text = player.powerLank
        speed_display.text = player.speedLank
        arm_display.text = player.armLank
        field_display.text = player.fieldingLank
        catching_display.text = player.catchingLank

        setTextColor(contact_display)
        setTextColor(power_display)
        setTextColor(speed_display)
        setTextColor(arm_display)
        setTextColor(field_display)
        setTextColor(catching_display)


        calcStats(player)

    }

    /**
     * 能力から成績を算出
     */
    fun calcStats(player: PlayerClass) {

        var ave = 85 + (player.contactAbility * 4.5).toInt() + (player.powerAbility * 0.45).toInt() + (player.speedAbility * 0.15).toInt()
        if (ave < 150) {
            ave = 120 + (ave * 0.3).toInt()
        } else if (ave < 200) {
            ave = 150 + (ave * 0.3).toInt()
        } else if (ave > 300) {
            ave = ((ave - 300) * 0.5).toInt() + 300
        }
        var hr = ((player.powerAbility * 0.8) + (player.contactAbility * 0.1)).toInt() - 35
        if (hr < 0) {
            hr = (player.powerAbility * 0.1).toInt()
        } else {
            hr += 10
        }
        var rbi = (((player.contactAbility * 0.7) + (player.powerAbility * 0.8)) * player.chance).toInt()
        if (rbi < 0) {
            rbi = 1
        } else if (rbi < 30) {
            rbi = (rbi * 0.5).toInt()
        } else if (rbi < 50) {
            rbi = (rbi * 0.65).toInt()
        } else if (rbi < 70) {
            rbi = (rbi * 0.8).toInt()
        }
        if (rbi < hr) {
            rbi = hr
        }
        var sb = (player.speedAbility * 0.8).toInt() - 25
        if (sb < -10) {
            sb = (player.speedAbility * 0.1).toInt()
        } else if (sb < 5) {
            sb = (player.speedAbility * 0.1).toInt() + 1
        } else if (sb > 30) {
            sb = (sb * 1.1).toInt()
        }


        val ave_dis = findViewById<TextView>(R.id.average_display)
        val hr_dis = findViewById<TextView>(R.id.homer_display)
        val rbi_dis = findViewById<TextView>(R.id.rbi_display)
        val sb_dis = findViewById<TextView>(R.id.steel_display)

        // 打率表示
        var ave_string: String? = null
        if (ave < 100) {
            ave_string = "." + "0" + Integer.toString(ave)
        } else {
            ave_string = "." + Integer.toString(ave)
        }
        ave_dis.text = ave_string

        // HR表示
        val hr_string = Integer.toString(hr) + "本"
        hr_dis.text = hr_string

        // 打点表示
        val rbi_string = Integer.toString(rbi) + "点"
        rbi_dis.text = rbi_string

        // 盗塁表示
        val sb_string = Integer.toString(sb) + "個"
        sb_dis.text = sb_string

        calcSaraly(ave, hr, rbi, sb, player)

    }

    fun setTextColor(alphabet: TextView) {

        when (alphabet.text) {
            Constants.LANK_A -> alphabet.setTextColor(Color.parseColor(Constants.LANK_A_COLOR))
            Constants.LANK_B -> alphabet.setTextColor(Color.parseColor(Constants.LANK_B_COLOR))
            Constants.LANK_C -> alphabet.setTextColor(Color.parseColor(Constants.LANK_C_COLOR))
            Constants.LANK_D -> alphabet.setTextColor(Color.parseColor(Constants.LANK_D_COLOR))
            Constants.LANK_E -> alphabet.setTextColor(Color.parseColor(Constants.LANK_E_COLOR))
            Constants.LANK_F -> alphabet.setTextColor(Color.parseColor(Constants.LANK_F_COLOR))
            Constants.LANK_G -> alphabet.setTextColor(Color.parseColor(Constants.LANK_G_COLOR))
        }
    }

    /**
     * 成績・能力から年俸算出
     */
    fun calcSaraly(ave: Int, hr: Int, rbi: Int, sb: Int, player: PlayerClass) {
        var salaryPoint = 0
        var salary = 0
        when (ave) {
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
        when (hr) {
            in 0..9 -> salaryPoint += hr * 70
            in 10..14 -> salaryPoint += hr * 130
            in 15..19 -> salaryPoint += hr * 160
            in 20..24 -> salaryPoint += hr * 220
            in 25..29 -> salaryPoint += hr * 250
            in 30..39 -> salaryPoint += hr * 360
            in 40..49 -> salaryPoint += hr * 450
            else -> salaryPoint += hr * 500
        }
        when (rbi) {
            in 0..9 -> salaryPoint += rbi * 10
            in 10..19 -> salaryPoint += rbi * 15
            in 20..39 -> salaryPoint += rbi * 20
            in 40..59 -> salaryPoint += rbi * 25
            in 60..79 -> salaryPoint += rbi * 30
            in 80..99 -> salaryPoint += rbi * 35
            in 100..129 -> salaryPoint += rbi * 50
            else -> salaryPoint += rbi * 60
        }
        when (sb) {
            in 0..3 -> salaryPoint += sb * 10
            in 4..9 -> salaryPoint += sb * 25
            in 10..19 -> salaryPoint += sb * 50
            in 20..29 -> salaryPoint += sb * 80
            in 30..39 -> salaryPoint += sb * 120
            else -> salaryPoint += sb * 150
        }
        salaryPoint += ((player.speedAbility * 0.15) * (player.armAbility * 0.3) * (player.fieldingAbility * 1.2)).toInt()

        when (salaryPoint) {
            in 0..440 -> salary = 440
            in 441..4999 -> salary = (salaryPoint / 10) * 10
            in 5000..9999 -> salary = (salaryPoint / 100) * 100
            else -> salary = (salaryPoint / 1000) * 1000
        }

        if (salary < 10000) {
            oku_unit.visibility = View.GONE
            man_number.text = Integer.toString(salary)
        } else {
            var okuNumber = 0
            while (salary >= 10000) {
                salary -= 10000
                okuNumber++
            }
            oku_number.text = Integer.toString(okuNumber)

            if (salary == 0) {
                man_unit.visibility = View.GONE
            } else {
                man_number.text = Integer.toString(salary)
            }
        }


    }

    // Topへ戻る
    fun onClickFinish(view: View) {

        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }

}
