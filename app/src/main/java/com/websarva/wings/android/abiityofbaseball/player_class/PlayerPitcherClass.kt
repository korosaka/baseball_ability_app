package com.websarva.wings.android.abiityofbaseball.player_class

import com.websarva.wings.android.abiityofbaseball.Constants
import java.io.Serializable

class PlayerPitcherClass(
        val playerName: String,
        val pitcherType: String,
        val maxBallSpeed: Int,
        val controlAbility: Int,
        val staminaAbility: Int,
        val numberOfChange: Int,
        val totalAmountOfChange: Int,
        val changeBalls: ArrayList<Int>,
        val chance: Double) : Serializable {

    val controlLank = lankMaking(controlAbility)
    val staminaLank = lankMaking(staminaAbility)


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

}