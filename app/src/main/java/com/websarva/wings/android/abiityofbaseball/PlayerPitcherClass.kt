package com.websarva.wings.android.abiityofbaseball

import java.io.Serializable
import kotlin.math.ceil

class PlayerPitcherClass(
        val playerName: String,
        val pitcherType: String,
        private val ballSpeedAbility: Int,
        val controlAbility: Int,
        val staminaAbility: Int,
        kindsOfChange: Int,
        amountOfChange: Int,
        priorityOfChange: ArrayList<Int>,
        val chance: Double) : Serializable {

    val kindChangeAbility = calculateNumberOfChangeBalls(kindsOfChange)
    val amountChangeAbility = calculateTotalChangeAmount(amountOfChange, kindChangeAbility)

    private val minSpeed = 120
    val controlLank = lankMaking(controlAbility)
    val staminaLank = lankMaking(staminaAbility)
    val maxSpeed = calculateMaxSpeed(ballSpeedAbility)

    val changeBalls = calculateChangeBalls(kindChangeAbility, amountChangeAbility, priorityOfChange)



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