package com.websarva.wings.android.abiityofbaseball.player_class

import com.websarva.wings.android.abiityofbaseball.Constants
import java.io.*

class PlayerFielderClass (
        val playerName: String,
        val mainPosition: String,
        val ballisticAbility: Int,
        val contactAbility: Int,
        val powerAbility: Int,
        val speedAbility: Int,
        val armAbility: Int,
        val fieldingAbility: Int,
        val catchingAbility: Int,
        val chance: Double): Serializable {

    val contactLank = lankMaking(contactAbility)
    var powerLank = lankMaking(powerAbility)
    var speedLank = lankMaking(speedAbility)
    var armLank = lankMaking(armAbility)
    var fieldingLank = lankMaking(fieldingAbility)
    val catchingLank = lankMaking(catchingAbility)


    private fun lankMaking(ability: Int): String {

        return when (ability) {

            in Integer.MIN_VALUE..10 -> Constants.LANK_G
            in 11..20 -> Constants.LANK_F
            in 21..30 -> Constants.LANK_E
            in 31..40 -> Constants.LANK_D
            in 41..50 -> Constants.LANK_C
            in 51..60 -> Constants.LANK_B
            else -> Constants.LANK_A
        }
    }


}