package com.websarva.wings.android.abiityofbaseball

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.io.Serializable


/**
 * A simple [Fragment] subclass.
 * Use the [PlayerInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PlayerInfoFragment : Fragment() {

    private var fielderPlayer: PlayerClass? = null
    private var pitcherPlayer: PlayerPitcherClass? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setPlayerWithBundle()

    }

    private fun setPlayerWithBundle() {
        val myActivity = activity ?: return
        arguments?.let {
            when (myActivity.localClassName) {
                Constants.FIELDER_ACTIVITY -> {
                    fielderPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerClass
                }
                Constants.PITCHER_ACTIVITY -> {
                    pitcherPlayer = it.getSerializable(Constants.TYPE_FIELDER) as PlayerPitcherClass
                }
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
    }

    private fun displayName() {
        val myActivity = activity ?: return
        val name = when (myActivity.localClassName) {
            Constants.FIELDER_ACTIVITY -> fielderPlayer?.playerName
            else -> pitcherPlayer?.playerName
        }
        val nameFrag = NameFragment.newInstance(name!!)

        val transaction = myActivity.supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_name, nameFrag)
        transaction.commit()
    }

    private fun displayAbility() {
        val myActivity = activity ?: return
        val abilityFrag = when (myActivity.localClassName) {
            Constants.FIELDER_ACTIVITY -> FielderAbilityFragment.newInstance(fielderPlayer!!)
            else -> PitcherAbilityFragment.newInstance(pitcherPlayer!!)
        }
        val transaction = myActivity.supportFragmentManager.beginTransaction()
        transaction.add(R.id.frame_for_ability, abilityFrag)
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