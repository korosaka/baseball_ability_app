package com.websarva.wings.android.abiityofbaseball

import android.content.Context

class CalcFemaleFielderAbility(
        private val context: Context,
        private val a1_a: String, private val a2_a: String, private val a3_a: String, private val a4_a: String, private val a5_a: String,
        private val a1_p: String, private val a2_p: String, private val a3_p: String, private val a4_p: String, private val a5_p: String,
        private val a1_o: String, private val a2_o: String, private val a3_o: String, private val a4_o: String, private val a5_o: String
) : CalcFielderAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val womanAnswersA1 = context.resources.getStringArray(R.array.w_array_q1_a)
        when (a1_a) {
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
        when (a2_a) {
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
        when (a3_a) {
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
        }

        val womanAnswersA4 = context.resources.getStringArray(R.array.w_array_q4_a)
        when (a4_a) {
            womanAnswersA4[0] -> {
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
            womanAnswersA4[1] -> {
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
            womanAnswersA4[2] -> {
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
            womanAnswersA4[3] -> {
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
            womanAnswersA4[4] -> {
                plusAbility(Constants.CATCHER, 1)
                plusAbility(Constants.FIRST_BASE, 1)
                plusAbility(Constants.SECOND_BASE, 5)
                plusAbility(Constants.THIRD_BASE, -5)
                plusAbility(Constants.SHORTSTOP, 2)
                plusAbility(Constants.OUTFIELD, -1)
                plusAbility(Constants.CONTACT, 4)
                plusAbility(Constants.SPEED, 2)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersA4[5] -> {
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
        }

        val womanAnswersA5 = context.resources.getStringArray(R.array.w_array_q5_a)
        when (a5_a) {
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
            womanAnswersA5[2] -> {
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
            womanAnswersA5[3] -> {
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
            womanAnswersA5[4] -> {
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

        val womanAnswersP1 = context.resources.getStringArray(R.array.w_array_q1_p)
        when (a1_p) {
            womanAnswersP1[0] -> {
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
            womanAnswersP1[1] -> {
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
            womanAnswersP1[2] -> {
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
            womanAnswersP1[3] -> {
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
            womanAnswersP1[4] -> {
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

        }

        val womanAnswersP2 = context.resources.getStringArray(R.array.w_array_q2_p)
        when (a2_p) {
            womanAnswersP2[0] -> {
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
            womanAnswersP2[1] -> {
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
            womanAnswersP2[2] -> {
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
            womanAnswersP2[3] -> {
                plusAbility(Constants.CATCHER, -5)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            womanAnswersP2[4] -> {
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
            womanAnswersP2[5] -> {
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

        val womanAnswersP3 = context.resources.getStringArray(R.array.w_array_q3_p)
        when (a3_p) {
            womanAnswersP3[0] -> {
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
            womanAnswersP3[1] -> {
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
            womanAnswersP3[2] -> {
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
            womanAnswersP3[3] -> {
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
            womanAnswersP3[4] -> {
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

        }

        val womanAnswersP4 = context.resources.getStringArray(R.array.w_array_q4_p)
        when (a4_p) {
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
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.FIRST_BASE, -2)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.SHORTSTOP, 5)
                plusAbility(Constants.OUTFIELD, 1)
                plusAbility(Constants.BALLISTIC, 3)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.SPEED, 9)
                plusAbility(Constants.ARM_STRENGTH, 6)
                plusAbility(Constants.FIELDING, 7)
                plusAbility(Constants.CATCHING, 3)
                plusSpecial(Constants.CHANCE, 0.03)
            }
            womanAnswersP4[3] -> {
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
            womanAnswersP4[4] -> {
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
        when (a5_p) {
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
                plusAbility(Constants.THIRD_BASE, -3)
                plusAbility(Constants.OUTFIELD, -3)
                plusAbility(Constants.BALLISTIC, -3)
                plusAbility(Constants.POWER, -2)
                plusAbility(Constants.FIELDING, -2)
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, -0.03)
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
        }

        val womanAnswersPop1 = context.resources.getStringArray(R.array.w_array_q1_o)
        when (a1_o) {
            womanAnswersPop1[0] -> {
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
            womanAnswersPop1[1] -> {
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
            womanAnswersPop1[2] -> {
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
            womanAnswersPop1[3] -> {
                plusAbility(Constants.BALLISTIC, 1)
                plusAbility(Constants.CONTACT, 3)
                plusAbility(Constants.POWER, 3)
            }
            womanAnswersPop1[4] -> {
                plusAbility(Constants.SHORTSTOP, -5)
                plusAbility(Constants.CONTACT, -3)
                plusAbility(Constants.POWER, -3)
                plusAbility(Constants.SPEED, -2)
                plusAbility(Constants.ARM_STRENGTH, -1)
                plusAbility(Constants.FIELDING, -1)
            }
        }

        val womanAnswersPop2 = context.resources.getStringArray(R.array.w_array_q2_o)
        when (a2_o) {
            womanAnswersPop2[0] -> {
                plusAbility(Constants.CATCHER, 5)
                plusAbility(Constants.SECOND_BASE, 2)
                plusAbility(Constants.CONTACT, 5)
                plusAbility(Constants.POWER, 5)
                plusAbility(Constants.SPEED, 8)
                plusAbility(Constants.ARM_STRENGTH, 12)
                plusAbility(Constants.FIELDING, 12)
                plusAbility(Constants.CATCHING, 15)
            }
            womanAnswersPop2[1] -> {
                plusAbility(Constants.CATCHER, 3)
                plusAbility(Constants.SECOND_BASE, 1)
                plusAbility(Constants.CONTACT, 2)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.SPEED, 5)
                plusAbility(Constants.ARM_STRENGTH, 8)
                plusAbility(Constants.FIELDING, 8)
                plusAbility(Constants.CATCHING, 10)
            }
            womanAnswersPop2[2] -> {
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 1)
                plusAbility(Constants.SPEED, 3)
                plusAbility(Constants.ARM_STRENGTH, 5)
                plusAbility(Constants.FIELDING, 4)
                plusAbility(Constants.CATCHING, 6)
            }
            womanAnswersPop2[3] -> {
                plusAbility(Constants.CATCHER, -3)
                plusAbility(Constants.SECOND_BASE, -1)
                plusAbility(Constants.ARM_STRENGTH, 1)
                plusAbility(Constants.FIELDING, 1)
            }
            womanAnswersPop2[4] -> {
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

        val womanAnswersPop3 = context.resources.getStringArray(R.array.w_array_q3_o)
        when (a3_o) {
            womanAnswersPop3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
            }
            womanAnswersPop3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
            }
            womanAnswersPop3[2] -> {
            }
            womanAnswersPop3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
            }
            womanAnswersPop3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
            }
        }

        val womanAnswersPop5 = context.resources.getStringArray(R.array.w_array_q5_o)
        when (a5_o) {
            womanAnswersPop5[0] -> {
            }
            womanAnswersPop5[1] -> {
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
            womanAnswersPop5[2] -> {
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
            womanAnswersPop5[3] -> {
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
            womanAnswersPop5[4] -> {
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
            womanAnswersPop5[5] -> {
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
                plusAbility(Constants.CATCHING, -2)
                plusSpecial(Constants.CHANCE, 0.01)
            }
            womanAnswersPop5[6] -> {
                plusAbility(Constants.CATCHER, -1)
                plusAbility(Constants.FIRST_BASE, 5)
                plusAbility(Constants.SECOND_BASE, -3)
                plusAbility(Constants.THIRD_BASE, 5)
                plusAbility(Constants.SHORTSTOP, -1)
                plusAbility(Constants.OUTFIELD, 3)
                plusAbility(Constants.BALLISTIC, 7)
                plusAbility(Constants.CONTACT, 1)
                plusAbility(Constants.POWER, 3)
                plusAbility(Constants.ARM_STRENGTH, 3)
                plusAbility(Constants.FIELDING, -1)
                plusAbility(Constants.CATCHING, -3)
                plusSpecial(Constants.CHANCE, 0.02)
            }
        }

        val womanAnswersPop4 = context.resources.getStringArray(R.array.w_array_q4_o)
        when (a4_o) {
            womanAnswersPop4[0] -> {
                contact = (contact * 1.2).toInt()
                power = (power * 1.2).toInt()
                speed = (speed * 1.2).toInt()
                armStrength = (armStrength * 1.2).toInt()
                fielding = (fielding * 1.2).toInt()
                catching = (catching * 1.2).toInt()
            }
            womanAnswersPop4[1] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            womanAnswersPop4[2] -> {
            }
            womanAnswersPop4[3] -> {
                contact = (contact * 1.1).toInt()
                power = (power * 1.1).toInt()
                speed = (speed * 1.1).toInt()
                armStrength = (armStrength * 1.1).toInt()
                fielding = (fielding * 1.1).toInt()
                catching = (catching * 1.1).toInt()
            }
            womanAnswersPop4[4] -> {
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