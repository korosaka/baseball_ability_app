package com.websarva.wings.android.abiityofbaseball

class PlayerClass(name:String,contact:Int,power:Int,speed:Int,arm:Int,fielding:Int) {

    private val playerName = name
    private val contact_ability = contact
    private val power_ability = power
    private val speed_ability = speed
    private val arm_ability = arm
    private val fielding_ability = fielding


    private val contact_lank = lankMaking(contact_ability)
    private var power_lank = lankMaking(power_ability)
    private var speed_lank = lankMaking(speed_ability)
    private var arm_lank = lankMaking(arm_ability)
    private var fielding_lank = lankMaking(fielding_ability)


    fun lankMaking(ability:Int):String{

        when(ability){

            in 0..10 -> return "G"
            in 11..20 -> return "F"
            in 21..30 -> return "E"
            in 31..40 -> return "D"
            in 41..50 -> return "C"
            in 51..60 -> return "B"
            else -> return "A"
        }
    }

    fun getName():String{return this.playerName}
    fun getContact():String{return this.contact_lank}
    fun getPower():String{return this.power_lank}
    fun getSpeed():String{return this.speed_lank}
    fun getArm():String{return this.arm_lank}
    fun getFielding():String{return this.fielding_lank}








}