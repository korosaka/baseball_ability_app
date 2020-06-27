package com.websarva.wings.android.abiityofbaseball

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_making_status_pitcher.*

class PitcherAbilityFragment : AbilityParentFragment() {
    private var pitcherPlayer: PlayerPitcherClass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pitcherPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerPitcherClass
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pitcher_ability, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pitcherPlayer?.let { displayAbility(it) }
    }

    private fun displayAbility(player: PlayerPitcherClass) {
        displayPitcherType(player)
        ball_speed_display.text = player.maxSpeed.toString()
        control_display.text = player.controlLank
        stamina_display.text = player.staminaLank
        changeLankColor(control_display)
        changeLankColor(stamina_display)

        displayChangeBallAbility(player)
    }


    private fun displayPitcherType(pitcher: PlayerPitcherClass) {
        when (pitcher.pitcherType) {
            Constants.STARTER -> {
                type_display.text = resources.getString(R.string.starter)
                type_display.setBackgroundResource(R.drawable.infielder_name_background)
            }
            Constants.MIDDLE -> {
                type_display.text = resources.getString(R.string.middle_relief)
                type_display.setBackgroundResource(R.drawable.outfielder_name_background)
            }
            Constants.CLOSER -> {
                type_display.text = resources.getString(R.string.closer)
                type_display.setBackgroundResource(R.drawable.catcher_name_background)
            }
        }
    }

    private fun displayChangeBallAbility(playerPitcher: PlayerPitcherClass) {
        val changeDisplays = getChangeBallDisplay()
        val changeBallMarks = arrayOf(mark_slider, mark_curb, mark_fork, mark_sinker, mark_shoot)
        val changeBallTitles = arrayOf(title_slider, title_curb, title_fork, title_sinker, title_shoot)
        val colors = getChangeBallColors()
        for (changeKindIndex in 0 until playerPitcher.changeBalls.size) {

            if (playerPitcher.changeBalls[changeKindIndex] == 0) changeBallTitles[changeKindIndex]!!.visibility = View.INVISIBLE

            for (changeAmountIndex in 0 until playerPitcher.changeBalls[changeKindIndex]) {

                changeDisplays[changeKindIndex][changeAmountIndex].setBackgroundColor(colors[changeKindIndex][changeAmountIndex])
                changeBallMarks[changeKindIndex]!!.setTextColor(colors[changeKindIndex][changeAmountIndex])
            }
        }

    }

    private fun getChangeBallDisplay(): Array<Array<TextView>> {
        val sliderDisplay = arrayOf(slider_1, slider_2, slider_3, slider_4, slider_5, slider_6, slider_7)
        val curbDisplay = arrayOf(curb_1, curb_2, curb_3, curb_4, curb_5, curb_6, curb_7)
        val forkDisplay = arrayOf(fork_1, fork_2, fork_3, fork_4, fork_5, fork_6, fork_7)
        val sinkerDisplay = arrayOf(sinker_1, sinker_2, sinker_3, sinker_4, sinker_5, sinker_6, sinker_7)
        val shootDisplay = arrayOf(shoot_1, shoot_2, shoot_3, shoot_4, shoot_5, shoot_6, shoot_7)

        return arrayOf(
                sliderDisplay,
                curbDisplay,
                forkDisplay,
                sinkerDisplay,
                shootDisplay
        )
    }

    private fun getChangeBallColors(): Array<Array<Int>> {
        val sliderColors = arrayOf(
                Color.parseColor(Constants.SLIDER_COLOR_1),
                Color.parseColor(Constants.SLIDER_COLOR_2),
                Color.parseColor(Constants.SLIDER_COLOR_3),
                Color.parseColor(Constants.SLIDER_COLOR_4),
                Color.parseColor(Constants.SLIDER_COLOR_5),
                Color.parseColor(Constants.SLIDER_COLOR_6),
                Color.parseColor(Constants.SLIDER_COLOR_7)
        )
        val curbColors = arrayOf(
                Color.parseColor(Constants.CURB_COLOR_1),
                Color.parseColor(Constants.CURB_COLOR_2),
                Color.parseColor(Constants.CURB_COLOR_3),
                Color.parseColor(Constants.CURB_COLOR_4),
                Color.parseColor(Constants.CURB_COLOR_5),
                Color.parseColor(Constants.CURB_COLOR_6),
                Color.parseColor(Constants.CURB_COLOR_7)
        )
        val forkColors = arrayOf(
                Color.parseColor(Constants.FORK_COLOR_1),
                Color.parseColor(Constants.FORK_COLOR_2),
                Color.parseColor(Constants.FORK_COLOR_3),
                Color.parseColor(Constants.FORK_COLOR_4),
                Color.parseColor(Constants.FORK_COLOR_5),
                Color.parseColor(Constants.FORK_COLOR_6),
                Color.parseColor(Constants.FORK_COLOR_7)
        )
        val sinkerColors = arrayOf(
                Color.parseColor(Constants.SINKER_COLOR_1),
                Color.parseColor(Constants.SINKER_COLOR_2),
                Color.parseColor(Constants.SINKER_COLOR_3),
                Color.parseColor(Constants.SINKER_COLOR_4),
                Color.parseColor(Constants.SINKER_COLOR_5),
                Color.parseColor(Constants.SINKER_COLOR_6),
                Color.parseColor(Constants.SINKER_COLOR_7)
        )
        val shootColors = arrayOf(
                Color.parseColor(Constants.SHOOT_COLOR_1),
                Color.parseColor(Constants.SHOOT_COLOR_2),
                Color.parseColor(Constants.SHOOT_COLOR_3),
                Color.parseColor(Constants.SHOOT_COLOR_4),
                Color.parseColor(Constants.SHOOT_COLOR_5),
                Color.parseColor(Constants.SHOOT_COLOR_6),
                Color.parseColor(Constants.SHOOT_COLOR_7)
        )

        return arrayOf(
                sliderColors,
                curbColors,
                forkColors,
                sinkerColors,
                shootColors
        )
    }


    companion object {
        @JvmStatic
        fun newInstance(pitcher: PlayerPitcherClass) =
                PlayerInfoFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_PITCHER, pitcher)
                    }
                }
    }
}