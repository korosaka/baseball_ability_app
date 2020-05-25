package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.CLOSER_DISPLAY
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.MIDDLE
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.MIDDLE_DISPLAY
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.STARTER
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.STARTER_DISPLAY
import kotlinx.android.synthetic.main.activity_making_status_pitcher.*

class MakingStatusPitcherActivity : BaseBannerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_making_status_pitcher)
        setAdViewContainer(ad_view_container_on_making_status_pitcher)
        super.onCreate(savedInstanceState)


        val playerPitcher = PlayerPitcherClass(
                intent.getStringExtra(Constants.PLAYER_NAME),
                intent.getStringExtra(Constants.PITCHER_TYPE),
                intent.getIntExtra(Constants.BALL_SPEED, 0),
                intent.getIntExtra(Constants.CONTROL, 0),
                intent.getIntExtra(Constants.STAMINA, 0),
                intent.getIntExtra(Constants.KIND_CHANGE, 0),
                intent.getIntExtra(Constants.AMOUNT_CHANGE, 0),
                intent.getIntegerArrayListExtra(Constants.PRIORITY_CHANGE),
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
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

        var changeDisplays = Array(5, { arrayOfNulls<TextView>(7) })
        changeDisplays[0] = sliderDisplay
        changeDisplays[1] = curbDisplay
        changeDisplays[2] = forkDisplay
        changeDisplays[3] = sinkerDisplay
        changeDisplays[4] = shootDisplay

        var changeBallMarks: Array<TextView?> = arrayOfNulls(5)
        changeBallMarks[0] = findViewById<TextView>(R.id.mark_slider)
        changeBallMarks[1] = findViewById<TextView>(R.id.mark_curb)
        changeBallMarks[2] = findViewById<TextView>(R.id.mark_fork)
        changeBallMarks[3] = findViewById<TextView>(R.id.mark_sinker)
        changeBallMarks[4] = findViewById<TextView>(R.id.mark_shoot)

        var changeBallTitles: Array<TextView?> = arrayOfNulls(5)
        changeBallTitles[0] = findViewById<TextView>(R.id.title_slider)
        changeBallTitles[1] = findViewById<TextView>(R.id.title_curb)
        changeBallTitles[2] = findViewById<TextView>(R.id.title_fork)
        changeBallTitles[3] = findViewById<TextView>(R.id.title_sinker)
        changeBallTitles[4] = findViewById<TextView>(R.id.title_shoot)



        nameDisplay.text = playerPitcher.playerName
        type_display.text = when (playerPitcher.getPitcherType()) {
            STARTER -> STARTER_DISPLAY
            MIDDLE -> MIDDLE_DISPLAY
            else -> CLOSER_DISPLAY
        }
        ballSpeedDisplay.text = playerPitcher.max_speed.toString()
        controlDisplay.text = playerPitcher.control_lank
        staminaDisplay.text = playerPitcher.stamina_lank

        setTextColor(controlDisplay)
        setTextColor(staminaDisplay)

        win_display.text = playerPitcher.win.toString()
        lose_display.text = playerPitcher.lose.toString()
        save_display.text = playerPitcher.save.toString()
        era_display.text = String.format("%.2f", playerPitcher.actualERA)
        innings_display.text = playerPitcher.totalInnings.toString()
        k_display.text = playerPitcher.totalK.toString()
        bb_display.text = playerPitcher.totalBB.toString()
        val intAveAgainst = Math.round(playerPitcher.battingAveAgainst * 1000)
        var displayAveAgainst = "." + intAveAgainst.toString()
        if (intAveAgainst < 100) displayAveAgainst = "." + "0" + intAveAgainst.toString()
        ave_against_display.setText(displayAveAgainst)

        var colors = Array(5, { arrayOfNulls<Int>(7) })

        var sliderColors: Array<Int?> = arrayOfNulls(7)
        sliderColors[0] = Color.parseColor("#ffe0e0")
        sliderColors[1] = Color.parseColor("#ffd6d6")
        sliderColors[2] = Color.parseColor("#ffc6c6")
        sliderColors[3] = Color.parseColor("#ffa3a3")
        sliderColors[4] = Color.parseColor("#ff7f7f")
        sliderColors[5] = Color.parseColor("#ff3d3d")
        sliderColors[6] = Color.parseColor("#ff0000")

        var curbColors: Array<Int?> = arrayOfNulls(7)
        curbColors[0] = Color.parseColor("#ffefe0")
        curbColors[1] = Color.parseColor("#ffe8d1")
        curbColors[2] = Color.parseColor("#ffe2c6")
        curbColors[3] = Color.parseColor("#ffd1a3")
        curbColors[4] = Color.parseColor("#ffbf7f")
        curbColors[5] = Color.parseColor("#ff9e3d")
        curbColors[6] = Color.parseColor("#ff7f00")

        var forkColors: Array<Int?> = arrayOfNulls(7)
        forkColors[0] = Color.parseColor("#ffffc6")
        forkColors[1] = Color.parseColor("#ffffa8")
        forkColors[2] = Color.parseColor("#ffff7f")
        forkColors[3] = Color.parseColor("#ffff00")
        forkColors[4] = Color.parseColor("#fef263")
        forkColors[5] = Color.parseColor("#ffea00")
        forkColors[6] = Color.parseColor("#ffd900")

        var sinkerColors: Array<Int?> = arrayOfNulls(7)
        sinkerColors[0] = Color.parseColor("#e0ffe0")
        sinkerColors[1] = Color.parseColor("#d1ffd1")
        sinkerColors[2] = Color.parseColor("#c6ffc6")
        sinkerColors[3] = Color.parseColor("#a3ffa3")
        sinkerColors[4] = Color.parseColor("#7fff7f")
        sinkerColors[5] = Color.parseColor("#3dff3d")
        sinkerColors[6] = Color.parseColor("#00ff00")

        var shootColors: Array<Int?> = arrayOfNulls(7)
        shootColors[0] = Color.parseColor("#e0ffff")
        shootColors[1] = Color.parseColor("#d1ffff")
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

            if (playerPitcher.changeballs[changeKindIndex] == 0) changeBallTitles[changeKindIndex]!!.setVisibility(View.INVISIBLE)

            for (changeAmountIndex in 0..(playerPitcher.changeballs[changeKindIndex] - 1)) {

                changeDisplays[changeKindIndex][changeAmountIndex]!!.setBackgroundColor(colors[changeKindIndex][changeAmountIndex]!!)
                changeBallMarks[changeKindIndex]!!.setTextColor(colors[changeKindIndex][changeAmountIndex]!!)
            }
        }

        displaySalary(calcSalary(playerPitcher))


    }

    private fun setTextColor(alphabet: TextView) {

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

    private fun calcSalary(pitcher: PlayerPitcherClass): Int {

        val priceForWin = calcPriceForWin(pitcher)
        val priceForInning = calcPriceForInning(pitcher)

        val coefficientOfERA = calcCoefficientOfERA(pitcher)
        var priceForSave = 0
        if (pitcher.getPitcherType() == Constants.CLOSER) priceForSave = calcPriceForSave(pitcher)
        val minCoefficientOfWinRate = 0.6
        val coefficientOfWinRate = pitcher.winRate + minCoefficientOfWinRate
        val bonusOfK = calcBonusOfK(pitcher)

        var totalSalary = ((priceForWin + priceForInning + priceForSave) * coefficientOfERA).toInt()
        if (pitcher.getPitcherType() == Constants.STARTER) totalSalary = (totalSalary * coefficientOfWinRate + bonusOfK).toInt()

        return when (totalSalary) {
            in 0..440 -> 440
            in 441..4999 -> (totalSalary / 10) * 10
            in 5000..9999 -> (totalSalary / 100) * 100
            else -> (totalSalary / 1000) * 1000
        }
    }

    private fun calcPriceForWin(pitcher: PlayerPitcherClass): Int {
        val pricePerWin = when (pitcher.getPitcherType()) {
            Constants.STARTER -> {
                when (pitcher.win) {
                    in 0..5 -> 200
                    in 6..9 -> 300
                    else -> 600
                }
            }
            else -> 200
        }
        return pitcher.win * pricePerWin
    }

    private fun calcPriceForInning(pitcher: PlayerPitcherClass): Int {
        val pricePerInning = when (pitcher.getPitcherType()) {
            Constants.STARTER -> {
                when (pitcher.totalInnings) {
                    in 0..49 -> 30
                    in 50..99 -> 40
                    in 100..142 -> 50
                    else -> 75
                }
            }
            Constants.MIDDLE -> {
                when (pitcher.totalInnings) {
                    in 0..9 -> 50
                    in 10..29 -> 100
                    in 30..49 -> 150
                    in 50..64 -> 220
                    in 65..79 -> 280
                    else -> 350
                }
            }
            else -> {
                when (pitcher.totalInnings) {
                    in 0..9 -> 50
                    in 10..29 -> 100
                    in 30..44 -> 180
                    in 45..59 -> 250
                    else -> 300
                }
            }
        }
        return pitcher.totalInnings * pricePerInning
    }

    private fun calcCoefficientOfERA(pitcher: PlayerPitcherClass): Float {

        val maxCoefficientOfERA = 1.8
        val minCoefficientOfERA = 0.5
        var coefficientOfERA = maxCoefficientOfERA - (pitcher.actualERA / 5.0)
        if (coefficientOfERA < minCoefficientOfERA) coefficientOfERA = minCoefficientOfERA

        return coefficientOfERA.toFloat()
    }

    private fun calcPriceForSave(pitcher: PlayerPitcherClass): Int {

        val pricePerSave = when (pitcher.save) {
            in 0..9 -> 150
            in 10..19 -> 200
            in 20..29 -> 250
            in 30..39 -> 350
            else -> 400
        }

        return pitcher.save * pricePerSave
    }

    private fun calcBonusOfK(pitcher: PlayerPitcherClass): Int {
        return when (pitcher.totalK) {
            in 0..99 -> 0
            in 100..149 -> 500
            in 150..199 -> 1000
            in 200..249 -> 4000
            else -> 5000
        }
    }

    private fun displaySalary(salary: Int) {
        if (salary < 10000) {
            hundred_million_unit.visibility = View.GONE
            ten_thousand_number.text = salary.toString()
        } else {
            hundred_million_number.text = (salary / 10000).toString()
            val tenThousandPartOfSalary = salary % 10000
            if (tenThousandPartOfSalary == 0) ten_thousand_unit.visibility = View.GONE
            else ten_thousand_number.text = tenThousandPartOfSalary.toString()
        }
    }


    // Topへ戻る
    fun onClickFinish(view: View) {

        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }


}
