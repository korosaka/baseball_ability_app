package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PlayerListAdapter(context: Context, private val playerList: List<PlayerItemData>) :
        ArrayAdapter<PlayerItemData>(context, 0, playerList) {

    private val layoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val player = playerList[position]


        var view = convertView
        if (view == null)
            view = layoutInflater.inflate(
                    R.layout.player_list_item,
                    parent,
                    false)

        val playerName = view?.findViewById<TextView>(R.id.player_name)
        playerName?.text = player.name


        return view!!
    }

}