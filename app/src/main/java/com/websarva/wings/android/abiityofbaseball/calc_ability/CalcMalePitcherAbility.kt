package com.websarva.wings.android.abiityofbaseball.calc_ability

import android.content.Context
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R

class CalcMalePitcherAbility(
        private val context: Context,
        private val answersAppearance: Array<String>,
        private val answersPersonality: Array<String>,
        private val answersOther: Array<String>) : CalcPitcherAbility() {

    init {
        calcAbility()
    }

    private fun calcAbility() {
        val manAnswersA1 = context.resources.getStringArray(R.array.m_array_q1_a)

        when (answersAppearance[0]) {
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
        when (answersAppearance[1]) {
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
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 13)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 5)
                plusAbility(Constants.SHOOT, 2)
                plusAbility(Constants.STARTER, 5)
            }
            manAnswersA2[5] -> {
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
            manAnswersA2[6] -> {
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
        when (answersAppearance[2]) {
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
            manAnswersA3[5] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.STARTER, -5)
            }
        }
        val manAnswersA4 = context.resources.getStringArray(R.array.m_array_q4_a)
        when (answersAppearance[3]) {
            manAnswersA4[0] -> {
            }
            manAnswersA4[1] -> {
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
            manAnswersA4[2] -> {
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
            manAnswersA4[3] -> {
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
            manAnswersA4[4] -> {
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
            manAnswersA4[5] -> {
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
            manAnswersA4[6] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, -2)
            }
            manAnswersA4[7] -> {
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 5)
            }
            manAnswersA4[8] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.CLOSER, 5)
            }
        }
        val manAnswersA5 = context.resources.getStringArray(R.array.m_array_q5_a)
        when (answersAppearance[4]) {
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
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 2)
            }
            manAnswersA5[2] -> {
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
            manAnswersA5[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.MIDDLE, 4)
            }
            manAnswersA5[4] -> {
                plusAbility(Constants.BALL_SPEED, 9)
                plusAbility(Constants.CONTROL, 1)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.CLOSER, 4)
            }
            manAnswersA5[5] -> {
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 4)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -5)
            }
        }
        val manAnswersA6 = context.resources.getStringArray(R.array.m_array_q6_a)
        when (answersAppearance[5]) {
            manAnswersA6[0] -> {
            }
            manAnswersA6[1] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.MIDDLE, -5)
            }
            manAnswersA6[2] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
            }
            manAnswersA6[3] -> {
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            manAnswersA6[4] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.CURB, 1)
            }
            manAnswersA6[5] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.STAMINA, 8)
            }
            manAnswersA6[6] -> {
                plusAbility(Constants.BALL_SPEED, -3)
                plusAbility(Constants.CONTROL, 9)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.MIDDLE, 5)
            }
        }

        val manAnswersP1 = context.resources.getStringArray(R.array.m_array_q1_p)
        when (answersPersonality[0]) {
            manAnswersP1[0] -> {
            }
            manAnswersP1[1] -> {
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
            manAnswersP1[2] -> {
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 1)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            manAnswersP1[3] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersP1[4] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, 2)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 2)
            }
            manAnswersP1[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 2)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersP1[6] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.CLOSER, 5)
            }
        }
        val manAnswersP2 = context.resources.getStringArray(R.array.m_array_q2_p)
        when (answersPersonality[1]) {
            manAnswersP2[0] -> {
            }
            manAnswersP2[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 4)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.SINKER, 1)
            }
            manAnswersP2[2] -> {
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.STARTER, 10)
            }
            manAnswersP2[3] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.SINKER, 2)
                plusAbility(Constants.SHOOT, 12)
                plusAbility(Constants.CLOSER, 4)
            }
            manAnswersP2[4] -> {
                plusAbility(Constants.MIDDLE, 4)
            }
            manAnswersP2[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.CLOSER, 6)
            }
            manAnswersP2[6] -> {
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.CURB, 2)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 3)
            }
            manAnswersP2[7] -> {
                plusSpecial(Constants.CHANCE, 0.04)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 5)
            }
        }
        val manAnswersP3 = context.resources.getStringArray(R.array.m_array_q3_p)
        when (answersPersonality[2]) {
            manAnswersP3[0] -> {
            }
            manAnswersP3[1] -> {
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
            manAnswersP3[2] -> {
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 6)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.MIDDLE, 3)
            }
            manAnswersP3[3] -> {
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
            manAnswersP3[4] -> {
                plusSpecial(Constants.CHANCE, -0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.KIND_CHANGE, -1)
                plusAbility(Constants.SHOOT, 7)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersP3[5] -> {
                plusAbility(Constants.BALL_SPEED, 4)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.SINKER, 4)
                plusAbility(Constants.MIDDLE, 1)
            }
            manAnswersP3[6] -> {
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
        val manAnswersP4 = context.resources.getStringArray(R.array.m_array_q4_p)
        when (answersPersonality[3]) {
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
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 3)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.CLOSER, -2)
            }
            manAnswersP4[2] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 6)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            manAnswersP4[3] -> {
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
            manAnswersP4[4] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -4)
                plusAbility(Constants.MIDDLE, -2)
            }
            manAnswersP4[5] -> {
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
        when (answersPersonality[4]) {
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
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 7)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 7)
            }
            manAnswersP5[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.KIND_CHANGE, 10)
                plusAbility(Constants.AMOUNT_CHANGE, 10)
            }
            manAnswersP5[6] -> {
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.CONTROL, -2)
                plusAbility(Constants.KIND_CHANGE, -3)
                plusAbility(Constants.AMOUNT_CHANGE, -3)
            }
        }
        val manAnswersP6 = context.resources.getStringArray(R.array.m_array_q6_p)
        when (answersPersonality[5]) {
            manAnswersP6[0] -> {
            }
            manAnswersP6[1] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 10)
                plusAbility(Constants.STARTER, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 1)
            }
            manAnswersP6[2] -> {
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.KIND_CHANGE, 4)
                plusAbility(Constants.CURB, 1)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.SHOOT, 4)
            }
            manAnswersP6[3] -> {
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -2)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SINKER, 2)
            }
            manAnswersP6[4] -> {
                plusSpecial(Constants.CHANCE, 0.01)
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.STAMINA, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 4)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 2)
                plusAbility(Constants.CLOSER, 4)
            }
            manAnswersP6[5] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.STAMINA, 5)
            }
            manAnswersP6[6] -> {
                plusSpecial(Constants.CHANCE, -0.01)
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, -2)
            }
            manAnswersP6[7] -> {
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.SLIDER, 3)
                plusAbility(Constants.FOLK, 3)
            }
            manAnswersP6[8] -> {
                plusAbility(Constants.CONTROL, 6)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
            }
        }

        val manAnswersO1 = context.resources.getStringArray(R.array.m_array_q1_o)
        when (answersOther[0]) {
            manAnswersO1[0] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 12)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, 4)
            }
            manAnswersO1[1] -> {
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.STAMINA, 3)
                plusAbility(Constants.KIND_CHANGE, 9)
                plusAbility(Constants.AMOUNT_CHANGE, 9)
                plusAbility(Constants.STARTER, 2)
            }
            manAnswersO1[2] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.BALL_SPEED, 11)
                plusAbility(Constants.STAMINA, 5)
                plusAbility(Constants.KIND_CHANGE, 6)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.STARTER, -3)
            }
            manAnswersO1[3] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersO1[4] -> {
                plusAbility(Constants.BALL_SPEED, -2)
                plusAbility(Constants.CONTROL, -1)
                plusAbility(Constants.STAMINA, -1)
                plusAbility(Constants.KIND_CHANGE, -5)
                plusAbility(Constants.AMOUNT_CHANGE, -5)
                plusAbility(Constants.MIDDLE, 3)
            }
        }
        val manAnswersO2 = context.resources.getStringArray(R.array.m_array_q2_o)
        when (answersOther[1]) {
            manAnswersO2[0] -> {
                plusAbility(Constants.BALL_SPEED, 7)
                plusAbility(Constants.CONTROL, 18)
                plusAbility(Constants.STAMINA, 18)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 8)
                plusAbility(Constants.STARTER, 5)
            }
            manAnswersO2[1] -> {
                plusAbility(Constants.BALL_SPEED, 5)
                plusAbility(Constants.CONTROL, 12)
                plusAbility(Constants.STAMINA, 12)
                plusAbility(Constants.KIND_CHANGE, 5)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.STARTER, 3)
            }
            manAnswersO2[2] -> {
                plusAbility(Constants.BALL_SPEED, 3)
                plusAbility(Constants.KIND_CHANGE, 1)
                plusAbility(Constants.AMOUNT_CHANGE, 1)
                plusAbility(Constants.CONTROL, 5)
                plusAbility(Constants.STAMINA, 5)
            }
            manAnswersO2[3] -> {
                plusAbility(Constants.CONTROL, -4)
                plusAbility(Constants.STAMINA, -4)
            }
            manAnswersO2[4] -> {
                plusAbility(Constants.BALL_SPEED, -1)
                plusAbility(Constants.CONTROL, -10)
                plusAbility(Constants.STAMINA, -10)
                plusAbility(Constants.KIND_CHANGE, -2)
                plusAbility(Constants.AMOUNT_CHANGE, -2)
            }
        }
        val manAnswersO3 = context.resources.getStringArray(R.array.m_array_q3_o)
        when (answersOther[2]) {
            manAnswersO3[0] -> {
                plusSpecial(Constants.CHANCE, 0.15)
                plusAbility(Constants.CLOSER, 3)

            }
            manAnswersO3[1] -> {
                plusSpecial(Constants.CHANCE, 0.08)
                plusAbility(Constants.CLOSER, 2)
            }
            manAnswersO3[2] -> {
            }
            manAnswersO3[3] -> {
                plusSpecial(Constants.CHANCE, -0.08)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersO3[4] -> {
                plusSpecial(Constants.CHANCE, -0.15)
                plusAbility(Constants.MIDDLE, 4)
            }
        }
        val manAnswersO5 = context.resources.getStringArray(R.array.m_array_q5_o)
        when (answersOther[4]) {
            manAnswersO5[0] -> {
            }
            manAnswersO5[1] -> {
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
            manAnswersO5[2] -> {
                plusAbility(Constants.BALL_SPEED, 15)
                plusAbility(Constants.STAMINA, 25)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
                plusAbility(Constants.SLIDER, 2)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.SHOOT, 3)
                plusAbility(Constants.STARTER, 8)
            }
            manAnswersO5[3] -> {
                plusAbility(Constants.CONTROL, 3)
                plusAbility(Constants.KIND_CHANGE, 8)
                plusAbility(Constants.AMOUNT_CHANGE, 12)
                plusAbility(Constants.CURB, 7)
                plusAbility(Constants.SINKER, 5)
            }
            manAnswersO5[4] -> {
                plusAbility(Constants.CONTROL, 17)
                plusAbility(Constants.KIND_CHANGE, 12)
            }
            manAnswersO5[5] -> {
                plusSpecial(Constants.CHANCE, 0.02)
                plusAbility(Constants.BALL_SPEED, 6)
                plusAbility(Constants.CONTROL, -5)
                plusAbility(Constants.STAMINA, -4)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SINKER, 3)
                plusAbility(Constants.SHOOT, 4)
                plusAbility(Constants.CLOSER, 3)
            }
            manAnswersO5[6] -> {
                plusAbility(Constants.BALL_SPEED, 10)
                plusAbility(Constants.CONTROL, -3)
                plusAbility(Constants.STAMINA, -3)
                plusAbility(Constants.SHOOT, 9)
                plusAbility(Constants.MIDDLE, 2)
            }
            manAnswersO5[7] -> {
                plusAbility(Constants.AMOUNT_CHANGE, 10)
                plusAbility(Constants.CURB, 3)
                plusAbility(Constants.FOLK, 5)
                plusAbility(Constants.SINKER, 3)
            }
        }
        val manAnswersO6 = context.resources.getStringArray(R.array.m_array_q6_o)
        when (answersOther[5]) {
            manAnswersO6[0] -> {
            }
            manAnswersO6[1] -> {
                plusAbility(Constants.CONTROL, 8)
                plusAbility(Constants.KIND_CHANGE, 2)
                plusAbility(Constants.AMOUNT_CHANGE, 2)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.CURB, 4)
                plusAbility(Constants.FOLK, 1)
                plusAbility(Constants.CLOSER, -3)
            }
            manAnswersO6[2] -> {
                plusSpecial(Constants.CHANCE, 0.03)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
            }
            manAnswersO6[3] -> {
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
            manAnswersO6[4] -> {
                plusAbility(Constants.BALL_SPEED, 8)
                plusAbility(Constants.STAMINA, 15)
                plusAbility(Constants.AMOUNT_CHANGE, 3)
                plusAbility(Constants.SLIDER, 4)
                plusAbility(Constants.FOLK, 3)
                plusAbility(Constants.STARTER, 10)
            }
            manAnswersO6[5] -> {
                plusAbility(Constants.CONTROL, 10)
                plusAbility(Constants.KIND_CHANGE, 3)
            }
            manAnswersO6[6] -> {
                plusSpecial(Constants.CHANCE, -0.03)
                plusAbility(Constants.BALL_SPEED, 2)
                plusAbility(Constants.CONTROL, -7)
                plusAbility(Constants.STAMINA, -5)
                plusAbility(Constants.KIND_CHANGE, 7)
                plusAbility(Constants.AMOUNT_CHANGE, 5)
            }
            manAnswersO6[7] -> {
                plusSpecial(Constants.CHANCE, 0.05)
            }
        }

        val manAnswersO4 = context.resources.getStringArray(R.array.m_array_q4_o)
        when (answersOther[3]) {
            manAnswersO4[0] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.15).toInt()
                control = (control * 1.15).toInt()
                stamina = (stamina * 1.15).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.3).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.3).toInt()
            }
            manAnswersO4[1] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.15).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.15).toInt()
            }
            manAnswersO4[2] -> {
            }
            manAnswersO4[3] -> {
                ballSpeedPoint = (ballSpeedPoint * 1.1).toInt()
                control = (control * 1.1).toInt()
                stamina = (stamina * 1.1).toInt()
                numberOfChangePoint = (numberOfChangePoint * 1.1).toInt()
                amountOfChangePoint = (amountOfChangePoint * 1.1).toInt()
            }
            manAnswersO4[4] -> {
                control = (control * 0.9).toInt()
                stamina = (stamina * 0.9).toInt()
                numberOfChangePoint = (numberOfChangePoint * 0.8).toInt()
                amountOfChangePoint = (amountOfChangePoint * 0.8).toInt()
            }
        }

        assignAbilities()
    }


}