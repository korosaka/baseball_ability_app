package com.websarva.wings.android.abiityofbaseball.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.websarva.wings.android.abiityofbaseball.*
import kotlinx.android.synthetic.main.fragment_fielder_list.*

class FielderListFragment : Fragment(), PlayerListAdapterListener {

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
        playerList = uDB.getFielderForList()

        playerListAdapter = PlayerListAdapter(context!!, playerList, this)
        list_view.adapter = playerListAdapter
    }

    override fun nameClicked(player: PlayerItemData) {
        Log.e("test_log","" + player.name +
                        " " + player.playerId)
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