package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.view.View
import kotlin.properties.Delegates

class PitcherSalaryFragment : SalaryParentFragment() {
    private lateinit var pitcherPlayer: PlayerPitcherClass
    private var win by Delegates.notNull<Int>()
    private var save by Delegates.notNull<Int>()
    private var totalInnings by Delegates.notNull<Int>()
    private var totalK by Delegates.notNull<Int>()
    private var actualERA by Delegates.notNull<Float>()
    private var winRate by Delegates.notNull<Float>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pitcherPlayer = it.getSerializable(Constants.TYPE_PITCHER) as PlayerPitcherClass
            win = it.getInt(KEY_WIN)
            save = it.getInt(KEY_SAVE)
            totalInnings = it.getInt(KEY_INNINGS)
            totalK = it.getInt(KEY_K)
            actualERA = it.getFloat(KEY_ERA)
            winRate = it.getFloat(KEY_WIN_RATE)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displaySalary(calcSalary())
    }


    private fun calcSalary(): Int {

        val priceForWin = calcPriceForWin(pitcherPlayer, win)
        val priceForInning = calcPriceForInning(pitcherPlayer, totalInnings)

        val coefficientOfERA = calcCoefficientOfERA(pitcherPlayer, actualERA)
        var priceForSave = 0
        if (pitcherPlayer.pitcherType == Constants.CLOSER) priceForSave = calcPriceForSave(pitcherPlayer, save)
        val minCoefficientOfWinRate = 0.6
        val coefficientOfWinRate = winRate + minCoefficientOfWinRate
        val bonusOfK = calcBonusOfK(pitcherPlayer, totalK)

        var totalSalary = ((priceForWin + priceForInning + priceForSave) * coefficientOfERA).toInt()
        if (pitcherPlayer.pitcherType == Constants.STARTER) totalSalary = (totalSalary * coefficientOfWinRate + bonusOfK).toInt()

        return when (totalSalary) {
            in 0..440 -> 440
            in 441..4999 -> (totalSalary / 10) * 10
            in 5000..9999 -> (totalSalary / 100) * 100
            else -> (totalSalary / 1000) * 1000
        }
    }

    private fun calcPriceForWin(pitcher: PlayerPitcherClass, win: Int): Int {
        val pricePerWin = when (pitcher.pitcherType) {
            Constants.STARTER -> {
                when (win) {
                    in 0..5 -> 180
                    in 6..9 -> 250
                    else -> 500
                }
            }
            else -> 200
        }
        return win * pricePerWin
    }

    private fun calcPriceForInning(pitcher: PlayerPitcherClass, totalInnings: Int): Int {
        val pricePerInning = when (pitcher.pitcherType) {
            Constants.STARTER -> {
                when (totalInnings) {
                    in 0..49 -> 30
                    in 50..99 -> 35
                    in 100..142 -> 40
                    else -> 80
                }
            }
            Constants.MIDDLE -> {
                when (totalInnings) {
                    in 0..9 -> 50
                    in 10..29 -> 100
                    in 30..49 -> 150
                    in 50..64 -> 220
                    in 65..79 -> 280
                    else -> 350
                }
            }
            else -> {
                when (totalInnings) {
                    in 0..9 -> 50
                    in 10..29 -> 100
                    in 30..44 -> 180
                    in 45..59 -> 250
                    else -> 300
                }
            }
        }
        return totalInnings * pricePerInning
    }

    private fun calcCoefficientOfERA(pitcher: PlayerPitcherClass, actualERA: Float): Float {

        val maxCoefficientOfERA = 1.8
        val minCoefficientOfERA = 0.5
        var coefficientOfERA = maxCoefficientOfERA - (actualERA / 5.0)
        if (coefficientOfERA < minCoefficientOfERA) coefficientOfERA = minCoefficientOfERA

        return coefficientOfERA.toFloat()
    }

    private fun calcPriceForSave(pitcher: PlayerPitcherClass, save: Int): Int {

        val pricePerSave = when (save) {
            in 0..9 -> 150
            in 10..19 -> 200
            in 20..29 -> 250
            in 30..39 -> 350
            else -> 400
        }

        return save * pricePerSave
    }

    private fun calcBonusOfK(pitcher: PlayerPitcherClass, totalK: Int): Int {
        return when (totalK) {
            in 0..99 -> 0
            in 100..149 -> 500
            in 150..199 -> 1000
            in 200..249 -> 4000
            else -> 5000
        }
    }


    companion object {
        private const val KEY_WIN = "win"
        private const val KEY_SAVE = "save"
        private const val KEY_INNINGS = "innings"
        private const val KEY_K = "strikeout"
        private const val KEY_ERA = "era"
        private const val KEY_WIN_RATE = "winRate"

        @JvmStatic
        fun newInstance(pitcher: PlayerPitcherClass,
                        pitcherRecord: PitcherRecordFragment) =
                PitcherSalaryFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_PITCHER, pitcher)

                        val battingAveAgainst = calcBattingAveAgainst(pitcher, pitcherRecord)
                        val rateOfBB = calcRateOfBB(pitcher, pitcherRecord)
                        val rateOfK = calcRateOfK(pitcher, pitcherRecord)
                        val theoreticalERA = calcTheoreticalERA(pitcherRecord, battingAveAgainst, rateOfBB, rateOfK)
                        val games = calcGames(pitcher, pitcherRecord, theoreticalERA, rateOfK)
                        val inningsPerGame = calcInningsPerGame(pitcher, pitcherRecord, theoreticalERA, rateOfBB)
                        val totalInnings = calcTotalInnings(pitcherRecord, games, inningsPerGame)
                        val totalK = calcTotalK(pitcherRecord, rateOfK, totalInnings)
                        val actualERA = calcActualERA(pitcherRecord, theoreticalERA, totalInnings)
                        val save = calcSave(pitcher, pitcherRecord, games, theoreticalERA)
                        val win = calcWin(pitcher, pitcherRecord, games, save, theoreticalERA, inningsPerGame)
                        val lose = calcLose(pitcher, pitcherRecord, games, win, save, theoreticalERA, inningsPerGame)
                        val winRate = calcWinRate(pitcherRecord, win, lose)

                        putSerializable(Constants.TYPE_PITCHER, pitcher)
                        putInt(KEY_WIN, win)
                        putInt(KEY_SAVE, save)
                        putInt(KEY_INNINGS, totalInnings)
                        putInt(KEY_K, totalK)
                        putFloat(KEY_ERA, actualERA)
                        putFloat(KEY_WIN_RATE, winRate)
                    }
                }
    }

    private fun calcBattingAveAgainst(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment): Float {
        return pitcherRecord.calcBattingAveAgainst(pitcherPlayer)
    }

    private fun calcRateOfBB(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment): Float {
        return pitcherRecord.calcBBRate(pitcherPlayer)
    }

    private fun calcRateOfK(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment): Float {
        return pitcherRecord.calcKRate(pitcherPlayer)
    }

    private fun calcTheoreticalERA(pitcherRecord: PitcherRecordFragment, battingAveAgainst: Float, rateOfBB: Float, rateOfK: Float): Float {
        return pitcherRecord.calcTheoreticalERA(battingAveAgainst, rateOfBB, rateOfK)
    }

    private fun calcGames(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment, theoreticalERA: Float, rateOfK: Float): Int {
        return pitcherRecord.calcGames(pitcherPlayer, theoreticalERA, rateOfK)
    }

    private fun calcInningsPerGame(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment, theoreticalERA: Float, rateOfBB: Float): Float {
        return pitcherRecord.calcInningsPerGame(pitcherPlayer, theoreticalERA, rateOfBB)
    }

    private fun calcTotalInnings(pitcherRecord: PitcherRecordFragment, games: Int, inningsPerGame: Float): Int {
        return pitcherRecord.calcTotalInnings(games, inningsPerGame)
    }

    private fun calcTotalK(pitcherRecord: PitcherRecordFragment, rateOfK: Float, totalInnings: Int): Int {
        return pitcherRecord.calcTotalK(rateOfK, totalInnings)
    }

    private fun calcActualERA(pitcherRecord: PitcherRecordFragment, theoreticalERA: Float, totalInnings: Int): Float {
        return pitcherRecord.calcActualERA(theoreticalERA, totalInnings)
    }

    private fun calcSave(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment, games: Int, theoreticalERA: Float): Int {
        return pitcherRecord.calcSave(pitcherPlayer, games, theoreticalERA)
    }

    private fun calcWin(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment, games: Int, save: Int, theoreticalERA: Float, inningsPerGame: Float): Int {
        return pitcherRecord.calcWin(pitcherPlayer, games, save, theoreticalERA, inningsPerGame)
    }

    private fun calcLose(pitcherPlayer: PlayerPitcherClass, pitcherRecord: PitcherRecordFragment, games: Int, win: Int, save: Int, theoreticalERA: Float, inningsPerGame: Float): Int {
        return pitcherRecord.calcLose(pitcherPlayer, games, win, save, theoreticalERA, inningsPerGame)
    }

    private fun calcWinRate(pitcherRecord: PitcherRecordFragment, win: Int, lose: Int): Float {
        return pitcherRecord.calcWinRate(win, lose)
    }

}