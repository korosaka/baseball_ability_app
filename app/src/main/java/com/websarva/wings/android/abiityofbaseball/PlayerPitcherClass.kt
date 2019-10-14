package com.websarva.wings.android.abiityofbaseball

class PlayerPitcherClass(name: String, ballSpeed: Int, control: Int, stamina: Int, kindsOfChange: Int, amountOfChange: Int, priorityOfChange: Array<Int>, chance: Double) {

    val playerName = name
    val ball_speed_ability = ballSpeed
    val control_ability = control
    val stamina_ability = stamina
    val kind_change_ability = calculateNumberOfChangeBalls(kindsOfChange)
    val amount_change_ability = amountOfChange

    val chance = chance


    val control_lank = lankMaking(control_ability)
    val stamina_lank = lankMaking(stamina_ability)
    val max_speed = calculateMaxSpeed(ball_speed_ability)
    val changeballs = calculateChangeBalls(kind_change_ability, amount_change_ability, priorityOfChange)


    fun lankMaking(ability: Int): String {

        when (ability) {

            in -100..10 -> return "G"
            in 11..20 -> return "F"
            in 21..30 -> return "E"
            in 31..40 -> return "D"
            in 41..50 -> return "C"
            in 51..60 -> return "B"
            else -> return "A"
        }
    }

    fun calculateMaxSpeed(ability: Int): Int {
        val maxSpeed = 120 + ability
        return maxSpeed
    }


    // 変化球の球種数
    fun calculateNumberOfChangeBalls(kindsOfChange: Int): Int {
        when (kindsOfChange) {

            in -100..10 -> return 0
            in 11..20 -> return 1
            in 21..30 -> return 2
            in 31..40 -> return 3
            in 41..50 -> return 4
            else -> return 5
        }
    }

    // 変化球球種・変化量
    fun calculateChangeBalls(kind_change_ability: Int, amountOfChange: Int, priorityOfChange: Array<Int>): IntArray {

        var changeballs = intArrayOf(0, 0, 0, 0, 0)
        // 分母
        var denominator = 0
        for (i in priorityOfChange) {
            denominator += priorityOfChange[i]
        }

        for (i in priorityOfChange) {
            changeballs[i] = (amountOfChange * priorityOfChange[i] / denominator)
            if (changeballs[i] < 0) changeballs[i] = 0
            if (changeballs[i] > 7) changeballs[i] = 7
        }

        return changeballs
    }

}