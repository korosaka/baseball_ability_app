package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_making_status.*
import kotlin.properties.Delegates

class FielderRecordFragment : Fragment() {
    private var fielderPlayer: PlayerClass? = null
    var ave = 0
    var hr = 0
    var rbi = 0
    var sb = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            fielderPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerClass
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fielder_record, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fielderPlayer?.let { calcRecords(it) }
        displayRecord()
    }

    private fun calcRecords(player: PlayerClass) {
        ave = calcAve(player)
        hr = calcHr(player)
        rbi = calcRbi(player, hr)
        sb = calcSb(player)
    }

    private fun displayRecord() {
        average_display.text = when{
            ave < 100 -> ".0$ave"
            else -> ".$ave"
        }
        homer_display.text = hr.toString()
        rbi_display.text = rbi.toString()
        steel_display.text = sb.toString()
    }

    private fun calcAve(player: PlayerClass): Int {
        var ave = 85 + (player.contactAbility * 4.5).toInt() + (player.powerAbility * 0.45).toInt() + (player.speedAbility * 0.15).toInt()
        when {
            ave < 150 -> {
                ave = 120 + (ave * 0.3).toInt()
            }
            ave < 200 -> {
                ave = 150 + (ave * 0.3).toInt()
            }
            ave > 300 -> {
                ave = ((ave - 300) * 0.5).toInt() + 300
            }
        }

        ave = when (player.ballisticAbility) {
            1 -> ave
            2 -> (ave * 0.99).toInt()
            3 -> (ave * 0.97).toInt()
            else -> (ave * 0.94).toInt()
        }

        return ave
    }

    private fun calcHr(player: PlayerClass): Int {
        var hr = ((player.powerAbility * 0.8) + (player.contactAbility * 0.1)).toInt() - 30
        if (hr < 0) {
            hr = (player.powerAbility * 0.1).toInt()
        } else {
            hr += 10
        }
        hr = when (player.ballisticAbility) {
            1 -> (hr * 0.4).toInt()
            2 -> (hr * 0.65).toInt()
            3 -> (hr * 0.85).toInt()
            else -> hr
        }

        return hr
    }

    private fun calcRbi(player: PlayerClass, hr: Int): Int {
        var rbi = (((player.contactAbility * 0.5) + (player.powerAbility * 1.0)) * player.chance).toInt()
        when {
            rbi < 0 -> {
                rbi = 1
            }
            rbi < 30 -> {
                rbi = (rbi * 0.2).toInt()
            }
            rbi < 50 -> {
                rbi = (rbi * 0.35).toInt()
            }
            rbi < 60 -> {
                rbi = (rbi * 0.6).toInt()
            }
            rbi < 70 -> {
                rbi = (rbi * 0.75).toInt()
            }
            rbi < 80 -> {
                rbi = (rbi * 0.9).toInt()
            }
        }
        if (rbi < hr) rbi = hr

        return rbi
    }

    private fun calcSb(player: PlayerClass): Int {
        var sb = (player.speedAbility * 0.8).toInt() - 25
        when {
            sb < -10 -> {
                sb = (player.speedAbility * 0.1).toInt()
            }
            sb < 5 -> {
                sb = (player.speedAbility * 0.1).toInt() + 1
            }
            sb > 30 -> {
                sb = (sb * 1.1).toInt()
            }
        }

        return sb
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