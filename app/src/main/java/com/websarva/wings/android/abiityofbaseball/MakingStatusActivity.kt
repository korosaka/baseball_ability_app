package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_making_status.*

class MakingStatusActivity : BaseBannerActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_making_status)
        setAdViewContainer(ad_view_container_on_making_status_batter)
        super.onCreate(savedInstanceState)

        val player = makePlayer()

        displayPlayerInfo(player)
        calcRecord(player)

    }

    private fun makePlayer(): PlayerClass {
        return PlayerClass(
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
                intent.getStringExtra(Constants.POSITION)!!,
                intent.getIntExtra(Constants.BALLISTIC, 1),
                intent.getIntExtra(Constants.CONTACT, 0),
                intent.getIntExtra(Constants.POWER, 0),
                intent.getIntExtra(Constants.SPEED, 0),
                intent.getIntExtra(Constants.ARM_STRENGTH, 0),
                intent.getIntExtra(Constants.FIELDING, 0),
                intent.getIntExtra(Constants.CATCHING, 0),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }

    private fun displayPlayerInfo(player: PlayerClass) {
        displayPlayerName(player)
        displayPosition(player)
        displayAbility(player)
    }

    private fun displayPlayerName(player: PlayerClass) {
        name_display.text = player.playerName

        // 字数でサイズ変更
        when (name_display.length()) {
            2 -> name_display.text = (player.playerName[0] + Constants.HALF_SPACE + Constants.HALF_SPACE + player.playerName[1])
            3 -> name_display.text = (player.playerName[0] + Constants.HALF_SPACE + player.playerName[1] + Constants.HALF_SPACE + player.playerName[2])
            5 -> name_display.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 9.5F, resources.displayMetrics)
            6 -> name_display.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 8F, resources.displayMetrics)
            7 -> name_display.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6.8F, resources.displayMetrics)
            8 -> name_display.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6F, resources.displayMetrics)
        }

    }

    private fun displayPosition(player: PlayerClass) {
        when (player.mainPosition) {
            Constants.CATCHER -> {
                position_display.text = resources.getString(R.string.position_catcher)
                name_display.setBackgroundResource(R.drawable.catcher_name_background)
            }
            Constants.FIRST_BASE -> {
                position_display.text = resources.getString(R.string.position_first_base)
                name_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            Constants.SECOND_BASE -> {
                position_display.text = resources.getString(R.string.position_second_base)
                name_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            Constants.THIRD_BASE -> {
                position_display.text = resources.getString(R.string.position_third_base)
                name_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            Constants.SHORTSTOP -> {
                position_display.text = resources.getString(R.string.position_shortstop)
                name_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            Constants.OUTFIELD -> {
                position_display.text = resources.getString(R.string.position_outfield)
                name_display.setBackgroundResource(R.drawable.outfielder_name_background)
            }
        }
    }

    private fun displayAbility(player: PlayerClass) {
        ballistic_display.text = player.ballisticAbility.toString()
        setBallisticArrow(ballistic_arrow, player.ballisticAbility)
        setBallisticColor(ballistic_arrow, player.ballisticAbility)

        contact_display.text = player.contactLank
        power_display.text = player.powerLank
        speed_display.text = player.speedLank
        arm_display.text = player.armLank
        field_display.text = player.fieldingLank
        catching_display.text = player.catchingLank

        setLankColor(contact_display)
        setLankColor(power_display)
        setLankColor(speed_display)
        setLankColor(arm_display)
        setLankColor(field_display)
        setLankColor(catching_display)
    }

    /**
     * 能力から成績を算出
     */
    private fun calcRecord(player: PlayerClass) {

        val ave = calcAve(player)
        val hr = calcHr(player)
        val rbi = calcRbi(player, hr)
        val sb = calcSb(player)

        displayRecord(ave, hr, rbi, sb)
        calcSalary(ave, hr, rbi, sb, player)
    }

    private fun displayRecord(ave: Int, hr: Int, rbi: Int, sb: Int) {
        average_display.text = when{
            ave < 100 -> ".0$ave"
            else -> ".$ave"
        }
        homer_display.text = hr.toString()
        rbi_display.text = rbi.toString()
        steel_display.text = sb.toString()
    }

    private fun calcAve(player: PlayerClass): Int {
        var ave = 85 + (player.contactAbility * 4.5).toInt() + (player.powerAbility * 0.45).toInt() + (player.speedAbility * 0.15).toInt()
        when {
            ave < 150 -> {
                ave = 120 + (ave * 0.3).toInt()
            }
            ave < 200 -> {
                ave = 150 + (ave * 0.3).toInt()
            }
            ave > 300 -> {
                ave = ((ave - 300) * 0.5).toInt() + 300
            }
        }

        ave = when (player.ballisticAbility) {
            1 -> ave
            2 -> (ave * 0.99).toInt()
            3 -> (ave * 0.97).toInt()
            else -> (ave * 0.94).toInt()
        }

        return ave
    }

    private fun calcHr(player: PlayerClass): Int {
        var hr = ((player.powerAbility * 0.8) + (player.contactAbility * 0.1)).toInt() - 30
        if (hr < 0) {
            hr = (player.powerAbility * 0.1).toInt()
        } else {
            hr += 10
        }
        hr = when (player.ballisticAbility) {
            1 -> (hr * 0.4).toInt()
            2 -> (hr * 0.65).toInt()
            3 -> (hr * 0.85).toInt()
            else -> hr
        }

        return hr
    }

    private fun calcRbi(player: PlayerClass, hr: Int): Int {
        var rbi = (((player.contactAbility * 0.5) + (player.powerAbility * 1.0)) * player.chance).toInt()
        when {
            rbi < 0 -> {
                rbi = 1
            }
            rbi < 30 -> {
                rbi = (rbi * 0.2).toInt()
            }
            rbi < 50 -> {
                rbi = (rbi * 0.35).toInt()
            }
            rbi < 60 -> {
                rbi = (rbi * 0.6).toInt()
            }
            rbi < 70 -> {
                rbi = (rbi * 0.75).toInt()
            }
            rbi < 80 -> {
                rbi = (rbi * 0.9).toInt()
            }
        }
        if (rbi < hr) rbi = hr

        return rbi
    }

    private fun calcSb(player: PlayerClass): Int {
        var sb = (player.speedAbility * 0.8).toInt() - 25
        when {
            sb < -10 -> {
                sb = (player.speedAbility * 0.1).toInt()
            }
            sb < 5 -> {
                sb = (player.speedAbility * 0.1).toInt() + 1
            }
            sb > 30 -> {
                sb = (sb * 1.1).toInt()
            }
        }

        return sb
    }

    private fun setLankColor(alphabet: TextView) {

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

    private fun setBallisticArrow(arrow: TextView, ballistic: Int) {
        arrow.text = when (ballistic) {
            1 -> Constants.BALLISTIC_1_ARROW
            4 -> Constants.BALLISTIC_4_ARROW
            else -> Constants.BALLISTIC_2_OR_3_ARROW
        }
    }

    private fun setBallisticColor(arrow: TextView, ballistic: Int) {
        when (ballistic) {
            1 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_1_COLOR))
            2 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_2_COLOR))
            3 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_3_COLOR))
            else -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_4_COLOR))
        }
    }

    /**
     * 成績・能力から年俸算出
     */
    private fun calcSalary(ave: Int, hr: Int, rbi: Int, sb: Int, player: PlayerClass) {

        val avePoint = when (ave) {
            in 0..199 -> ave
            in 200..224 -> ave * 2
            in 225..249 -> ave * 4
            in 250..274 -> ave * 8
            in 275..299 -> ave * 15
            in 300..332 -> ave * 25
            in 333..349 -> ave * 35
            in 350..399 -> ave * 45
            else -> ave * 50
        }

        val hrPoint = when (hr) {
            in 0..9 -> hr * 70
            in 10..14 -> hr * 130
            in 15..19 -> hr * 160
            in 20..24 -> hr * 220
            in 25..29 -> hr * 250
            in 30..39 -> hr * 360
            in 40..49 -> hr * 450
            in 50..54 -> hr * 500
            in 55..59 -> hr * 550
            else -> hr * 600
        }
        val rbiPoint = when (rbi) {
            in 0..9 -> rbi * 10
            in 10..19 -> rbi * 15
            in 20..39 -> rbi * 20
            in 40..59 -> rbi * 25
            in 60..79 -> rbi * 30
            in 80..99 -> rbi * 35
            in 100..129 -> rbi * 50
            else -> rbi * 60
        }
        val sbPoint = when (sb) {
            in 0..3 -> sb * 10
            in 4..9 -> sb * 25
            in 10..19 -> sb * 50
            in 20..29 -> sb * 80
            in 30..39 -> sb * 110
            else -> sb * 125
        }
        var otherPoint = (player.speedAbility * player.armAbility * player.fieldingAbility * player.catchingAbility / 1200.0).toInt()
        val positionBonus = when (player.mainPosition) {
            Constants.CATCHER -> 1.5
            Constants.SECOND_BASE -> 1.3
            Constants.SHORTSTOP -> 1.35
            Constants.THIRD_BASE -> 1.1
            Constants.OUTFIELD -> 1.1
            else -> 1.0
        }
        otherPoint = (otherPoint * positionBonus).toInt()

        var salary = avePoint + hrPoint + rbiPoint + sbPoint + otherPoint

        salary = when (salary) {
            in 0..440 -> 440
            in 441..4999 -> (salary / 10) * 10
            in 5000..9999 -> (salary / 100) * 100
            else -> (salary / 1000) * 1000
        }

        if (salary < 10000) {
            oku_unit.visibility = View.GONE
            man_number.text = salary.toString()
        } else {
            var okuNumber = 0
            while (salary >= 10000) {
                salary -= 10000
                okuNumber++
            }
            oku_number.text = okuNumber.toString()

            if (salary == 0) {
                man_unit.visibility = View.GONE
            } else {
                man_number.text = salary.toString()
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
