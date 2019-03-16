package com.websarva.wings.android.abiityofbaseball

class PlayerClass(name:String,contact:Int,power:Int,speed:Int,arm:Int,fielding:Int,chance:Double) {

    val playerName = name
    val contact_ability = contact
    val power_ability = power
    val speed_ability = speed
    val arm_ability = arm
    val fielding_ability = fielding

    val chance = chance


    val contact_lank = lankMaking(contact_ability)
    var power_lank = lankMaking(power_ability)
    var speed_lank = lankMaking(speed_ability)
    var arm_lank = lankMaking(arm_ability)
    var fielding_lank = lankMaking(fielding_ability)


    fun lankMaking(ability:Int):String{

        when(ability){

            in -100..10 -> return "G"
            in 11..20 -> return "F"
            in 21..30 -> return "E"
            in 31..40 -> return "D"
            in 41..50 -> return "C"
            in 51..60 -> return "B"
            else -> return "A"
        }
    }



}