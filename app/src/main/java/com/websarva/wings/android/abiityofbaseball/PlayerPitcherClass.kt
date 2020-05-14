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
    val battingAveAgainst = calculateBattingAveAgainst()

    fun calculateBattingAveAgainst() : Float {

        var battingAveAgainstElements = arrayOf(0.15, 0.15, 0.15)

        // calculate from ball speed
        var ballSpeedPoint = max_speed - 120
        if (pitcherType == Constants.STARTER) ballSpeedPoint -= 10
        battingAveAgainstElements[0] -= ballSpeedPoint * 0.003

        // calculate from change ball
        battingAveAgainstElements[1] -= (amount_change_ability * (1.0 + kind_change_ability * 0.1)) * 0.005

        // calculate from control
        battingAveAgainstElements[2] -= control_ability * 0.000625

        return battingAveAgainstElements.sum().toFloat()
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