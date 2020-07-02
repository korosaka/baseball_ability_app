package com.websarva.wings.android.abiityofbaseball

import android.content.Context

class CalcMaleFielderAbility(
        private val context: Context,
        private val a1_a: String, private val a2_a: String, private val a3_a: String, private val a4_a: String, private val a5_a: String,
        private val a1_p: String, private val a2_p: String, private val a3_p: String, private val a4_p: String, private val a5_p: String,
        private val a1_o: String, private val a2_o: String, private val a3_o: String, private val a4_o: String, private val a5_o: String
) : CalcFielderAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val manAnswersA1 = context.resources.getStringArray(R.array.m_array_q1_a)

        when (a1_a) {
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
        when (a2_a) {
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
            manAnswersA2[5] -> {
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
        when (a3_a) {
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
        }
        val manAnswersA4 = context.resources.getStringArray(R.array.m_array_q4_a)
        when (a4_a) {
            manAnswersA4[0] -> {
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
            manAnswersA4[1] -> {
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
            manAnswersA4[2] -> {
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
                plusSpecial(Constants.CHANCE, -0.02)
            }
            manAnswersA4[3] -> {
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
            manAnswersA4[4] -> {
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
            manAnswersA4[5] -> {
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
        }
        val manAnswersA5 = context.resources.getStringArray(R.array.m_array_q5_a)
        when (a5_a) {
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
            manAnswersA5[2] -> {
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
            manAnswersA5[3] -> {
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
            manAnswersA5[4] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -2)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusSpecial(Constants.CHANCE, 0.04)
            }
        }
        val manAnswersP1 = context.resources.getStringArray(R.array.m_array_q1_p)
        when (a1_p) {
            manAnswersP1[0] -> {
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
            manAnswersP1[1] -> {
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
            manAnswersP1[2] -> {
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
            manAnswersP1[3] -> {
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
            manAnswersP1[4] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, 1)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 3)
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }
        val manAnswersP2 = context.resources.getStringArray(R.array.m_array_q2_p)
        when (a2_p) {
            manAnswersP2[0] -> {
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
            manAnswersP2[1] -> {
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
            manAnswersP2[2] -> {
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
            manAnswersP2[3] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            manAnswersP2[4] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 6)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 4)
                plusAbility(Constants.ARM_STRENGTH, 4)
                plusAbility(Constants.FIELDING, 2)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            manAnswersP2[5] -> {
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
                plusSpecial(Constants.CHANCE, 0.01)
            }
        }
        val manAnswersP3 = context.resources.getStringArray(R.array.m_array_q3_p)
        when (a3_p) {
            manAnswersP3[0] -> {
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
            manAnswersP3[1] -> {
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
            manAnswersP3[2] -> {
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
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersP3[3] -> {
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
                plusSpecial(Constants.CHANCE, -0.02)
            }
            manAnswersP3[4] -> {
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
        }
        val manAnswersP4 = context.resources.getStringArray(R.array.m_array_q4_p)
        when (a4_p) {
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
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 2)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 9)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 6)
                plusAbility(Constants.CATCHING, 2)
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersP4[3] -> {
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
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersP4[4] -> {
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
                plusSpecial(Constants.CHANCE, -0.5)
            }
        }
        val manAnswersP5 = context.resources.getStringArray(R.array.m_array_q5_p)
        when (a5_p) {
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
                plusSpecial(Constants.CHANCE, 0.01)
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
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersP5[4] -> {
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.OUTFIELD, -3)
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -1)
                plusSpecial(Constants.CHANCE, -0.03)
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
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }
        val manAnswersPop1 = context.resources.getStringArray(R.array.m_array_q1_o)
        when (a1_o) {
            manAnswersPop1[0] -> {
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
            manAnswersPop1[1] -> {
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
            manAnswersPop1[2] -> {
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
                plusSpecial(Constants.CHANCE, 0.03)
            }
            manAnswersPop1[3] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.ARM_STRENGTH, 2)
                plusAbility(Constants.FIELDING, 2)
                plusAbility(Constants.CATCHING, 1)
            }
            manAnswersPop1[4] -> {
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -1)
            }
        }
        val manAnswersPop2 = context.resources.getStringArray(R.array.m_array_q2_o)
        when (a2_o) {
            manAnswersPop2[0] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.POWER, 4)
                plusAbility(Constants.SPEED, 6)
                plusAbility(Constants.ARM_STRENGTH, 10)
                plusAbility(Constants.FIELDING, 12)
                plusAbility(Constants.CATCHING, 15)
            }
            manAnswersPop2[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 2)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 10)
            }
            manAnswersPop2[2] -> {
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 3)
                plusAbility(Constants.CATCHING, 5)
            }
            manAnswersPop2[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
            }
            manAnswersPop2[4] -> {
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
        val manAnswersPop3 = context.resources.getStringArray(R.array.m_array_q3_o)
        when (a3_o) {
            manAnswersPop3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
            }
            manAnswersPop3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
            }
            manAnswersPop3[2] -> {
            }
            manAnswersPop3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
            }
            manAnswersPop3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
            }
        }
        val manAnswersPop5 = context.resources.getStringArray(R.array.m_array_q5_o)
        when (a5_o) {
            manAnswersPop5[0] -> {
            }
            manAnswersPop5[1] -> {
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
                plusSpecial(Constants.CHANCE, 0.05)
            }
            manAnswersPop5[2] -> {
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
            manAnswersPop5[3] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.FIRST_BASE, -5)
                plusAbility(Constants.SECOND_BASE, 4)
                plusAbility(Constants.THIRD_BASE, -10)
                plusAbility(Constants.SHORTSTOP, 3)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 8)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, 10)
                plusAbility(Constants.CATCHING, 8)
            }
            manAnswersPop5[4] -> {
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
                plusSpecial(Constants.CHANCE, 0.02)
            }
            manAnswersPop5[5] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -5)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, -2)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            manAnswersPop5[6] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.FIRST_BASE, -1)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 3)
                plusAbility(Constants.SHORTSTOP, 1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.POWER, 7)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 12)
                plusAbility(Constants.CATCHING, -3)
            }
        }

        val manAnswersPop4 = context.resources.getStringArray(R.array.m_array_q4_o)
        when (a4_o) {
            manAnswersPop4[0] -> {
                contact = (contact * 1.2).toInt()
                power = (power * 1.2).toInt()
                speed = (speed * 1.2).toInt()
                armStrength = (armStrength * 1.2).toInt()
                fielding = (fielding * 1.2).toInt()
                catching = (catching * 1.2).toInt()
            }
            manAnswersPop4[1] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            manAnswersPop4[2] -> {
            }
            manAnswersPop4[3] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            manAnswersPop4[4] -> {
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