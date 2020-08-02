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
        val player3 = PlayerItemData(7, "Kikuchi", Constants.OUTFIELD)
        mAnimalList = arrayListOf(player1, player2, player3)


        playerListAdapter = PlayerListAdapter(context!!, mAnimalList, this)
//        val listView = activity?.findViewById<ListView>(R.id.list_view)
//        if (listView != null) {
        list_view.adapter = playerListAdapter
//        }

//        if (listView != null) {
//            listView.setOnItemClickListener { adapterView, view, position, id ->
//
//                Log.e("test_log","" + mAnimalList[position].name +
//                        " " + mAnimalList[position].playerId)
//
//            }
//        }
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