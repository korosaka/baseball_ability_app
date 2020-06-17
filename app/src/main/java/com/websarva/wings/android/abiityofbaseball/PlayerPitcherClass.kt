package com.websarva.wings.android.abiityofbaseball

import kotlin.math.ceil

class PlayerPitcherClass(
        val playerName: String,
        val pitcherType: String,
        private val ballSpeedAbility: Int,
        private val controlAbility: Int,
        private val staminaAbility: Int,
        kindsOfChange: Int,
        amountOfChange: Int,
        priorityOfChange: ArrayList<Int>,
        private val chance: Double) {

    private val kindChangeAbility = calculateNumberOfChangeBalls(kindsOfChange)
    private val amountChangeAbility = calculateTotalChangeAmount(amountOfChange, kindChangeAbility)

    private val minSpeed = 120
    val controlLank = lankMaking(controlAbility)
    val staminaLank = lankMaking(staminaAbility)
    val maxSpeed = calculateMaxSpeed(ballSpeedAbility)

    val changeBalls = calculateChangeBalls(kindChangeAbility, amountChangeAbility, priorityOfChange)

    // records of season
    private val assumedMaxSpeed = 160
    private val assumedMaxChangeAmount = 15
    private val starterLossSpeed = 6
    private val assumedMaxControl = 150
    private val oneGameInnings = 9.0
    private val maxRequiredERA = when (pitcherType) {
        Constants.STARTER -> 4.0
        Constants.MIDDLE -> 2.2
        else -> 2.0
    }
    private val minRequiredStamina = when (pitcherType) {
        Constants.MIDDLE -> 50
        Constants.CLOSER -> 40
        else -> 0
    }
    private val lossOfStamina = when {
        staminaAbility < minRequiredStamina -> minRequiredStamina - staminaAbility
        else -> 0
    }

    private val addedSpeedToMin = when (pitcherType) {
        Constants.STARTER -> maxSpeed - starterLossSpeed - minSpeed
        else -> maxSpeed - minSpeed
    }
    val battingAveAgainst = calculateBattingAveAgainst()
    private val rateOfBB = calculateBBRate()
    private val rateOfK = calculateKRate()
    private val theoreticalERA = calculateTheoreticalERA()
    private val games = calculateGames()
    private val inningsPerGame = calculateInningsPerGame()
    val totalInnings = (games * inningsPerGame).toInt()
    val totalK = (rateOfK / 9 * totalInnings).toInt()
    val totalBB = (rateOfBB / 9 * totalInnings).toInt()
    val actualERA = calculateActualERA()
    val save = calculationSave()
    val win = calculateWin()
    val lose = calculateLose()
    val winRate = calculateWinRate()

    private fun calculateBattingAveAgainst(): Float {

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
        val kindOfChangeWeight = 1.0 + kindChangeAbility * kindOfChangeCoefficient
        val changePointForCalc = amountChangeAbility * kindOfChangeWeight
        battingAveAgainstElements[changeBallIndex] -= changePointForCalc * changeCoefficient

        // calculate from control
        val controlCoefficient = variableRangeEach / assumedMaxControl
        battingAveAgainstElements[controlIndex] -= controlAbility * controlCoefficient

        return battingAveAgainstElements.sum().toFloat()
    }

    private fun calculateBBRate(): Float {

        val minBBRate = when (pitcherType) {
            Constants.STARTER -> 0.6
            else -> 0.9
        }
        val maxBBRate = 6.0
        val variableRange = maxBBRate - minBBRate
        val controlCoefficient = variableRange / assumedMaxControl

        val rateOfBB9 = (maxBBRate - controlAbility * controlCoefficient).toFloat()
        if (rateOfBB9 < minBBRate) return minBBRate.toFloat()
        return rateOfBB9
    }

    private fun calculateKRate(): Float {
        val minKRate = 1.0
        val maxKRate = when (pitcherType) {
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
        elementsOfKRate[indexOfChange] = amountChangeAbility * (assignmentOfChange / assumedMaxChangeAmount)

        // calculate from folk
        val maxFolkAmount = 7
        val assignmentOfFolk = variableRange * weightOfFolk
        val folkAmount = changeBalls[2]
        elementsOfKRate[indexOfFolk] = folkAmount * (assignmentOfFolk / maxFolkAmount)

        // calculate from slider
        val maxSliderAmount = 7
        val assignmentOfSlider = variableRange * weightOfSlider
        val sliderAmount = changeBalls[0]
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

    private fun calculateGames(): Int {
        val maxGames = when (pitcherType) {
            Constants.STARTER -> 28
            Constants.MIDDLE -> 85
            else -> 70
        }
        val minGames = when (pitcherType) {
            Constants.STARTER -> 4
            else -> 10
        }

        val eraCoefficient = when (pitcherType) {
            Constants.STARTER -> 4
            Constants.MIDDLE -> 20
            else -> 12
        }
        val eraContribution = ((theoreticalERA - maxRequiredERA) * eraCoefficient).toInt()
        val kCoefficient = 0.1
        val kRateContribution = rateOfK * kCoefficient
        var actualGames = when (pitcherType) {
            Constants.MIDDLE -> ((maxGames - eraContribution) * kRateContribution).toInt() - lossOfStamina
            else -> (maxGames - eraContribution) - lossOfStamina
        }
        if (actualGames > maxGames) actualGames = maxGames
        if (actualGames < minGames) actualGames = minGames

        return actualGames
    }

    private fun calculateInningsPerGame(): Float {

        val maxInningsPerGame = when (pitcherType) {
            Constants.STARTER -> 9.0
            Constants.MIDDLE -> 1.2
            else -> 1.0
        }
        val minInningsPerGame = when (pitcherType) {
            Constants.STARTER -> 3.0
            Constants.MIDDLE -> 0.6
            else -> 0.7
        }
        val staminaCoefficient = when (pitcherType) {
            Constants.STARTER -> 0.06
            else -> 0.1
        }
        val minStarterStaminaContribution = 9.5
        val staminaContribution = when (pitcherType) {
            Constants.STARTER -> minStarterStaminaContribution + (staminaAbility - Constants.NEEDED_STARTER_STAMINA) * staminaCoefficient
            else -> lossOfStamina * staminaCoefficient
        }
        val eraCoefficient = when (pitcherType) {
            Constants.STARTER -> 1.0
            Constants.MIDDLE -> 0.15
            else -> 0.05
        }
        val eraContribution = when (pitcherType) {
            Constants.STARTER -> theoreticalERA * eraCoefficient
            else -> (theoreticalERA - maxRequiredERA) * eraCoefficient
        }
        val bbCoefficient = when (pitcherType) {
            Constants.STARTER -> 0.5
            else -> 0.07
        }
        val bbContribution = rateOfBB * bbCoefficient
        var inningsPerGame = when (pitcherType) {
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

    private fun calculationSave(): Int {
        if (pitcherType != Constants.CLOSER) return 0

        val saveSituationRate = 0.7
        val saveSituation = games * saveSituationRate
        // rate of losing more than 2run in 1inning
        val rateOfRunPerInning = theoreticalERA / oneGameInnings
        val runForLose = 2
        val saveFailRate = rateOfRunPerInning / runForLose

        return (saveSituation * (1 - saveFailRate)).toInt()
    }

    private fun calculateWin(): Int {
        val pitchingGames = games - save

        val contributionOfERA = 1 - theoreticalERA / 10
        var win = (pitchingGames * inningsPerGame / oneGameInnings * contributionOfERA * chance).toInt()
        if (win > pitchingGames) win = pitchingGames
        if (win < 0) win = 0

        return win
    }

    private fun calculateLose(): Int {
        var nonWinGame = games - win
        if (pitcherType == Constants.CLOSER) nonWinGame -= save

        val adjustmentCoefficient = when (pitcherType) {
            Constants.CLOSER -> 0.35
            else -> 0.2
        }
        val contributionOfERA = theoreticalERA * adjustmentCoefficient
        var lose = (nonWinGame * inningsPerGame / oneGameInnings * contributionOfERA).toInt()
        if (lose > nonWinGame) lose = nonWinGame
        if (lose < 0) lose = 0

        return lose
    }


    private fun lankMaking(ability: Int): String {

        return when (ability) {
            in -100..19 -> Constants.LANK_G
            in 20..39 -> Constants.LANK_F
            in 40..64 -> Constants.LANK_E
            in 65..79 -> Constants.LANK_D
            in 80..94 -> Constants.LANK_C
            in 95..109 -> Constants.LANK_B
            else -> Constants.LANK_A
        }
    }

    /**
     * 球速計算
     */
    private fun calculateMaxSpeed(ability: Int): Int {
        val plusSpeed = when {
            ability < 10 -> {
                0
            }
            ability < 30 -> {
                ability / 2
            }
            ability < 60 -> {
                5 + ability / 3
            }
            ability < 100 -> {
                10 + ability / 4
            }
            else -> {
                15 + ability / 5
            }
        }
        return minSpeed + plusSpeed
    }

    /**
     * 総変化量計算
     */
    private fun calculateTotalChangeAmount(changeAmount: Int, kindsOfChange: Int): Int {
        if (kindsOfChange > 2) return changeAmount / 15 * 2
        return changeAmount / 15 * kindsOfChange
    }


    // 変化球の球種数
    private fun calculateNumberOfChangeBalls(kindsOfChange: Int): Int {
        return when (kindsOfChange) {
            in -100..5 -> 0
            in 6..39 -> 1
            in 40..79 -> 2
            in 80..119 -> 3
            in 120..139 -> 4
            else -> 5
        }
    }

    // 変化球球種・変化量
    private fun calculateChangeBalls(kindChangeAbility: Int, amountOfChange: Int, priorityOfChange: ArrayList<Int>): ArrayList<Int> {

        val newPriorityChange: ArrayList<Int> = remakePriorityOfChange(kindChangeAbility, priorityOfChange)
        val changeBalls: ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0)
        // 分母
        var denominator = 0
        for (i in 0 until newPriorityChange.size) {
            denominator += newPriorityChange[i]
        }

        if (denominator == 0) return changeBalls
        for (i in 0 until newPriorityChange.size) {
            changeBalls[i] = (amountOfChange * newPriorityChange[i] / denominator)
            if (changeBalls[i] < 0) changeBalls[i] = 0
            if (changeBalls[i] > 7) changeBalls[i] = 7
        }

        return changeBalls
    }

    // 変化球優先順位と種類数上限から優先順位再生成
    private fun remakePriorityOfChange(kindChangeAbility: Int, oldPriorityChange: ArrayList<Int>): ArrayList<Int> {
        val newPriorityChange: ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0)
        if (kindChangeAbility == 0) return newPriorityChange

        for (i in 1..kindChangeAbility) {
            val maxChange = oldPriorityChange.max() ?: return newPriorityChange
            val maxIndex = oldPriorityChange.indexOf(maxChange)
            newPriorityChange[maxIndex] = maxChange
            oldPriorityChange[maxIndex] = 0
        }

        return newPriorityChange
    }

}