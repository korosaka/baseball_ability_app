package com.websarva.wings.android.abiityofbaseball

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_making_status.*

class FielderAbilityFragment : AbilityParentFragment() {
    private var fielderPlayer: PlayerClass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            fielderPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerClass
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_fielder_ability, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fielderPlayer?.let { displayAbility(it) }
    }

    private fun displayAbility(player: PlayerClass) {
        ballistic_display.text = player.ballisticAbility.toString()
        setBallisticArrow(ballistic_arrow, player.ballisticAbility)
        setBallisticColor(ballistic_arrow, player.ballisticAbility)

        contact_display.text = player.contactLank
        power_display.text = player.powerLank
        speed_display.text = player.speedLank
        arm_display.text = player.armLank
        field_display.text = player.fieldingLank
        catching_display.text = player.catchingLank

        changeLankColor(contact_display)
        changeLankColor(power_display)
        changeLankColor(speed_display)
        changeLankColor(arm_display)
        changeLankColor(field_display)
        changeLankColor(catching_display)
    }

    private fun setBallisticArrow(arrow: TextView, ballistic: Int) {
        arrow.text = when (ballistic) {
            1 -> Constants.BALLISTIC_1_ARROW
            4 -> Constants.BALLISTIC_4_ARROW
            else -> Constants.BALLISTIC_2_OR_3_ARROW
        }
    }

    private fun setBallisticColor(arrow: TextView, ballistic: Int) {
        when (ballistic) {
            1 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_1_COLOR))
            2 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_2_COLOR))
            3 -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_3_COLOR))
            else -> arrow.setTextColor(Color.parseColor(Constants.BALLISTIC_4_COLOR))
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(fielder: PlayerClass) =
                PlayerInfoFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_FIELDER, fielder)
                    }
                }
    }
}