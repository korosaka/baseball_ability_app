package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pitcher_record.*
import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.properties.Delegates

class PitcherRecordFragment : Fragment() {
    private lateinit var pitcherPlayer: PlayerPitcherClass

    // presupposition
    private val assumedMaxSpeed = 160
    private val assumedMaxChangeAmount = 15
    private val starterLossSpeed = 6
    private val assumedMaxControl = 150
    private val oneGameInnings = 9.0
    private val minSpeed = 120
    private var maxRequiredERA by Delegates.notNull<Double>()
    private var minRequiredStamina by Delegates.notNull<Int>()
    private var addedSpeedToMin by Delegates.notNull<Int>()
    private var lossOfStamina by Delegates.notNull<Int>()

    // records
    private var battingAveAgainst = 0.0f
    var rateOfBB = 0.0f
    var rateOfK = 0.0f
    var theoreticalERA = 0.0f
    var actualERA = 0.0f
    var games = 0
    var inningsPerGame = 0.0f
    var totalInnings = 0
    var totalK = 0
    var totalBB = 0
    var win = 0
    var lose = 0
    var save = 0
    var winRate = 0.0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pitcherPlayer = it.getSerializable(Constants.TYPE_PITCHER) as PlayerPitcherClass
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_pitcher_record, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        substitutePresupposition(pitcherPlayer)
        calcRecords(pitcherPlayer)
        displayRecords()
    }


    private fun substitutePresupposition(pitcher: PlayerPitcherClass) {
        maxRequiredERA = when (pitcher.pitcherType) {
            Constants.STARTER -> 4.0
            Constants.MIDDLE -> 2.2
            else -> 2.0
        }
        minRequiredStamina = when (pitcher.pitcherType) {
            Constants.MIDDLE -> 50
            Constants.CLOSER -> 40
            else -> 0
        }
        addedSpeedToMin = when (pitcher.pitcherType) {
            Constants.STARTER -> pitcher.maxSpeed - starterLossSpeed - minSpeed
            else -> pitcher.maxSpeed - minSpeed
        }
        lossOfStamina = when {
            pitcher.staminaAbility < minRequiredStamina -> minRequiredStamina - pitcher.staminaAbility
            else -> 0
        }
    }

    private fun calcRecords(pitcher: PlayerPitcherClass) {
        battingAveAgainst = calculateBattingAveAgainst(pitcher)
        rateOfBB = calculateBBRate(pitcher)
        rateOfK = calculateKRate(pitcher)
        theoreticalERA = calculateTheoreticalERA()
        games = calculateGames(pitcher)
        inningsPerGame = calculateInningsPerGame(pitcher)
        totalInnings = (games * inningsPerGame).toInt()
        totalK = (rateOfK / 9 * totalInnings).toInt()
        totalBB = (rateOfBB / 9 * totalInnings).toInt()
        actualERA = calculateActualERA()
        save = calculationSave(pitcher)
        win = calculateWin(pitcher)
        lose = calculateLose(pitcher)
        winRate = calculateWinRate()
    }

    private fun calculateBattingAveAgainst(pitcher: PlayerPitcherClass): Float {

        val maxAveAgainst = 0.42
        val oneThirdOfMax = maxAveAgainst / 3.0
        val minAveAgainst = 0.15
        val oneThirdOfMin = minAveAgainst / 3.0
        val variableRangeEach = oneThirdOfMax - oneThirdOfMin

        val battingAveAgainstElements = arrayOf(oneThirdOfMax, oneThirdOfMax, oneThirdOfMax)
        val speedIndex = 0
        val changeBallIndex = 1
        val controlIndex = 2

        // calculate from ball speed
        val speedCoefficient = variableRangeEach / (assumedMaxSpeed - minSpeed)
        battingAveAgainstElements[speedIndex] -= addedSpeedToMin * speedCoefficient

        // calculate from change ball
        val assumedMaxKindOfChange = 4
        val kindOfChangeCoefficient = 0.1
        val assumedMaxChangePointForCalc = assumedMaxChangeAmount * (1.0 + assumedMaxKindOfChange * kindOfChangeCoefficient)
        val changeCoefficient = variableRangeEach / assumedMaxChangePointForCalc
        val kindOfChangeWeight = 1.0 + pitcher.kindChangeAbility * kindOfChangeCoefficient
        val changePointForCalc = pitcher.amountChangeAbility * kindOfChangeWeight
        battingAveAgainstElements[changeBallIndex] -= changePointForCalc * changeCoefficient

        // calculate from control
        val controlCoefficient = variableRangeEach / assumedMaxControl
        battingAveAgainstElements[controlIndex] -= pitcher.controlAbility * controlCoefficient

        return battingAveAgainstElements.sum().toFloat()
    }

    private fun calculateBBRate(pitcher: PlayerPitcherClass): Float {

        val minBBRate = when (pitcher.pitcherType) {
            Constants.STARTER -> 0.6
            else -> 0.9
        }
        val maxBBRate = 6.0
        val variableRange = maxBBRate - minBBRate
        val controlCoefficient = variableRange / assumedMaxControl

        val rateOfBB9 = (maxBBRate - pitcher.controlAbility * controlCoefficient).toFloat()
        if (rateOfBB9 < minBBRate) return minBBRate.toFloat()
        return rateOfBB9
    }

    private fun calculateKRate(pitcher: PlayerPitcherClass): Float {
        val minKRate = 1.0
        val maxKRate = when (pitcher.pitcherType) {
            Constants.STARTER -> 12.5
            else -> 15.0
        }

        val variableRange = maxKRate - minKRate

        // total 1.0
        val weightOfSpeed = 0.6
        val weightOfChangeAmount = 0.2
        val weightOfFolk = 0.15
        val weightOfSlider = 0.05

        val elementsOfKRate = arrayOf(0.0, 0.0, 0.0, 0.0)
        val indexOfSpeed = 0
        val indexOfChange = 1
        val indexOfFolk = 2
        val indexOfSlider = 3

        // calculate from speed
        val assignmentOfSpeed = variableRange * weightOfSpeed
        elementsOfKRate[indexOfSpeed] = addedSpeedToMin * (assignmentOfSpeed / (assumedMaxSpeed - minSpeed))

        // calculate from change ball
        val assignmentOfChange = variableRange * weightOfChangeAmount
        elementsOfKRate[indexOfChange] = pitcher.amountChangeAbility * (assignmentOfChange / assumedMaxChangeAmount)

        // calculate from folk
        val maxFolkAmount = 7
        val assignmentOfFolk = variableRange * weightOfFolk
        val folkAmount = pitcher.changeBalls[2]
        elementsOfKRate[indexOfFolk] = folkAmount * (assignmentOfFolk / maxFolkAmount)

        // calculate from slider
        val maxSliderAmount = 7
        val assignmentOfSlider = variableRange * weightOfSlider
        val sliderAmount = pitcher.changeBalls[0]
        elementsOfKRate[indexOfSlider] = sliderAmount * (assignmentOfSlider / maxSliderAmount)


        return (minKRate + elementsOfKRate.sum()).toFloat()
    }

    private fun calculateTheoreticalERA(): Float {

        val runPerHit = 0.4
        val runPerBB = battingAveAgainst

        val batters = 27
        val hitsPer9 = batters * battingAveAgainst / (1 - battingAveAgainst)

        val kCoefficient = 0.1
        return ((hitsPer9 * runPerHit) + (rateOfBB * runPerBB) - (rateOfK * kCoefficient)).toFloat()
    }

    private fun calculateGames(pitcher: PlayerPitcherClass): Int {
        val maxGames = when (pitcher.pitcherType) {
            Constants.STARTER -> 28
            Constants.MIDDLE -> 85
            else -> 70
        }
        val minGames = when (pitcher.pitcherType) {
            Constants.STARTER -> 4
            else -> 10
        }

        val eraCoefficient = when (pitcher.pitcherType) {
            Constants.STARTER -> 4
            Constants.MIDDLE -> 20
            else -> 12
        }
        val eraContribution = ((theoreticalERA - maxRequiredERA) * eraCoefficient).toInt()
        val kCoefficient = 0.1
        val kRateContribution = rateOfK * kCoefficient
        var actualGames = when (pitcher.pitcherType) {
            Constants.MIDDLE -> ((maxGames - eraContribution) * kRateContribution).toInt() - lossOfStamina
            else -> (maxGames - eraContribution) - lossOfStamina
        }
        if (actualGames > maxGames) actualGames = maxGames
        if (actualGames < minGames) actualGames = minGames

        return actualGames
    }

    private fun calculateInningsPerGame(pitcher: PlayerPitcherClass): Float {

        val maxInningsPerGame = when (pitcher.pitcherType) {
            Constants.STARTER -> 9.0
            Constants.MIDDLE -> 1.2
            else -> 1.0
        }
        val minInningsPerGame = when (pitcher.pitcherType) {
            Constants.STARTER -> 3.0
            Constants.MIDDLE -> 0.6
            else -> 0.7
        }
        val staminaCoefficient = when (pitcher.pitcherType) {
            Constants.STARTER -> 0.06
            else -> 0.1
        }
        val minStarterStaminaContribution = 9.5
        val staminaContribution = when (pitcher.pitcherType) {
            Constants.STARTER -> minStarterStaminaContribution + (pitcher.staminaAbility - Constants.NEEDED_STARTER_STAMINA) * staminaCoefficient
            else -> lossOfStamina * staminaCoefficient
        }
        val eraCoefficient = when (pitcher.pitcherType) {
            Constants.STARTER -> 1.0
            Constants.MIDDLE -> 0.15
            else -> 0.05
        }
        val eraContribution = when (pitcher.pitcherType) {
            Constants.STARTER -> theoreticalERA * eraCoefficient
            else -> (theoreticalERA - maxRequiredERA) * eraCoefficient
        }
        val bbCoefficient = when (pitcher.pitcherType) {
            Constants.STARTER -> 0.5
            else -> 0.07
        }
        val bbContribution = rateOfBB * bbCoefficient
        var inningsPerGame = when (pitcher.pitcherType) {
            Constants.STARTER -> staminaContribution - (eraContribution + bbContribution)
            Constants.MIDDLE -> maxInningsPerGame - (eraContribution + bbContribution) - staminaContribution
            else -> maxInningsPerGame - eraContribution - staminaContribution
        }
        if (inningsPerGame > maxInningsPerGame) inningsPerGame = maxInningsPerGame
        if (inningsPerGame < minInningsPerGame) inningsPerGame = minInningsPerGame

        return inningsPerGame.toFloat()
    }

    private fun calculateActualERA(): Float {
        val actualRunsAllowed = ceil(theoreticalERA * totalInnings / oneGameInnings)
        return (actualRunsAllowed / totalInnings * oneGameInnings).toFloat()
    }

    private fun calculateWinRate(): Float {
        return ((win * 1.0) / (win + lose)).toFloat()
    }

    private fun calculationSave(pitcher: PlayerPitcherClass): Int {
        if (pitcher.pitcherType != Constants.CLOSER) return 0

        val saveSituationRate = 0.7
        val saveSituation = games * saveSituationRate
        // rate of losing more than 2run in 1inning
        val rateOfRunPerInning = theoreticalERA / oneGameInnings
        val runForLose = 2
        val saveFailRate = rateOfRunPerInning / runForLose

        return (saveSituation * (1 - saveFailRate)).toInt()
    }

    private fun calculateWin(pitcher: PlayerPitcherClass): Int {
        val pitchingGames = games - save

        val contributionOfERA = 1 - theoreticalERA / 10
        var win = (pitchingGames * inningsPerGame / oneGameInnings * contributionOfERA * pitcher.chance).toInt()
        if (win > pitchingGames) win = pitchingGames
        if (win < 0) win = 0

        return win
    }

    private fun calculateLose(pitcher: PlayerPitcherClass): Int {
        var nonWinGame = games - win
        if (pitcher.pitcherType == Constants.CLOSER) nonWinGame -= save

        val adjustmentCoefficient = when (pitcher.pitcherType) {
            Constants.CLOSER -> 0.35
            else -> 0.2
        }
        val contributionOfERA = theoreticalERA * adjustmentCoefficient
        var lose = (nonWinGame * inningsPerGame / oneGameInnings * contributionOfERA).toInt()
        if (lose > nonWinGame) lose = nonWinGame
        if (lose < 0) lose = 0

        return lose
    }

    private fun displayRecords() {
        win_display.text = win.toString()
        lose_display.text = lose.toString()
        save_display.text = save.toString()
        era_display.text = String.format("%.2f", actualERA)
        innings_display.text = totalInnings.toString()
        k_display.text = totalK.toString()
        bb_display.text = totalBB.toString()
        val intAveAgainst = (battingAveAgainst * 1000).roundToInt()
        var displayAveAgainst = ".$intAveAgainst"
        if (intAveAgainst < 100) displayAveAgainst = ".0$intAveAgainst"
        ave_against_display.text = displayAveAgainst
    }


    companion object {
        @JvmStatic
        fun newInstance(pitcher: PlayerPitcherClass) =
                PitcherRecordFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_PITCHER, pitcher)
                    }
                }
    }
}