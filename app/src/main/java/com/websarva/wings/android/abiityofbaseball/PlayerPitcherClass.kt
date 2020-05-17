package com.websarva.wings.android.abiityofbaseball

class PlayerPitcherClass(
        name: String,
        pitcherType: String,
        ballSpeed: Int,
        control: Int,
        stamina: Int,
        kindsOfChange: Int,
        amountOfChange: Int,
        priorityOfChange: ArrayList<Int>,
        chance: Double) {

    val playerName = name
    // TODO change name !
    val ball_speed_ability = ballSpeed
    val control_ability = control
    val stamina_ability = stamina
    val kind_change_ability = calculateNumberOfChangeBalls(kindsOfChange)
    val amount_change_ability = calculateTotalChangeAmount(amountOfChange, kind_change_ability)
    // TODO refactor (getter)
    private val pitcherType = pitcherType
    fun getPitcherType(): String {
        return this.pitcherType
    }

    val chance = chance


    val control_lank = lankMaking(control_ability)
    val stamina_lank = lankMaking(stamina_ability)
    val max_speed = calculateMaxSpeed(ball_speed_ability)

    val changeballs = calculateChangeBalls(kind_change_ability, amount_change_ability, priorityOfChange)

    // records of season
    // TODO object ??
    private val minSpeed = 120
    private val starterLossSpeed = 10
    private val addedSpeedToMin = when(pitcherType){
        Constants.STARTER -> max_speed - starterLossSpeed - minSpeed
        else -> max_speed - minSpeed
    }
    val battingAveAgainst = calculateBattingAveAgainst()
    val rateOfBB = calculateBBRate()
    val rateOfK = calculateKRate()
    val earnedRunAverage = calculateERA()
    val games = calculateGames()
    val inningsPerGame = calculateInningsPerGame()
    val totalInnings = (games * inningsPerGame).toInt()
    val win = calculateWin()
    val lose = calculateLose()

    private fun calculateBattingAveAgainst() : Float {

        val maxAveAgainst = 0.43
        val oneThirdOfMax = maxAveAgainst / 3.0

        var battingAveAgainstElements = arrayOf(oneThirdOfMax, oneThirdOfMax, oneThirdOfMax)

        // calculate from ball speed
        battingAveAgainstElements[0] -= addedSpeedToMin * 0.003

        // calculate from change ball
        battingAveAgainstElements[1] -= (amount_change_ability * (1.0 + kind_change_ability * 0.1)) * 0.005

        // calculate from control
        battingAveAgainstElements[2] -= control_ability * 0.000625

        return battingAveAgainstElements.sum().toFloat()
    }

    private fun calculateBBRate() : Float {

        val minBBRate = 0.5
        val maxBBRate = 6.5

        val rateOfBB9 = (maxBBRate - control_ability * 0.0375).toFloat()
        if (rateOfBB9 < minBBRate) return minBBRate.toFloat()
        return rateOfBB9
    }

    private fun calculateKRate() : Float {
        val minKRate = 1.0
        val maxKRate = 15.0

        val variableKRate = maxKRate - minKRate

        // total 1.0
        val weightOfSpeed = 0.6
        val weightOfChangeAmount = 0.2
        val weightOfFolk = 0.15
        val weightOfSlider = 0.05

        var elementsOfKRate = arrayOf(0.0, 0.0, 0.0, 0.0)
        val indexOfSpeed = 0
        val indexOfChange = 1
        val indexOfFolk = 2
        val indexOfSlider = 3

        // calculate from speed
        val assumedMaxSpeed = 165
        val assignmentOfSpeed = variableKRate * weightOfSpeed
        elementsOfKRate[indexOfSpeed] = addedSpeedToMin * (assignmentOfSpeed / (assumedMaxSpeed - minSpeed))

        // calculate from change ball
        val assumedMaxChangeAmount = 16
        val assignmentOfChange = variableKRate * weightOfChangeAmount
        elementsOfKRate[indexOfChange] = amount_change_ability * (assignmentOfChange / assumedMaxChangeAmount)

        // calculate from folk
        val maxFolkAmount = 7
        val assignmentOfFolk = variableKRate * weightOfFolk
        val folkAmount = changeballs[2]
        elementsOfKRate[indexOfFolk] = folkAmount * (assignmentOfFolk / maxFolkAmount)

        // calculate from slider
        val maxSliderAmount = 7
        val assignmentOfSlider = variableKRate * weightOfSlider
        val sliderAmount = changeballs[0]
        elementsOfKRate[indexOfSlider] = sliderAmount * (assignmentOfSlider / maxSliderAmount)


        return (minKRate + elementsOfKRate.sum()).toFloat()
    }

    private fun calculateERA() : Float {

        val runPerHit = 0.42
        val runPerBB = battingAveAgainst

        val hitsPer9 = 27 * battingAveAgainst / (1 - battingAveAgainst)

        return ((hitsPer9 * runPerHit) + (rateOfBB * runPerBB) - (rateOfK * 0.1)).toFloat()
    }

    private fun calculateGames(): Int {
        val maxGames = when(pitcherType) {
            Constants.STARTER -> 28
            Constants.MIDDLE -> 90
            else -> 70
        }
        val minGames = when(pitcherType) {
            Constants.STARTER -> 4
            else -> 10
        }
        val maxRequiredERA = when(pitcherType) {
            Constants.STARTER -> 3.0
            Constants.MIDDLE -> 1.8
            else -> 2.0
        }
        val minRequiredStamina = when(pitcherType) {
            Constants.MIDDLE -> 50
            Constants.CLOSER -> 40
            else -> 0
        }
        var lossOfStamina = minRequiredStamina - stamina_ability
        if (lossOfStamina < 0) lossOfStamina = 0

        var actualGames = when(pitcherType) {
            Constants.STARTER -> (maxGames - (earnedRunAverage - maxRequiredERA) * 4).toInt()
            Constants.MIDDLE -> ((maxGames - (earnedRunAverage - maxRequiredERA) * 20) * rateOfK * 0.1).toInt() - lossOfStamina
            else -> (maxGames - (earnedRunAverage - maxRequiredERA) * 12).toInt() - lossOfStamina
        }
        if (actualGames > maxGames) actualGames = maxGames
        if (actualGames < minGames) actualGames = minGames

        return actualGames
    }

    private fun calculateInningsPerGame(): Float {

        val maxRequiredERA = when(pitcherType) {
            Constants.STARTER -> 3.0
            Constants.MIDDLE -> 1.8
            else -> 2.0
        }
        val minRequiredStamina = when(pitcherType) {
            Constants.MIDDLE -> 50
            Constants.CLOSER -> 40
            else -> 0
        }
        var lossOfStamina = minRequiredStamina - stamina_ability
        if (lossOfStamina < 0) lossOfStamina = 0


        val maxInningsPerGame = when(pitcherType) {
            Constants.STARTER -> 8.5
            Constants.MIDDLE -> 1.2
            else -> 1.0
        }
        val minInningsPerGame = when(pitcherType) {
            Constants.STARTER -> 3.0
            Constants.MIDDLE -> 0.4
            else -> 0.6
        }
        var inningsPerGame = when(pitcherType) {
            Constants.STARTER -> stamina_ability * 0.1 - (earnedRunAverage / 2 + rateOfBB / 3)
            Constants.MIDDLE -> maxInningsPerGame - ((earnedRunAverage - maxRequiredERA) / 7 + rateOfBB / 14) - lossOfStamina / 10
            else -> maxInningsPerGame - ((earnedRunAverage - maxRequiredERA) / 20) - lossOfStamina / 10
        }
        if (inningsPerGame > maxInningsPerGame) inningsPerGame = maxInningsPerGame
        if (inningsPerGame < minInningsPerGame) inningsPerGame = minInningsPerGame

        return inningsPerGame.toFloat()
    }

    private fun calculateWin(): Int {
        var win = (games * inningsPerGame / 9.0 * (1 - earnedRunAverage / 10) * chance).toInt()
        if (win > games) win = games
        if (win < 0) win = 0

        return win
    }

    private fun calculateLose(): Int {
        val nonWinGame = games - win
        var lose = (nonWinGame * inningsPerGame / 9.0 * earnedRunAverage / 5).toInt()
        if (lose > nonWinGame) lose = nonWinGame
        if (lose < 0) lose = 0

        return lose
    }


    fun lankMaking(ability: Int): String {

        when (ability) {

            in -100..19 -> return Constants.LANK_G
            in 20..39 -> return Constants.LANK_F
            in 40..64 -> return Constants.LANK_E
            in 65..79 -> return Constants.LANK_D
            in 80..94 -> return Constants.LANK_C
            in 95..109 -> return Constants.LANK_B
            else -> return Constants.LANK_A
        }
    }

    /**
     * 球速計算
     */
    fun calculateMaxSpeed(ability: Int): Int {
        var plusSpeed = 0
        if (ability < 10) {
            plusSpeed = 0
        } else if (ability < 30) {
            plusSpeed = ability / 2
        } else if (ability < 60) {
            plusSpeed = 5 + ability / 3
        } else if (ability < 100) {
            plusSpeed = 10 + ability / 4
        } else {
            plusSpeed = 15 + ability / 5
        }
        // TODO refactor
        val maxSpeed = 120 + plusSpeed
        return maxSpeed
    }

    /**
     * 総変化量計算
     */
    fun calculateTotalChangeAmount(changeAmount: Int, kindsOfChange: Int): Int {
        if (kindsOfChange > 2) return changeAmount / 15 * 2
        return changeAmount / 15 * kindsOfChange
    }


    // 変化球の球種数
    fun calculateNumberOfChangeBalls(kindsOfChange: Int): Int {
        when (kindsOfChange) {

            in -100..5 -> return 0
            in 6..39 -> return 1
            in 40..79 -> return 2
            in 80..119 -> return 3
            in 120..139 -> return 4
            else -> return 5
        }
    }

    // 変化球球種・変化量
    fun calculateChangeBalls(kind_change_ability: Int, amountOfChange: Int, priorityOfChange: ArrayList<Int>): ArrayList<Int> {

        val newPriorityChange: ArrayList<Int> = remakePriorityOfChange(kind_change_ability, priorityOfChange)
        var changeballs: ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0)
        // 分母
        var denominator = 0
        for (i in 0..newPriorityChange.size - 1) {
            denominator += newPriorityChange[i]
        }

        if (denominator == 0) return changeballs
        for (i in 0..newPriorityChange.size - 1) {
            changeballs[i] = (amountOfChange * newPriorityChange[i] / denominator)
            if (changeballs[i] < 0) changeballs[i] = 0
            if (changeballs[i] > 7) changeballs[i] = 7
        }

        return changeballs
    }

    // 変化球優先順位と種類数上限から優先順位再生成
    fun remakePriorityOfChange(kind_change_ability: Int, priorityOfChange: ArrayList<Int>): ArrayList<Int> {
        var newPriorityChange: ArrayList<Int> = arrayListOf(0, 0, 0, 0, 0)
        var oldPriorityChange = priorityOfChange

        if (kind_change_ability == 0) return newPriorityChange

        for (i in 1..kind_change_ability) {
            val maxChange = oldPriorityChange.max()
            if (maxChange == null) return newPriorityChange
            val maxIndex = oldPriorityChange.indexOf(maxChange)
            newPriorityChange[maxIndex] = maxChange
            oldPriorityChange[maxIndex] = 0
        }

        return newPriorityChange
    }

}