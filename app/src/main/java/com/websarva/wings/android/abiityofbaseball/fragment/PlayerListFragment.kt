package com.websarva.wings.android.abiityofbaseball.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.websarva.wings.android.abiityofbaseball.*
import com.websarva.wings.android.abiityofbaseball.activity.AnswerQuestionsActivity
import kotlinx.android.synthetic.main.fragment_fielder_list.*
import kotlinx.android.synthetic.main.fragment_pitcher_list.*

class PlayerListFragment : Fragment(), PlayerListAdapterListener {

    private lateinit var playerType: String
    lateinit var playerListAdapter: PlayerListAdapter
    lateinit var playerList: ArrayList<PlayerItemData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            playerType = it.getString(Constants.PLAYER_TYPE, Constants.EMPTY)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val layoutFile = when (playerType) {
            Constants.TYPE_FIELDER -> R.layout.fragment_fielder_list
            else -> R.layout.fragment_pitcher_list
        }
        return inflater.inflate(layoutFile, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uDB = UtilisingDB(context!!, context!!.applicationContext)
        playerList = uDB.getPlayerForList(playerType)

        playerListAdapter = PlayerListAdapter(context!!, playerList, this)
        val listView = when (playerType) {
            Constants.TYPE_FIELDER -> fielder_list_view
            else -> pitcher_list_view
        }
        listView.adapter = playerListAdapter
    }

    override fun nameClicked(player: PlayerItemData) {
        AnswerQuestionsActivity.playerType = playerType
        val uDB = UtilisingDB(context!!, context!!.applicationContext)
        val intent = uDB.getPlayerWithId(player.playerId, playerType)

        startActivity(intent)
    }

    override fun deleteClicked(player: PlayerItemData) {
        val uDB = UtilisingDB(context!!, context!!.applicationContext)
        uDB.deletePlayerWithId(player.playerId, playerType)
    }


    companion object {
        @JvmStatic
        fun newInstance(playerType: String) =
                PlayerListFragment().apply {
                    arguments = Bundle().apply {
                        putString(Constants.PLAYER_TYPE, playerType)
                    }
                }
    }
}