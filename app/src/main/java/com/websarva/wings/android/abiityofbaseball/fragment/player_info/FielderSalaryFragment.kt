package com.websarva.wings.android.abiityofbaseball.fragment.player_info

import android.os.Bundle
import android.view.View
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerFielderClass
import kotlin.properties.Delegates

class FielderSalaryFragment : SalaryParentFragment() {
    private lateinit var fielderPlayer: PlayerFielderClass
    private var ave by Delegates.notNull<Int>()
    private var hr by Delegates.notNull<Int>()
    private var rbi by Delegates.notNull<Int>()
    private var sb by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            fielderPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerFielderClass
            ave = it.getInt(KEY_AVE)
            hr = it.getInt(KEY_HR)
            rbi = it.getInt(KEY_RBI)
            sb = it.getInt(KEY_SB)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val salary = calcSalary(fielderPlayer, ave, hr, rbi, sb)
        displaySalary(salary)
    }

    private fun calcSalary(player: PlayerFielderClass, ave: Int, hr: Int, rbi: Int, sb: Int): Int {

        val avePoint = when (ave) {
            in 0..199 -> ave
            in 200..224 -> ave * 2
            in 225..249 -> ave * 4
            in 250..274 -> ave * 8
            in 275..299 -> ave * 15
            in 300..332 -> ave * 25
            in 333..349 -> ave * 35
            in 350..399 -> ave * 45
            else -> ave * 50
        }

        val hrPoint = when (hr) {
            in 0..9 -> hr * 70
            in 10..14 -> hr * 130
            in 15..19 -> hr * 160
            in 20..24 -> hr * 220
            in 25..29 -> hr * 250
            in 30..39 -> hr * 360
            in 40..49 -> hr * 450
            in 50..54 -> hr * 500
            in 55..59 -> hr * 550
            else -> hr * 600
        }
        val rbiPoint = when (rbi) {
            in 0..9 -> rbi * 10
            in 10..19 -> rbi * 15
            in 20..39 -> rbi * 20
            in 40..59 -> rbi * 25
            in 60..79 -> rbi * 30
            in 80..99 -> rbi * 35
            in 100..129 -> rbi * 50
            else -> rbi * 60
        }
        val sbPoint = when (sb) {
            in 0..3 -> sb * 10
            in 4..9 -> sb * 25
            in 10..19 -> sb * 50
            in 20..29 -> sb * 80
            in 30..39 -> sb * 110
            else -> sb * 125
        }
        var otherPoint = (player.speedAbility * player.armAbility * player.fieldingAbility * player.catchingAbility / 1200.0).toInt()
        val positionBonus = when (player.mainPosition) {
            Constants.CATCHER -> 1.5
            Constants.SECOND_BASE -> 1.3
            Constants.SHORTSTOP -> 1.35
            Constants.THIRD_BASE -> 1.1
            Constants.OUTFIELD -> 1.1
            else -> 1.0
        }
        otherPoint = (otherPoint * positionBonus).toInt()

        return when (val salary = avePoint + hrPoint + rbiPoint + sbPoint + otherPoint) {
            in 0..440 -> 440
            in 441..4999 -> (salary / 10) * 10
            in 5000..9999 -> (salary / 100) * 100
            else -> (salary / 1000) * 1000
        }


    }

    companion object {
        private const val KEY_AVE = "ave"
        private const val KEY_HR = "hr"
        private const val KEY_RBI = "rbi"
        private const val KEY_SB = "sb"

        @JvmStatic
        fun newInstance(fielder: PlayerFielderClass,
                        fielderRecord: FielderRecordFragment) =
                FielderSalaryFragment().apply {
                    arguments = Bundle().apply {

                        /**
                         * at this time, FielderRecordFragment's fields are still null
                         * (because of fragment's lifecycle)
                         * so, calculate records
                         */
                        putSerializable(Constants.TYPE_FIELDER, fielder)
                        putInt(KEY_AVE, fielderRecord.calcAve(fielder))
                        putInt(KEY_HR, fielderRecord.calcHr(fielder))
                        putInt(KEY_RBI, fielderRecord.calcRbi(fielder))
                        putInt(KEY_SB, fielderRecord.calcSb(fielder))
                    }
                }
    }
}