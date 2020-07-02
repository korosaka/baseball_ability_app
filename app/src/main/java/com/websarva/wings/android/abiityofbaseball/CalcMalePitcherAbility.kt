package com.websarva.wings.android.abiityofbaseball

import android.content.Context

class CalcMalePitcherAbility(
        private val context: Context,
        private val a1_a: String, private val a2_a: String, private val a3_a: String, private val a4_a: String, private val a5_a: String,
        private val a1_p: String, private val a2_p: String, private val a3_p: String, private val a4_p: String, private val a5_p: String,
        private val a1_o: String, private val a2_o: String, private val a3_o: String, private val a4_o: String, private val a5_o: String
) : CalcPitcherAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val manAnswersA1 = context.resources.getStringArray(R.array.m_array_q1_a)

        when (a1_a) {
            manAnswersA1[0] -> {
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 1)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.MIDDLE, 5)
            }
            manAnswersA1[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.MIDDLE, 3)
            }
            manAnswersA1[2] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.STARTER, 3)
            }
            manAnswersA1[3] -> {
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 12)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.MIDDLE, -3)
            }
            manAnswersA1[4] -> {
                plusAbility(Constants.BALL_SPEED, 16)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 18)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.MIDDLE, -5)
            }
        }
        val manAnswersA2 = context.resources.getStringArray(R.array.m_array_q2_a)
        when (a2_a) {
            manAnswersA2[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            manAnswersA2[1] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, -3)
            }
            manAnswersA2[2] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.CLOSER, 1)
            }
            manAnswersA2[3] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, 2)
            }
            manAnswersA2[4] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 13)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 5)
            }
            manAnswersA2[5] -> {
                plusAbility(Constants.BALL_SPEED, 25)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.CLOSER, 4)
            }
        }
        val manAnswersA3 = context.resources.getStringArray(R.array.m_array_q3_a)
        when (a3_a) {
            manAnswersA3[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            manAnswersA3[1] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 5)
            }
            manAnswersA3[2] -> {
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 5)
            }
            manAnswersA3[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.MIDDLE, 4)
            }
            manAnswersA3[4] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 10)
            }
        }
        val manAnswersA4 = context.resources.getStringArray(R.array.m_array_q4_a)
        when (a4_a) {
            manAnswersA4[0] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersA4[1] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.STARTER, 3)
            }
            manAnswersA4[2] -> {
                plusSpecial(Constants.CHANCE, -0.02)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            manAnswersA4[3] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 3)
            }
            manAnswersA4[4] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 7)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersA4[5] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, -2)
            }
        }
        val manAnswersA5 = context.resources.getStringArray(R.array.m_array_q5_a)
        when (a5_a) {
            manAnswersA5[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            manAnswersA5[1] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.STARTER, 1)
            }
            manAnswersA5[2] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 4)
            }
            manAnswersA5[3] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, 4)
            }
            manAnswersA5[4] -> {
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -5)
            }
        }
        val manAnswersP1 = context.resources.getStringArray(R.array.m_array_q1_p)
        when (a1_p) {
            manAnswersP1[0] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.CLOSER, -2)
            }
            manAnswersP1[1] -> {
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            manAnswersP1[2] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersP1[3] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)
            }
            manAnswersP1[4] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
        }
        val manAnswersP2 = context.resources.getStringArray(R.array.m_array_q2_p)
        when (a2_p) {
            manAnswersP2[0] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 1)
            }
            manAnswersP2[1] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.STARTER, 10)
            }
            manAnswersP2[2] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 12)
                plusAbility(Constants.CLOSER, 4)
            }
            manAnswersP2[3] -> {
                plusAbility(Constants.MIDDLE, 4)
            }
            manAnswersP2[4] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.CLOSER, 6)
            }
            manAnswersP2[5] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)
                plusAbility(Constants.STARTER, 4)
            }
        }
        val manAnswersP3 = context.resources.getStringArray(R.array.m_array_q3_p)
        when (a3_p) {
            manAnswersP3[0] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 20)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 10)
            }
            manAnswersP3[1] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            manAnswersP3[2] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 1)
            }
            manAnswersP3[3] -> {
                plusSpecial(Constants.CHANCE, -0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, -1)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersP3[4] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 1)
            }
        }
        val manAnswersP4 = context.resources.getStringArray(R.array.m_array_q4_p)
        when (a4_p) {
            manAnswersP4[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            manAnswersP4[1] -> {
                plusSpecial(Constants.CHANCE, -0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CLOSER, -2)
            }
            manAnswersP4[2] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            manAnswersP4[3] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -4)
                plusAbility(Constants.MIDDLE, -2)
            }
            manAnswersP4[4] -> {
                plusSpecial(Constants.CHANCE, -0.5)
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
                plusAbility(Constants.STARTER, 5)
            }
        }
        val manAnswersP5 = context.resources.getStringArray(R.array.m_array_q5_p)
        when (a5_p) {
            manAnswersP5[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
            }
            manAnswersP5[1] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            manAnswersP5[2] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
            }
            manAnswersP5[3] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            manAnswersP5[4] -> {
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
            }
            manAnswersP5[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
            }
        }
        val manAnswersPop1 = context.resources.getStringArray(R.array.m_array_q1_o)
        when (a1_o) {
            manAnswersPop1[0] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, 4)
            }
            manAnswersPop1[1] -> {
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 9)
                plusAbility(Constants.AMOUNT_CHANGE, 9)
                plusAbility(Constants.STARTER, 2)
            }
            manAnswersPop1[2] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -3)
            }
            manAnswersPop1[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersPop1[4] -> {
                plusAbility(Constants.BALL_SPEED, -2)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -1)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -5)
                plusAbility(Constants.MIDDLE, 3)
            }
        }
        val manAnswersPop2 = context.resources.getStringArray(R.array.m_array_q2_o)
        when (a2_o) {
            manAnswersPop2[0] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 18)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.STARTER, 5)
            }
            manAnswersPop2[1] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 12)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            manAnswersPop2[2] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
            }
            manAnswersPop2[3] -> {
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.STAMINA, -4)
            }
            manAnswersPop2[4] -> {
                plusAbility(Constants.BALL_SPEED, -1)
                plusAbility(Constants.CONTROL, -10)
                plusAbility(Constants.STAMINA, -10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
            }
        }
        val manAnswersPop3 = context.resources.getStringArray(R.array.m_array_q3_o)
        when (a3_o) {
            manAnswersPop3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
                plusAbility(Constants.CLOSER, 3)

            }
            manAnswersPop3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.CLOSER, 2)
            }
            manAnswersPop3[2] -> {
            }
            manAnswersPop3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersPop3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
                plusAbility(Constants.MIDDLE, 4)
            }
        }
        val manAnswersPop5 = context.resources.getStringArray(R.array.m_array_q5_o)
        when (a5_o) {
            manAnswersPop5[0] -> {
            }
            manAnswersPop5[1] -> {
                plusSpecial(Constants.CHANCE, 0.05)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 16)
                plusAbility(Constants.KIND_CHANGE, 16)
                plusAbility(Constants.AMOUNT_CHANGE, 16)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.MIDDLE, -5)
            }
            manAnswersPop5[2] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.STAMINA, 25)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 8)
            }
            manAnswersPop5[3] -> {
                plusAbility(Constants.CONTROL, 17)
                plusAbility(Constants.KIND_CHANGE, 12)
            }
            manAnswersPop5[4] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.CLOSER, 3)
            }
            manAnswersPop5[5] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.STAMINA, -8)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 3)
            }
            manAnswersPop5[6] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.SHOOT, 9)
                plusAbility(Constants.MIDDLE, 2)
            }
        }

        val manAnswersPop4 = context.resources.getStringArray(R.array.m_array_q4_o)
        when (a4_o) {
            manAnswersPop4[0] -> {
                ballSpeed = (ballSpeed * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.3).toInt()
                amountOfChange = (amountOfChange * 1.3).toInt()
            }
            manAnswersPop4[1] -> {
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.15).toInt()
                amountOfChange = (amountOfChange * 1.15).toInt()
            }
            manAnswersPop4[2] -> {
            }
            manAnswersPop4[3] -> {
                ballSpeed = (ballSpeed * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 1.1).toInt()
                amountOfChange = (amountOfChange * 1.1).toInt()
            }
            manAnswersPop4[4] -> {
                control = (control * 0.9).toInt()
                stamina = (stamina * 0.9).toInt()
                kindsOfChangeBall = (kindsOfChangeBall * 0.8).toInt()
                amountOfChange = (amountOfChange * 0.8).toInt()
            }
        }
        setPitcherType()

    }


}