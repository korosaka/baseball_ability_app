package com.websarva.wings.android.abiityofbaseball

class PlayerClass(name: String, contact: Int, power: Int, speed: Int, arm: Int, fielding: Int, catching: Int, chance: Double) {

    val playerName = name
    val contactAbility = contact
    val powerAbility = power
    val speedAbility = speed
    val armAbility = arm
    val fieldingAbility = fielding
    val catchingAbility = catching

    val chance = chance


    val contactLank = lankMaking(contactAbility)
    var powerLank = lankMaking(powerAbility)
    var speedLank = lankMaking(speedAbility)
    var armLank = lankMaking(armAbility)
    var fieldingLank = lankMaking(fieldingAbility)
    val catchingLank = lankMaking(catchingAbility)


    private fun lankMaking(ability: Int): String {

        return when (ability) {

            in -100..10 -> Constants.LANK_G
            in 11..20 -> Constants.LANK_F
            in 21..30 -> Constants.LANK_E
            in 31..40 -> Constants.LANK_D
            in 41..50 -> Constants.LANK_C
            in 51..60 -> Constants.LANK_B
            else -> Constants.LANK_A
        }
    }


}