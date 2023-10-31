package com.websarva.wings.android.abiityofbaseball.calc_ability

import com.websarva.wings.android.abiityofbaseball.Constants


open class CalcFielderAbility {
    companion object {
        const val CATCHER_INDEX = 0
        const val FIRST_BASE_INDEX = 1
        const val SECOND_BASE_INDEX = 2
        const val THIRD_BASE_INDEX = 3
        const val SHORTSTOP_INDEX = 4
        const val OUTFIELD_INDEX = 5
    }

    var ballistic = 0
    var contact = 0
    var power = 0
    var speed = 0
    var armStrength = 0
    var fielding = 0
    var catching = 0

    private var positions = intArrayOf(0, 0, 0, 0, 0, 0)
    lateinit var position: String

    var chance = 1.0

    protected fun plusAbility(initial: String, point: Int) {
        when (initial) {
            Constants.BALLISTIC -> ballistic += point
            Constants.CONTACT -> contact += point
            Constants.POWER -> power += point
            Constants.SPEED -> speed += point
            Constants.ARM_STRENGTH -> armStrength += point
            Constants.FIELDING -> fielding += point
            Constants.CATCHING -> catching += point

            Constants.CATCHER -> positions[CATCHER_INDEX] += point
            Constants.FIRST_BASE -> positions[FIRST_BASE_INDEX] += point
            Constants.SECOND_BASE -> positions[SECOND_BASE_INDEX] += point
            Constants.THIRD_BASE -> positions[THIRD_BASE_INDEX] += point
            Constants.SHORTSTOP -> positions[SHORTSTOP_INDEX] += point
            Constants.OUTFIELD -> positions[OUTFIELD_INDEX] += point
        }
    }

    protected fun plusSpecial(initial: String, point: Double) {
        when (initial) {
            Constants.CHANCE -> chance += point
        }
    }

    protected fun setPosition() {
        val positionIndex = positions.indices.maxByOrNull {
            positions[it]
        }
        position = when (positionIndex) {
            CATCHER_INDEX -> Constants.CATCHER
            FIRST_BASE_INDEX -> Constants.FIRST_BASE
            SECOND_BASE_INDEX -> Constants.SECOND_BASE
            THIRD_BASE_INDEX -> Constants.THIRD_BASE
            SHORTSTOP_INDEX -> Constants.SHORTSTOP
            else -> Constants.OUTFIELD
        }
    }

    protected fun calcBallistic() {
        ballistic = when (ballistic) {
            in 0..10 -> 1
            in 11..20 -> 2
            in 21..30 -> when (power) {
                in 0..20 -> 2
                else -> 3
            }
            else -> when (power) {
                in 0..20 -> 2
                in 21..30 -> 3
                else -> 4
            }
        }
    }


}