package com.websarva.wings.android.abiityofbaseball

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
    var ballSpeed = 0
    var control = 0
    var stamina = 0
    var kindsOfChangeBall = 0
    var amountOfChange = 0
    var priorityOfChange = arrayListOf(0, 0, 0, 0, 0)

    private var pitcherTypes = intArrayOf(0, 0, 0)
    lateinit var pitcherType: String

    protected fun plusAbility(initial: String, point: Int) {
        when (initial) {
            Constants.BALL_SPEED -> ballSpeed += point
            Constants.CONTROL -> control += point
            Constants.STAMINA -> stamina += point
            Constants.KIND_CHANGE -> kindsOfChangeBall += point
            Constants.AMOUNT_CHANGE -> amountOfChange += point

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

    // decide pitcher type
    protected fun setPitcherType() {

        val typeIndex = pitcherTypes.indices.maxBy {
            pitcherTypes[it]
        } ?: STARTER_INDEX
        when (typeIndex) {
            STARTER_INDEX -> {
                pitcherType = Constants.STARTER
                if (stamina < Constants.NEEDED_STARTER_STAMINA) setSecondType()
            }
            MIDDLE_INDEX -> {
                pitcherType = Constants.MIDDLE
            }
            CLOSER_INDEX -> {
                pitcherType = Constants.CLOSER
            }
        }
    }

    private fun setSecondType() {
        pitcherType = Constants.MIDDLE
        if (pitcherTypes[CLOSER_INDEX] > pitcherTypes[MIDDLE_INDEX]) pitcherType = Constants.CLOSER
    }

}