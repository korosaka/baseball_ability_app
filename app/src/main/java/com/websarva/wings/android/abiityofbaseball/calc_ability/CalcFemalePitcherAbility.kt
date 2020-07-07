package com.websarva.wings.android.abiityofbaseball.calc_ability

import android.content.Context
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R

class CalcFemalePitcherAbility(
        private val context: Context,
        private val answersAppearance: Array<String>,
        private val answersPersonality: Array<String>,
        private val answersOther: Array<String>) : CalcPitcherAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val womanAnswersA1 = context.resources.getStringArray(R.array.w_array_q1_a)
        when (answersAppearance[0]) {
            womanAnswersA1[0] -> {
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 1)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.MIDDLE, 5)
            }
            womanAnswersA1[1] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            womanAnswersA1[2] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.STARTER, 2)
            }
            womanAnswersA1[3] -> {
                plusAbility(Constants.BALL_SPEED, 13)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 12)
                plusAbility(Constants.MIDDLE, -2)
                plusAbility(Constants.STARTER, 3)
            }
            womanAnswersA1[4] -> {
                plusAbility(Constants.BALL_SPEED, 16)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 20)
                plusAbility(Constants.MIDDLE, -4)
                plusAbility(Constants.STARTER, 3)
            }
        }

        val womanAnswersA2 = context.resources.getStringArray(R.array.w_array_q2_a)
        when (answersAppearance[1]) {
            womanAnswersA2[0] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
            }
            womanAnswersA2[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.CLOSER, -2)
            }
            womanAnswersA2[2] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CURB, 5)
                plusAbility(Constants.STARTER, -5)
            }
            womanAnswersA2[3] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.CLOSER, 2)
            }
            womanAnswersA2[4] -> {
                plusAbility(Constants.BALL_SPEED, 18)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.MIDDLE, -3)
                plusAbility(Constants.STARTER, 3)
            }
            womanAnswersA2[5] -> {
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.KIND_CHANGE, 9)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, -5)
            }
        }

        val womanAnswersA3 = context.resources.getStringArray(R.array.w_array_q3_a)
        when (answersAppearance[2]) {
            womanAnswersA3[0] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
            }
            womanAnswersA3[1] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.CLOSER, -10)
            }
            womanAnswersA3[2] -> {
                plusAbility(Constants.BALL_SPEED, 13)
                plusAbility(Constants.CONTROL, 11)
                plusAbility(Constants.STAMINA, 11)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.SINKER, 1)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 6)
            }
            womanAnswersA3[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.CLOSER, -7)
            }
            womanAnswersA3[4] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 8)
                plusAbility(Constants.CLOSER, 5)
            }
            womanAnswersA3[5] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.STARTER, -5)
            }
        }

        val womanAnswersA4 = context.resources.getStringArray(R.array.w_array_q4_a)
        when (answersAppearance[3]) {
            womanAnswersA4[0] -> {
            }
            womanAnswersA4[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 9)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 1)
            }
            womanAnswersA4[2] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.CLOSER, -4)
            }
            womanAnswersA4[3] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.CLOSER, 5)
            }
            womanAnswersA4[4] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 7)
            }
            womanAnswersA4[5] -> {
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 5)
            }
            womanAnswersA4[6] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 7)
            }
            womanAnswersA4[7] -> {
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
            womanAnswersA4[8] -> {
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
        }

        val womanAnswersA5 = context.resources.getStringArray(R.array.w_array_q5_a)
        when (answersAppearance[4]) {
            womanAnswersA5[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            womanAnswersA5[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
            }
            womanAnswersA5[2] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 13)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 2)
            }
            womanAnswersA5[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.CLOSER, -6)
            }
            womanAnswersA5[4] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.MIDDLE, -6)
            }
            womanAnswersA5[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 15)
                plusAbility(Constants.STARTER, -5)
            }
        }
        val womanAnswersA6 = context.resources.getStringArray(R.array.w_array_q6_a)
        when (answersAppearance[5]) {
            womanAnswersA6[0] -> {
            }
            womanAnswersA6[1] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.MIDDLE, -5)
            }
            womanAnswersA6[2] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
            }
            womanAnswersA6[3] -> {
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            womanAnswersA6[4] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 1)
            }
            womanAnswersA6[5] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SINKER, 1)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.MIDDLE, -3)
            }
            womanAnswersA6[6] -> {
                plusAbility(Constants.BALL_SPEED, -3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.MIDDLE, 5)
            }
        }

        val womanAnswersP1 = context.resources.getStringArray(R.array.w_array_q1_p)
        when (answersPersonality[0]) {
            womanAnswersP1[0] -> {
            }
            womanAnswersP1[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
            }
            womanAnswersP1[2] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.CLOSER, -5)
            }
            womanAnswersP1[3] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 6)
            }
            womanAnswersP1[4] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.MIDDLE, 2)
            }
            womanAnswersP1[5] -> {
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 5)
            }
            womanAnswersP1[6] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.CLOSER, 5)
            }
        }

        val womanAnswersP2 = context.resources.getStringArray(R.array.w_array_q2_p)
        when (answersPersonality[1]) {
            womanAnswersP2[0] -> {
            }
            womanAnswersP2[1] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 1)
            }
            womanAnswersP2[2] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 16)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.STARTER, 9)
            }
            womanAnswersP2[3] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 12)
                plusAbility(Constants.CLOSER, 5)
            }
            womanAnswersP2[4] -> {
                plusAbility(Constants.MIDDLE, 8)
            }
            womanAnswersP2[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.CLOSER, 6)
            }
            womanAnswersP2[6] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.FOLK, 3)
            }
            womanAnswersP2[7] -> {
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 3)
            }
            womanAnswersP2[8] -> {
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 5)
            }
        }

        val womanAnswersP3 = context.resources.getStringArray(R.array.w_array_q3_p)
        when (answersPersonality[2]) {
            womanAnswersP3[0] -> {
            }
            womanAnswersP3[1] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 9)
            }
            womanAnswersP3[2] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, -7)
            }
            womanAnswersP3[3] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.CLOSER, -4)
            }
            womanAnswersP3[4] -> {
                plusSpecial(Constants.CHANCE, -0.02)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.SHOOT, 7)
            }
            womanAnswersP3[5] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 3)
            }
            womanAnswersP3[6] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 9)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, 3)
            }
        }

        val womanAnswersP4 = context.resources.getStringArray(R.array.w_array_q4_p)
        when (answersPersonality[3]) {
            womanAnswersP4[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
            }
            womanAnswersP4[1] -> {
                plusSpecial(Constants.CHANCE, -0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CLOSER, -5)
            }
            womanAnswersP4[2] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            womanAnswersP4[3] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            womanAnswersP4[4] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -4)
            }
            womanAnswersP4[5] -> {
                plusSpecial(Constants.CHANCE, -0.05)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
                plusAbility(Constants.STARTER, 4)
            }
        }

        val womanAnswersP5 = context.resources.getStringArray(R.array.w_array_q5_p)
        when (answersPersonality[4]) {
            womanAnswersP5[0] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
            }
            womanAnswersP5[1] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            womanAnswersP5[2] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            womanAnswersP5[3] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            womanAnswersP5[4] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
            }
            womanAnswersP5[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            womanAnswersP5[6] -> {
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
            }
        }
        val womanAnswersP6 = context.resources.getStringArray(R.array.w_array_q6_p)
        when (answersPersonality[5]) {
            womanAnswersP6[0] -> {
            }
            womanAnswersP6[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 1)
            }
            womanAnswersP6[2] -> {
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.SHOOT, 4)
            }
            womanAnswersP6[3] -> {
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -2)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            womanAnswersP6[4] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.CLOSER, 4)
            }
            womanAnswersP6[5] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SINKER, 4)
            }
            womanAnswersP6[6] -> {
                plusSpecial(Constants.CHANCE, -0.01)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, -2)
            }
            womanAnswersP6[7] -> {
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
            }
            womanAnswersP6[8] -> {
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
            }
        }

        val womanAnswersO1 = context.resources.getStringArray(R.array.w_array_q1_o)
        when (answersOther[0]) {
            womanAnswersO1[0] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 18)
                plusAbility(Constants.AMOUNT_CHANGE, 18)
                plusAbility(Constants.STARTER, 6)
            }
            womanAnswersO1[1] -> {
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, 3)
            }
            womanAnswersO1[2] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
            }
            womanAnswersO1[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
            }
            womanAnswersO1[4] -> {
                plusAbility(Constants.BALL_SPEED, -3)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -1)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
                plusAbility(Constants.MIDDLE, 5)
            }
        }

        val womanAnswersO2 = context.resources.getStringArray(R.array.w_array_q2_o)
        when (answersOther[1]) {
            womanAnswersO2[0] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 18)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 6)
            }
            womanAnswersO2[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 12)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.STARTER, 3)
            }
            womanAnswersO2[2] -> {
                plusAbility(Constants.BALL_SPEED, 1)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 6)
            }
            womanAnswersO2[3] -> {
                plusAbility(Constants.BALL_SPEED, 1)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -1)
            }
            womanAnswersO2[4] -> {
                plusAbility(Constants.BALL_SPEED, -1)
                plusAbility(Constants.CONTROL, -8)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
            }
        }

        val womanAnswersO3 = context.resources.getStringArray(R.array.w_array_q3_o)
        when (answersOther[2]) {
            womanAnswersO3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
                plusAbility(Constants.CLOSER, 5)
            }
            womanAnswersO3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.CLOSER, 2)
            }
            womanAnswersO3[2] -> {
            }
            womanAnswersO3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
                plusAbility(Constants.CLOSER, -2)
            }
            womanAnswersO3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
                plusAbility(Constants.CLOSER, -5)
            }
        }

        val womanAnswersO5 = context.resources.getStringArray(R.array.w_array_q5_o)
        when (answersOther[4]) {
            womanAnswersO5[0] -> {
            }
            womanAnswersO5[1] -> {
                plusAbility(Constants.BALL_SPEED, 14)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 6)
            }
            womanAnswersO5[2] -> {
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.CURB, 7)
                plusAbility(Constants.SINKER, 5)
            }
            womanAnswersO5[3] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 6)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 15)
            }
            womanAnswersO5[4] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 16)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, -8)
            }
            womanAnswersO5[5] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, 11)
                plusAbility(Constants.STAMINA, 11)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.STARTER, 6)
            }
            womanAnswersO5[6] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.STARTER, -6)
                plusAbility(Constants.CLOSER, 2)
            }
            womanAnswersO5[7] -> {
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.SINKER, 3)
            }
        }

        val womanAnswersO6 = context.resources.getStringArray(R.array.w_array_q6_o)
        when (answersOther[5]) {
            womanAnswersO6[0] -> {
            }
            womanAnswersO6[1] -> {
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            womanAnswersO6[2] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
            }
            womanAnswersO6[3] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 4)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.MIDDLE, -5)
            }
            womanAnswersO6[4] -> {
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.MIDDLE, 5)
            }
            womanAnswersO6[5] -> {
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
            }
            womanAnswersO6[6] -> {
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.STAMINA, -5)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
            }
            womanAnswersO6[7] -> {
                plusSpecial(Constants.CHANCE, 0.05)
            }
        }

        val womanAnswersO4 = context.resources.getStringArray(R.array.w_array_q4_o)
        when (answersOther[3]) {
            womanAnswersO4[0] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.3).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.3).toInt()
            }
            womanAnswersO4[1] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.15).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.15).toInt()
            }
            womanAnswersO4[2] -> {
            }
            womanAnswersO4[3] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.1).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.1).toInt()
            }
            womanAnswersO4[4] -> {
                control = (control * 0.9).toInt()
                stamina = (stamina * 0.9).toInt()
                numberOfChangePoint = (numberOfChangePoint * 0.8).toInt()
                amountOfChangePoint = (amountOfChangePoint * 0.8).toInt()
            }
        }

        assignAbilities()

    }

}