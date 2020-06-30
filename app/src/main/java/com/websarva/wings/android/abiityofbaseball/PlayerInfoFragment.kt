package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class PlayerInfoFragment : Fragment() {

    private lateinit var fielderPlayer: PlayerClass
    private lateinit var pitcherPlayer: PlayerPitcherClass

    private lateinit var fielderRecord: FielderRecordFragment
    private lateinit var pitcherRecord: PitcherRecordFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setPlayerWithBundle()

    }

    private fun setPlayerWithBundle() {
        arguments?.let {
            when (PlayerMakingActivity.playerType) {
                Constants.TYPE_FIELDER -> fielderPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerClass
                Constants.TYPE_PITCHER -> pitcherPlayer = it.getSerializable(Constants.TYPE_PITCHER) as PlayerPitcherClass
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_player_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayName()
        displayAbility()
        displayRecord()
        displaySalary()
    }

    private fun displayName() {

        val name = when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> fielderPlayer.playerName
            else -> pitcherPlayer.playerName
        }
        val nameFrag = NameFragment.newInstance(name, when(PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> fielderPlayer.mainPosition
            else -> Constants.TYPE_PITCHER
        })
        val myActivity = activity ?: return
        val transaction = myActivity.supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_name, nameFrag)
        transaction.commit()
    }

    private fun displayAbility() {
        val abilityFrag = when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> FielderAbilityFragment.newInstance(fielderPlayer)
            else -> PitcherAbilityFragment.newInstance(pitcherPlayer)
        }

        val myActivity = activity ?: return
        val transaction = myActivity.supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_ability, abilityFrag)
        transaction.commit()
    }

    private fun displayRecord() {
        when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> fielderRecord = FielderRecordFragment.newInstance(fielderPlayer)
            Constants.TYPE_PITCHER -> pitcherRecord = PitcherRecordFragment.newInstance(pitcherPlayer)
        }

        val myActivity = activity ?: return
        val transaction = myActivity.supportFragmentManager.beginTransaction()
        when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> fielderRecord
            else -> pitcherRecord
        }.let { transaction.add(R.id.frame_for_record, it) }
        transaction.commit()
    }

    private fun displaySalary() {
        val salaryFrag = when (PlayerMakingActivity.playerType) {
            Constants.TYPE_FIELDER -> FielderSalaryFragment.newInstance(
                    fielderPlayer, fielderRecord.ave, fielderRecord.hr, fielderRecord.rbi, fielderRecord.sb)
            else -> PitcherSalaryFragment.newInstance(
                    pitcherPlayer, pitcherRecord.win, pitcherRecord.save, pitcherRecord.totalInnings,
                    pitcherRecord.totalK, pitcherRecord.actualERA, pitcherRecord.winRate)
        }

        val myActivity = activity ?: return
        val transaction = myActivity.supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_salary, salaryFrag)
        transaction.commit()

    }


    companion object {
        @JvmStatic
        fun newInstance(fielder: PlayerClass) =
                PlayerInfoFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_FIELDER, fielder)
                    }
                }

        fun newInstance(pitcher: PlayerPitcherClass) =
                PlayerInfoFragment().apply {
                    arguments = Bundle().apply {
                        putSerializable(Constants.TYPE_PITCHER, pitcher)
                    }
                }

    }
}