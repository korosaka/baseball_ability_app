package com.websarva.wings.android.abiityofbaseball.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.activity.AnswerQuestionsActivity
import kotlinx.android.synthetic.main.fragment_pitcher_list.*

class PitcherListFragment : Fragment(), PlayerListAdapterListener {

    lateinit var playerListAdapter: PlayerListAdapter
    lateinit var playerList: ArrayList<PlayerItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uDB = UtilisingDB(context!!, context!!.applicationContext)
        playerList = uDB.getPlayerForList(Constants.TYPE_PITCHER)

        playerListAdapter = PlayerListAdapter(context!!, playerList, this)
        pitcher_list_view.adapter = playerListAdapter
    }

    override fun nameClicked(player: PlayerItemData) {
        AnswerQuestionsActivity.playerType = Constants.TYPE_PITCHER
        val uDB = UtilisingDB(context!!, context!!.applicationContext)
        val intent = uDB.getPlayerWithId(player.playerId, Constants.TYPE_PITCHER)

        startActivity(intent)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_pitcher_list, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
                PitcherListFragment().apply {
                    arguments = Bundle().apply {
                    }
                }
    }
}