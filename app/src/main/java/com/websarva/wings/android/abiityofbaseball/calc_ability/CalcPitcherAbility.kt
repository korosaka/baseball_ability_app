package com.websarva.wings.android.abiityofbaseball.calc_ability

import com.websarva.wings.android.abiityofbaseball.Constants
import kotlin.properties.Delegates

open class CalcPitcherAbility {

    companion object {
        const val STARTER_INDEX = 0
        const val MIDDLE_INDEX = 1
        const val CLOSER_INDEX = 2

        const val SLIDER_INDEX = 0
        const val CURB_INDEX = 1
        const val FOLK_INDEX = 2
        const val SINKER_INDEX = 3
        const val SHOOT_INDEX = 4
    }

    var chance = 1.0

    // 投手能力ポイント
    private val minSpeed = 120
    var ballSpeedPoint = 0
    var maxBallSpeed by Delegates.notNull<Int>()
    var control = 0
    var stamina = 0
    var numberOfChangePoint = 0
    var numberOfChange by Delegates.notNull<Int>()
    var amountOfChangePoint = 0
    var totalAmountOfChange by Delegates.notNull<Int>()
    var priorityOfChange = arrayListOf(0, 0, 0, 0, 0)
    var changeBalls by Delegates.notNull<ArrayList<Int>>()

    private var pitcherTypes = intArrayOf(0, 0, 0)
    lateinit var pitcherType: String

    protected fun plusAbility(initial: String, point: Int) {
        when (initial) {
            Constants.BALL_SPEED -> ballSpeedPoint += point
            Constants.CONTROL -> control += point
            Constants.STAMINA -> stamina += point
            Constants.KIND_CHANGE -> numberOfChangePoint += point
            Constants.AMOUNT_CHANGE -> amountOfChangePoint += point

            Constants.SLIDER -> priorityOfChange[SLIDER_INDEX] += point
            Constants.CURB -> priorityOfChange[CURB_INDEX] += point
            Constants.FOLK -> priorityOfChange[FOLK_INDEX] += point
            Constants.SINKER -> priorityOfChange[SINKER_INDEX] += point
            Constants.SHOOT -> priorityOfChange[SHOOT_INDEX] += point

            Constants.STARTER -> pitcherTypes[STARTER_INDEX] += point
            Constants.MIDDLE -> pitcherTypes[MIDDLE_INDEX] += point
            Constants.CLOSER -> pitcherTypes[CLOSER_INDEX] += point
        }
    }

    protected fun plusSpecial(initial: String, point: Double) {
        when (initial) {
            Constants.CHANCE -> chance += point
        }
    }


    protected fun assignAbilities() {
        assignPitcherType()
        assignMaxSpeed()
        assignNumberOfChange()
        assignTotalAmountOfChange()
        assignChangeBalls()
    }

    private fun assignMaxSpeed() {
        maxBallSpeed = calculateMaxSpeed(ballSpeedPoint)
    }

    private fun assignNumberOfChange() {
        numberOfChange = calculateNumberOfChangeBalls(numberOfChangePoint)
    }

    private fun assignTotalAmountOfChange() {
        totalAmountOfChange = calculateTotalChangeAmount(amountOfChangePoint, numberOfChange)
    }

    private fun assignChangeBalls() {
        changeBalls = calculateChangeBalls(numberOfChange, totalAmountOfChange, priorityOfChange)
    }

    // decide pitcher type
    private fun assignPitcherType() {

        val typeIndex = pitcherTypes.indices.maxBy {
            pitcherTypes[it]
        } ?: STARTER_INDEX
        when (typeIndex) {
            STARTER_INDEX -> {
                pitcherType = Constants.STARTER
                if (stamina < Constants.NEEDED_STARTER_STAMINA) assignSecondType()
            }
            MIDDLE_INDEX -> {
                pitcherType = Constants.MIDDLE
            }
            CLOSER_INDEX -> {
                pitcherType = Constants.CLOSER
            }
        }
    }

    private fun assignSecondType() {
        pitcherType = Constants.MIDDLE
        if (pitcherTypes[CLOSER_INDEX] > pitcherTypes[MIDDLE_INDEX]) pitcherType = Constants.CLOSER
    }

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

    private fun calculateTotalChangeAmount(changeAmount: Int, kindsOfChange: Int): Int {
        if (kindsOfChange > 2) return changeAmount / 15 * 2
        return changeAmount / 15 * kindsOfChange
    }


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

        reCalcTotalAmountChange(changeBalls)
        return changeBalls
    }

    private fun reCalcTotalAmountChange(changeBalls: ArrayList<Int>) {
        totalAmountOfChange = 0
        changeBalls.forEach {
            totalAmountOfChange += it
        }
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