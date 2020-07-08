package com.websarva.wings.android.abiityofbaseball.calc_ability

import android.content.Context
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R

class CalcMaleFielderAbility(
        private val context: Context,
        private val answersAppearance: Array<String>,
        private val answersPersonality: Array<String>,
        private val answersOther: Array<String>) : CalcFielderAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val manAnswersA1 = context.resources.getStringArray(R.array.m_array_q1_a)

        when (answersAppearance[0]) {
            manAnswersA1[0] -> {
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 6)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.CONTACT, 2)
            }
            manAnswersA1[1] -> {
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 2)
            }
            manAnswersA1[2] -> {
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.POWER, 10)
                plusAbility(Constants.ARM_STRENGTH, 1)
            }
            manAnswersA1[3] -> {
                plusAbility(Constants.FIRST_BASE, 4)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.POWER, 16)
                plusAbility(Constants.ARM_STRENGTH, 3)
            }
            manAnswersA1[4] -> {
                plusAbility(Constants.FIRST_BASE, 6)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 8)
                plusAbility(Constants.POWER, 20)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
        }
        val manAnswersA2 = context.resources.getStringArray(R.array.m_array_q2_a)
        when (answersAppearance[1]) {
            manAnswersA2[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
            }
            manAnswersA2[1] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 2)
            }
            manAnswersA2[2] -> {
                plusAbility(Constants.CATCHER, 6)
                plusAbility(Constants.FIRST_BASE, 6)
                plusAbility(Constants.SECOND_BASE, -15)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, -15)
                plusAbility(Constants.BALLISTIC, 20)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, -12)
                plusAbility(Constants.ARM_STRENGTH, -6)
            }
            manAnswersA2[3] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -9)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -7)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, -3)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
            manAnswersA2[4] -> {
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
            manAnswersA2[5] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 3)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.POWER, 12)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
            }
            manAnswersA2[6] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 4)
                plusAbility(Constants.SECOND_BASE, -15)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -8)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 9)
                plusAbility(Constants.POWER, 18)
                plusAbility(Constants.SPEED, -10)
                plusAbility(Constants.ARM_STRENGTH, 2)
            }
        }
        val manAnswersA3 = context.resources.getStringArray(R.array.m_array_q3_a)
        when (answersAppearance[2]) {
            manAnswersA3[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
            }
            manAnswersA3[1] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersA3[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 8)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 8)
            }
            manAnswersA3[3] -> {
                plusAbility(Constants.CATCHER, -4)
                plusAbility(Constants.FIRST_BASE, -4)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 11)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersA3[4] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 8)
            }
            manAnswersA3[5] -> {
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }
        val manAnswersA4 = context.resources.getStringArray(R.array.m_array_q4_a)
        when (answersAppearance[3]) {
            manAnswersA4[0] -> {
            }
            manAnswersA4[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 6)
            }
            manAnswersA4[2] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 2)
            }
            manAnswersA4[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 5)
                plusSpecial(Constants.CHANCE, -0.01)
            }
            manAnswersA4[4] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersA4[5] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 6)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersA4[6] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
            manAnswersA4[7] -> {
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
            manAnswersA4[8] -> {
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.CATCHING, -2)
            }
        }
        val manAnswersA5 = context.resources.getStringArray(R.array.m_array_q5_a)
        when (answersAppearance[4]) {
            manAnswersA5[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersA5[1] -> {
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
            manAnswersA5[2] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 2)
            }
            manAnswersA5[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersA5[4] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.CATCHING, -1)
            }
            manAnswersA5[5] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }
        val manAnswersA6 = context.resources.getStringArray(R.array.m_array_q6_a)
        when (answersAppearance[5]) {
            manAnswersA6[0] -> {
            }
            manAnswersA6[1] -> {
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
            }
            manAnswersA6[2] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, -2)
            }
            manAnswersA6[3] -> {
                plusAbility(Constants.CATCHER, -2)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersA6[4] -> {
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
            manAnswersA6[5] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -4)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
            }
            manAnswersA6[6] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, -2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 5)
            }
        }

        val manAnswersP1 = context.resources.getStringArray(R.array.m_array_q1_p)
        when (answersPersonality[0]) {
            manAnswersP1[0] -> {
            }
            manAnswersP1[1] -> {
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
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersP1[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersP1[3] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -1)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
            manAnswersP1[4] -> {
                plusAbility(Constants.CATCHER, -4)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -4)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -4)
            }
            manAnswersP1[5] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP1[6] -> {
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
        val manAnswersP2 = context.resources.getStringArray(R.array.m_array_q2_p)
        when (answersPersonality[1]) {
            manAnswersP2[0] -> {
            }
            manAnswersP2[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersP2[2] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersP2[3] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.CATCHING, -1)
            }
            manAnswersP2[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            manAnswersP2[5] -> {
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
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP2[6] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersP2[7] -> {
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 3)
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }
        val manAnswersP3 = context.resources.getStringArray(R.array.m_array_q3_p)
        when (answersPersonality[2]) {
            manAnswersP3[0] -> {
            }
            manAnswersP3[1] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersP3[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, -2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersP3[3] -> {
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
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP3[4] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, -2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, -1)
                plusSpecial(Constants.CHANCE, -0.01)
            }
            manAnswersP3[5] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersP3[6] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 4)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 4)
            }
        }
        val manAnswersP4 = context.resources.getStringArray(R.array.m_array_q4_p)
        when (answersPersonality[3]) {
            manAnswersP4[0] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersP4[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -4)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 6)
                plusSpecial(Constants.CHANCE, -0.01)
            }
            manAnswersP4[2] -> {
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
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP4[3] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 6)
                plusAbility(Constants.SPEED, 11)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 9)
                plusAbility(Constants.CATCHING, 4)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP4[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 2)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -4)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 4)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, -4)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP4[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, 6)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, -0.03)
            }
        }
        val manAnswersP5 = context.resources.getStringArray(R.array.m_array_q5_p)
        when (answersPersonality[4]) {
            manAnswersP5[0] -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersP5[1] -> {
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
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            manAnswersP5[2] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.SPEED, 3)
            }
            manAnswersP5[3] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersP5[4] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersP5[5] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP5[6] -> {
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.OUTFIELD, -3)
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, -0.02)
            }
        }
        val manAnswersP6 = context.resources.getStringArray(R.array.m_array_q6_p)
        when (answersPersonality[5]) {
            manAnswersP6[0] -> {
            }
            manAnswersP6[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 6)
            }
            manAnswersP6[2] -> {
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.CATCHING, -3)
            }
            manAnswersP6[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -4)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 4)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.CATCHING, -3)
            }
            manAnswersP6[4] -> {
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP6[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -3)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, -3)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersP6[6] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -5)
                plusSpecial(Constants.CHANCE, -0.02)
            }
            manAnswersP6[7] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 8)
            }
            manAnswersP6[8] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 5)
            }
        }

        val manAnswersO1 = context.resources.getStringArray(R.array.m_array_q1_o)
        when (answersOther[0]) {
            manAnswersO1[0] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 8)
                plusAbility(Constants.CONTACT, 13)
                plusAbility(Constants.POWER, 9)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersO1[1] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersO1[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 4)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 4)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 7)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersO1[3] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersO1[4] -> {
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -1)
            }
        }
        val manAnswersO2 = context.resources.getStringArray(R.array.m_array_q2_o)
        when (answersOther[1]) {
            manAnswersO2[0] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 9)
                plusAbility(Constants.FIELDING, 11)
                plusAbility(Constants.CATCHING, 14)
            }
            manAnswersO2[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 10)
            }
            manAnswersO2[2] -> {
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersO2[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
            }
            manAnswersO2[4] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.CONTACT, -1)
                plusAbility(Constants.POWER, -1)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -3)
                plusAbility(Constants.FIELDING, -3)
                plusAbility(Constants.CATCHING, -6)
            }
        }
        val manAnswersO3 = context.resources.getStringArray(R.array.m_array_q3_o)
        when (answersOther[2]) {
            manAnswersO3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
            }
            manAnswersO3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
            }
            manAnswersO3[2] -> {
            }
            manAnswersO3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
            }
            manAnswersO3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
            }
        }
        val manAnswersO5 = context.resources.getStringArray(R.array.m_array_q5_o)
        when (answersOther[4]) {
            manAnswersO5[0] -> {
            }
            manAnswersO5[1] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 10)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersO5[2] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, 5)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 10)
                plusAbility(Constants.SPEED, 10)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 5)
                plusAbility(Constants.CATCHING, 2)
            }
            manAnswersO5[3] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersO5[4] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, -3)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 14)
            }
            manAnswersO5[5] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -5)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersO5[6] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.CATCHING, -3)
            }
            manAnswersO5[7] -> {
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }
        val manAnswersO6 = context.resources.getStringArray(R.array.m_array_q6_o)
        when (answersOther[5]) {
            manAnswersO6[0] -> {
            }
            manAnswersO6[1] -> {
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersO6[2] -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            manAnswersO6[3] -> {
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.SPEED, 7)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 3)
            }
            manAnswersO6[4] -> {
                plusAbility(Constants.CATCHER, 2)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.OUTFIELD, 2)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 1)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersO6[5] -> {
                plusAbility(Constants.CATCHER, 4)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 4)
            }
            manAnswersO6[6] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.BALLISTIC, 5)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.CATCHING, -5)
            }
            manAnswersO6[7] -> {
                plusAbility(Constants.BALLISTIC, 3)
                plusSpecial(Constants.CHANCE, 0.05)
            }
        }

        val manAnswersO4 = context.resources.getStringArray(R.array.m_array_q4_o)
        when (answersOther[3]) {
            manAnswersO4[0] -> {
                contact = (contact * 1.2).toInt()
                power = (power * 1.2).toInt()
                speed = (speed * 1.2).toInt()
                armStrength = (armStrength * 1.2).toInt()
                fielding = (fielding * 1.2).toInt()
                catching = (catching * 1.2).toInt()
            }
            manAnswersO4[1] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            manAnswersO4[2] -> {
            }
            manAnswersO4[3] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            manAnswersO4[4] -> {
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