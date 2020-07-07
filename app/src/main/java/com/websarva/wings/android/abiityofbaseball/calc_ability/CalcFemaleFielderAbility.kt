package com.websarva.wings.android.abiityofbaseball.calc_ability

import android.content.Context
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R

class CalcFemaleFielderAbility(
        private val context: Context,
        private val answersAppearance: Array<String>,
        private val answersPersonality: Array<String>,
        private val answersOther: Array<String>) : CalcFielderAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val womanAnswersA1 = context.resources.getStringArray(R.array.w_array_q1_a)
        when (answersAppearance[0]) {
            womanAnswersA1[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 6)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.CONTACT, 2)
            }
            womanAnswersA1[1] -> {
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 2)
            }
            womanAnswersA1[2] -> {
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.ARM_STRENGTH, 1)
            }
            womanAnswersA1[3] -> {
                plusAbility(Constants.FIRST_BASE, 4)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.POWER, 11)
                plusAbility(Constants.ARM_STRENGTH, 3)
            }
            womanAnswersA1[4] -> {
                plusAbility(Constants.FIRST_BASE, 6)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 8)
                plusAbility(Constants.POWER, 15)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
        }

        val womanAnswersA2 = context.resources.getStringArray(R.array.w_array_q2_a)
        when (answersAppearance[1]) {
            womanAnswersA2[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
            }
            womanAnswersA2[1] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
            }
            womanAnswersA2[2] -> {
                plusAbility(Constants.CATCHER, 6)
                plusAbility(Constants.FIRST_BASE, 6)
                plusAbility(Constants.SECOND_BASE, -15)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, -15)
                plusAbility(Constants.BALLISTIC, 20)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, -12)
                plusAbility(Constants.ARM_STRENGTH, -6)
            }
            womanAnswersA2[3] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -9)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -7)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, -5)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
            womanAnswersA2[4] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -9)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 11)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
            womanAnswersA2[5] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 20)
                plusAbility(Constants.SECOND_BASE, -20)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -15)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 25)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 9)
                plusAbility(Constants.SPEED, -10)
                plusAbility(Constants.ARM_STRENGTH, -7)
                plusAbility(Constants.FIELDING, -5)
                plusAbility(Constants.CATCHING, -5)
            }
        }

        val womanAnswersA3 = context.resources.getStringArray(R.array.w_array_q3_a)
        when (answersAppearance[2]) {
            womanAnswersA3[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersA3[1] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, -4)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
            }
            womanAnswersA3[2] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 7)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersA3[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 8)
            }
            womanAnswersA3[4] -> {
                plusAbility(Constants.CATCHER, -4)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersA3[5] -> {
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }

        val womanAnswersA4 = context.resources.getStringArray(R.array.w_array_q4_a)
        when (answersAppearance[3]) {
            womanAnswersA4[0] -> {
            }
            womanAnswersA4[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 5)
            }
            womanAnswersA4[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 9)
            }
            womanAnswersA4[3] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.CATCHING, -2)
            }
            womanAnswersA4[4] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 6)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 7)
            }
            womanAnswersA4[5] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersA4[6] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.CATCHING, -2)
            }
            womanAnswersA4[7] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 2)
            }
            womanAnswersA4[8] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 4)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 5)
            }
        }

        val womanAnswersA5 = context.resources.getStringArray(R.array.w_array_q5_a)
        when (answersAppearance[4]) {
            womanAnswersA5[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
            }
            womanAnswersA5[1] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
            }
            womanAnswersA5[2] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 2)
            }
            womanAnswersA5[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersA5[4] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.CATCHING, -1)
            }
            womanAnswersA5[5] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }
        val womanAnswersA6 = context.resources.getStringArray(R.array.w_array_q6_a)
        when (answersAppearance[5]) {
            womanAnswersA6[0] -> {
            }
            womanAnswersA6[1] -> {
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
            }
            womanAnswersA6[2] -> {
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
            womanAnswersA6[3] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
            }
            womanAnswersA6[4] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
            }
            womanAnswersA6[5] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.CATCHING, -3)
            }
            womanAnswersA6[6] -> {
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 5)
            }
        }

        val womanAnswersP1 = context.resources.getStringArray(R.array.w_array_q1_p)
        when (answersPersonality[0]) {
            womanAnswersP1[0] -> {
            }
            womanAnswersP1[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            womanAnswersP1[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 4)
            }
            womanAnswersP1[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
            womanAnswersP1[4] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 6)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -5)
            }
            womanAnswersP1[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.FIELDING, -5)
                plusAbility(Constants.CATCHING, -8)
                plusSpecial(Constants.CHANCE, -0.05)
            }
            womanAnswersP1[6] -> {
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.CATCHING, -3)
            }
        }

        val womanAnswersP2 = context.resources.getStringArray(R.array.w_array_q2_p)
        when (answersPersonality[1]) {
            womanAnswersP2[0] -> {
            }
            womanAnswersP2[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 4)
            }
            womanAnswersP2[2] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
            }
            womanAnswersP2[3] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.ARM_STRENGTH, 9)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersP2[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            womanAnswersP2[5] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            womanAnswersP2[6] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -3)
            }
            womanAnswersP2[7] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            womanAnswersP2[8] -> {
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusSpecial(Constants.CHANCE, 0.03)
            }
        }

        val womanAnswersP3 = context.resources.getStringArray(R.array.w_array_q3_p)
        when (answersPersonality[2]) {
            womanAnswersP3[0] -> {
            }
            womanAnswersP3[1] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersP3[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, -2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            womanAnswersP3[3] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 5)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersP3[4] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.02)
            }
            womanAnswersP3[5] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersP3[6] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }

        val womanAnswersP4 = context.resources.getStringArray(R.array.w_array_q4_p)
        when (answersPersonality[3]) {
            womanAnswersP4[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
            }
            womanAnswersP4[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 7)
                plusSpecial(Constants.CHANCE, -0.01)
            }
            womanAnswersP4[2] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            womanAnswersP4[3] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 6)
                plusAbility(Constants.SPEED, 10)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 4)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            womanAnswersP4[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -4)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            womanAnswersP4[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, -0.05)
            }
        }

        val womanAnswersP5 = context.resources.getStringArray(R.array.w_array_q5_p)
        when (answersPersonality[4]) {
            womanAnswersP5[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
            }
            womanAnswersP5[1] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 5)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            womanAnswersP5[2] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.SPEED, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersP5[3] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersP5[4] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 4)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersP5[5] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 7)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            womanAnswersP5[6] -> {
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.OUTFIELD, -3)
                plusAbility(Constants.BALLISTIC, -3)
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.03)
            }
        }
        val womanAnswersP6 = context.resources.getStringArray(R.array.w_array_q6_p)
        when (answersPersonality[5]) {
            womanAnswersP6[0] -> {
            }
            womanAnswersP6[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersP6[2] -> {
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.CATCHING, -3)
            }
            womanAnswersP6[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.CATCHING, -3)
            }
            womanAnswersP6[4] -> {
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            womanAnswersP6[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            womanAnswersP6[6] -> {
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.CONTACT, 1)
            }
            womanAnswersP6[7] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 8)
            }
            womanAnswersP6[8] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 5)
            }
        }

        val womanAnswersO1 = context.resources.getStringArray(R.array.w_array_q1_o)
        when (answersOther[0]) {
            womanAnswersO1[0] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 9)
                plusAbility(Constants.CONTACT, 15)
                plusAbility(Constants.POWER, 10)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersO1[1] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersO1[2] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 6)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
            }
            womanAnswersO1[3] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
            }
            womanAnswersO1[4] -> {
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
            }
        }

        val womanAnswersO2 = context.resources.getStringArray(R.array.w_array_q2_o)
        when (answersOther[1]) {
            womanAnswersO2[0] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 12)
                plusAbility(Constants.FIELDING, 12)
                plusAbility(Constants.CATCHING, 15)
            }
            womanAnswersO2[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 10)
            }
            womanAnswersO2[2] -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersO2[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            womanAnswersO2[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, -1)
                plusAbility(Constants.SPEED, -1)
                plusAbility(Constants.ARM_STRENGTH, -5)
                plusAbility(Constants.FIELDING, -8)
                plusAbility(Constants.CATCHING, -6)
            }
        }

        val womanAnswersO3 = context.resources.getStringArray(R.array.w_array_q3_o)
        when (answersOther[2]) {
            womanAnswersO3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
            }
            womanAnswersO3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
            }
            womanAnswersO3[2] -> {
            }
            womanAnswersO3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
            }
            womanAnswersO3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
            }
        }

        val womanAnswersO5 = context.resources.getStringArray(R.array.w_array_q5_o)
        when (answersOther[4]) {
            womanAnswersO5[0] -> {
            }
            womanAnswersO5[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 7)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 14)
                plusAbility(Constants.ARM_STRENGTH, 10)
            }
            womanAnswersO5[2] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersO5[3] -> {
                plusAbility(Constants.CATCHER, 10)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.FIELDING, 2)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            womanAnswersO5[4] -> {
                plusAbility(Constants.CATCHER, -8)
                plusAbility(Constants.FIRST_BASE, 10)
                plusAbility(Constants.SECOND_BASE, -10)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 20)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 15)
                plusAbility(Constants.SPEED, -5)
                plusAbility(Constants.ARM_STRENGTH, -5)
                plusAbility(Constants.FIELDING, -6)
                plusAbility(Constants.CATCHING, -10)
            }
            womanAnswersO5[5] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 8)
            }
            womanAnswersO5[6] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersO5[7] -> {
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }

        val womanAnswersO6 = context.resources.getStringArray(R.array.w_array_q6_o)
        when (answersOther[5]) {
            womanAnswersO6[0] -> {
            }
            womanAnswersO6[1] -> {
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 5)
            }
            womanAnswersO6[2] -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusSpecial(Constants.CHANCE, 0.04)
            }
            womanAnswersO6[3] -> {
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.CONTACT, 7)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 3)
            }
            womanAnswersO6[4] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
            }
            womanAnswersO6[5] -> {
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersO6[6] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.02)
            }
            womanAnswersO6[7] -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusSpecial(Constants.CHANCE, 0.05)
            }
        }

        val womanAnswersO4 = context.resources.getStringArray(R.array.w_array_q4_o)
        when (answersOther[3]) {
            womanAnswersO4[0] -> {
                contact = (contact * 1.2).toInt()
                power = (power * 1.2).toInt()
                speed = (speed * 1.2).toInt()
                armStrength = (armStrength * 1.2).toInt()
                fielding = (fielding * 1.2).toInt()
                catching = (catching * 1.2).toInt()
            }
            womanAnswersO4[1] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            womanAnswersO4[2] -> {
            }
            womanAnswersO4[3] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            womanAnswersO4[4] -> {
                contact = (contact * 0.9).toInt()
                power = (power * 0.9).toInt()
                speed = (speed * 0.9).toInt()
                armStrength = (armStrength * 0.9).toInt()
                fielding = (fielding * 0.9).toInt()
                catching = (catching * 0.9).toInt()
            }
        }

        calcBallistic()
        setPosition()

    }

}