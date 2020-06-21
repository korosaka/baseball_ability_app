package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.CLOSER_DISPLAY
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.MIDDLE
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.MIDDLE_DISPLAY
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.STARTER
import com.websarva.wings.android.abiityofbaseball.Constants.Companion.STARTER_DISPLAY
import kotlinx.android.synthetic.main.activity_making_status_pitcher.*
import kotlin.math.roundToInt

class MakingStatusPitcherActivity : BaseBannerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_making_status_pitcher)
        setAdViewContainer(ad_view_container_on_making_status_pitcher)
        super.onCreate(savedInstanceState)

        val playerPitcher = makePitcher()

        displayName(playerPitcher)
        displayTotalAbility(playerPitcher)
        displayPitcherRecords(playerPitcher)
        displaySalary(calcSalary(playerPitcher))
    }

    private fun makePitcher(): PlayerPitcherClass {

        return PlayerPitcherClass(
                intent.getStringExtra(Constants.PLAYER_NAME)!!,
                intent.getStringExtra(Constants.PITCHER_TYPE)!!,
                intent.getIntExtra(Constants.BALL_SPEED, 0),
                intent.getIntExtra(Constants.CONTROL, 0),
                intent.getIntExtra(Constants.STAMINA, 0),
                intent.getIntExtra(Constants.KIND_CHANGE, 0),
                intent.getIntExtra(Constants.AMOUNT_CHANGE, 0),
                intent.getIntegerArrayListExtra(Constants.PRIORITY_CHANGE)!!,
                intent.getDoubleExtra(Constants.CHANCE, 1.0)
        )
    }

    private fun displayTotalAbility(playerPitcher: PlayerPitcherClass) {
        displayPitcherType(playerPitcher)
        ball_speed_display.text = playerPitcher.maxSpeed.toString()
        control_display.text = playerPitcher.controlLank
        stamina_display.text = playerPitcher.staminaLank
        setTextColor(control_display)
        setTextColor(stamina_display)

        displayChangeBallAbility(playerPitcher)

    }

    private fun displayChangeBallAbility(playerPitcher: PlayerPitcherClass) {
        val changeDisplays = getChangeBallDisplay()
        val changeBallMarks = arrayOf(mark_slider, mark_curb, mark_fork, mark_sinker, mark_shoot)
        val changeBallTitles = arrayOf(title_slider, title_curb, title_fork, title_sinker, title_shoot)
        val colors = getChangeBallColors()
        for (changeKindIndex in 0 until playerPitcher.changeBalls.size) {

            if (playerPitcher.changeBalls[changeKindIndex] == 0) changeBallTitles[changeKindIndex]!!.visibility = View.INVISIBLE

            for (changeAmountIndex in 0 until playerPitcher.changeBalls[changeKindIndex]) {

                changeDisplays[changeKindIndex][changeAmountIndex].setBackgroundColor(colors[changeKindIndex][changeAmountIndex])
                changeBallMarks[changeKindIndex]!!.setTextColor(colors[changeKindIndex][changeAmountIndex])
            }
        }

    }

    private fun getChangeBallDisplay(): Array<Array<TextView>> {
        val sliderDisplay = arrayOf(slider_1, slider_2, slider_3, slider_4, slider_5, slider_6, slider_7)
        val curbDisplay = arrayOf(curb_1, curb_2, curb_3, curb_4, curb_5, curb_6, curb_7)
        val forkDisplay = arrayOf(fork_1, fork_2, fork_3, fork_4, fork_5, fork_6, fork_7)
        val sinkerDisplay = arrayOf(sinker_1, sinker_2, sinker_3, sinker_4, sinker_5, sinker_6, sinker_7)
        val shootDisplay = arrayOf(shoot_1, shoot_2, shoot_3, shoot_4, shoot_5, shoot_6, shoot_7)

        return arrayOf(
                sliderDisplay,
                curbDisplay,
                forkDisplay,
                sinkerDisplay,
                shootDisplay
        )
    }

    private fun displayName(pitcher: PlayerPitcherClass) {
        name_display_p.text = pitcher.playerName
        when (name_display_p.length()) {
            2 -> name_display_p.text = (pitcher.playerName[0] + Constants.HALF_SPACE + Constants.HALF_SPACE + pitcher.playerName[1])
            3 -> name_display_p.text = (pitcher.playerName[0] + Constants.HALF_SPACE + pitcher.playerName[1] + Constants.HALF_SPACE + pitcher.playerName[2])
            5 -> name_display_p.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 9.5F, resources.displayMetrics)
            6 -> name_display_p.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 8F, resources.displayMetrics)
            7 -> name_display_p.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6.8F, resources.displayMetrics)
            8 -> name_display_p.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6F, resources.displayMetrics)
        }
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

    private fun displayPitcherType(pitcher: PlayerPitcherClass) {
        when (pitcher.pitcherType) {
            STARTER -> {
                type_display.text = STARTER_DISPLAY
                type_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            MIDDLE -> {
                type_display.text = MIDDLE_DISPLAY
                type_display.setBackgroundResource(R.drawable.outfielder_name_background)
            }
            else -> {
                type_display.text = CLOSER_DISPLAY
                type_display.setBackgroundResource(R.drawable.catcher_name_background)
            }
        }
    }

    private fun getChangeBallColors(): Array<Array<Int>> {
        val sliderColors = arrayOf(
                Color.parseColor(Constants.SLIDER_COLOR_1),
                Color.parseColor(Constants.SLIDER_COLOR_2),
                Color.parseColor(Constants.SLIDER_COLOR_3),
                Color.parseColor(Constants.SLIDER_COLOR_4),
                Color.parseColor(Constants.SLIDER_COLOR_5),
                Color.parseColor(Constants.SLIDER_COLOR_6),
                Color.parseColor(Constants.SLIDER_COLOR_7)
        )
        val curbColors = arrayOf(
                Color.parseColor(Constants.CURB_COLOR_1),
                Color.parseColor(Constants.CURB_COLOR_2),
                Color.parseColor(Constants.CURB_COLOR_3),
                Color.parseColor(Constants.CURB_COLOR_4),
                Color.parseColor(Constants.CURB_COLOR_5),
                Color.parseColor(Constants.CURB_COLOR_6),
                Color.parseColor(Constants.CURB_COLOR_7)
        )
        val forkColors = arrayOf(
                Color.parseColor(Constants.FORK_COLOR_1),
                Color.parseColor(Constants.FORK_COLOR_2),
                Color.parseColor(Constants.FORK_COLOR_3),
                Color.parseColor(Constants.FORK_COLOR_4),
                Color.parseColor(Constants.FORK_COLOR_5),
                Color.parseColor(Constants.FORK_COLOR_6),
                Color.parseColor(Constants.FORK_COLOR_7)
        )
        val sinkerColors = arrayOf(
                Color.parseColor(Constants.SINKER_COLOR_1),
                Color.parseColor(Constants.SINKER_COLOR_2),
                Color.parseColor(Constants.SINKER_COLOR_3),
                Color.parseColor(Constants.SINKER_COLOR_4),
                Color.parseColor(Constants.SINKER_COLOR_5),
                Color.parseColor(Constants.SINKER_COLOR_6),
                Color.parseColor(Constants.SINKER_COLOR_7)
        )
        val shootColors = arrayOf(
                Color.parseColor(Constants.SHOOT_COLOR_1),
                Color.parseColor(Constants.SHOOT_COLOR_2),
                Color.parseColor(Constants.SHOOT_COLOR_3),
                Color.parseColor(Constants.SHOOT_COLOR_4),
                Color.parseColor(Constants.SHOOT_COLOR_5),
                Color.parseColor(Constants.SHOOT_COLOR_6),
                Color.parseColor(Constants.SHOOT_COLOR_7)
        )

        return arrayOf(
                sliderColors,
                curbColors,
                forkColors,
                sinkerColors,
                shootColors
        )
    }

    private fun displayPitcherRecords(playerPitcher: PlayerPitcherClass) {
        win_display.text = playerPitcher.win.toString()
        lose_display.text = playerPitcher.lose.toString()
        save_display.text = playerPitcher.save.toString()
        era_display.text = String.format("%.2f", playerPitcher.actualERA)
        innings_display.text = playerPitcher.totalInnings.toString()
        k_display.text = playerPitcher.totalK.toString()
        bb_display.text = playerPitcher.totalBB.toString()
        val intAveAgainst = (playerPitcher.battingAveAgainst * 1000).roundToInt()
        var displayAveAgainst = ".$intAveAgainst"
        if (intAveAgainst < 100) displayAveAgainst = ".0$intAveAgainst"
        ave_against_display.text = displayAveAgainst
    }


    private fun calcSalary(pitcher: PlayerPitcherClass): Int {

        val priceForWin = calcPriceForWin(pitcher)
        val priceForInning = calcPriceForInning(pitcher)

        val coefficientOfERA = calcCoefficientOfERA(pitcher)
        var priceForSave = 0
        if (pitcher.pitcherType == Constants.CLOSER) priceForSave = calcPriceForSave(pitcher)
        val minCoefficientOfWinRate = 0.6
        val coefficientOfWinRate = pitcher.winRate + minCoefficientOfWinRate
        val bonusOfK = calcBonusOfK(pitcher)

        var totalSalary = ((priceForWin + priceForInning + priceForSave) * coefficientOfERA).toInt()
        if (pitcher.pitcherType == Constants.STARTER) totalSalary = (totalSalary * coefficientOfWinRate + bonusOfK).toInt()

        return when (totalSalary) {
            in 0..440 -> 440
            in 441..4999 -> (totalSalary / 10) * 10
            in 5000..9999 -> (totalSalary / 100) * 100
            else -> (totalSalary / 1000) * 1000
        }
    }

    private fun calcPriceForWin(pitcher: PlayerPitcherClass): Int {
        val pricePerWin = when (pitcher.pitcherType) {
            Constants.STARTER -> {
                when (pitcher.win) {
                    in 0..5 -> 180
                    in 6..9 -> 250
                    else -> 500
                }
            }
            else -> 200
        }
        return pitcher.win * pricePerWin
    }

    private fun calcPriceForInning(pitcher: PlayerPitcherClass): Int {
        val pricePerInning = when (pitcher.pitcherType) {
            Constants.STARTER -> {
                when (pitcher.totalInnings) {
                    in 0..49 -> 30
                    in 50..99 -> 35
                    in 100..142 -> 40
                    else -> 80
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
