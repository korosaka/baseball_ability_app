package com.websarva.wings.android.abiityofbaseball.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.PlayerItemData
import com.websarva.wings.android.abiityofbaseball.PlayerListAdapter
import com.websarva.wings.android.abiityofbaseball.R
import com.websarva.wings.android.abiityofbaseball.activity.AnswerQuestionsActivity
import kotlinx.android.synthetic.main.fragment_fielder_list.*

class FielderListFragment : Fragment() {

    lateinit var playerListAdapter: PlayerListAdapter
    lateinit var mAnimalList: ArrayList<PlayerItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // TODO test
        val player1 = PlayerItemData(1, "Saka", Constants.SHORTSTOP)
        val player2 = PlayerItemData(4, "Yamamoto", Constants.SECOND_BASE)
        val player3 = PlayerItemData(4, "Kikuchi", Constants.OUTFIELD)
        mAnimalList = arrayListOf(player1, player2, player3)


        playerListAdapter = PlayerListAdapter(context!!, mAnimalList)
        list_view.adapter = playerListAdapter
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fielder_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
                FielderListFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
    }
}