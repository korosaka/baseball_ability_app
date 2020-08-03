package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AlertDialog


class PlayerListAdapter(
        context: Context,
        private var mPlayerList: List<PlayerItemData>,
        private val listener: PlayerListAdapterListener) :
        ArrayAdapter<PlayerItemData>(context, 0, mPlayerList) {

    private val layoutInflater = LayoutInflater.from(context)

    override fun getView(
            position: Int,
            convertView: View?,
            parent: ViewGroup): View {

        var view = convertView
        if (view == null)
            view = layoutInflater.inflate(
                    R.layout.player_list_item,
                    parent,
                    false)

        val player = mPlayerList[position]
        val playerName = view?.findViewById<TextView>(R.id.player_name)
        playerName?.text = player.name
        playerName?.setOnClickListener {
            listener.nameClicked(player)
        }

        val deleteButton = view?.findViewById<TextView>(R.id.delete_player)
        deleteButton?.setOnClickListener{
            val builder = AlertDialog.Builder(context)
            builder.setMessage(player.name + context.resources.getString(R.string.ask_delete))
            // _ means argument which is never used
            builder.setPositiveButton(context.resources.getString(R.string.done)) { _, _ ->
                deleteButton.isClickable = false
                listener.buttonClicked(player)
                remove(player)
            }
            builder.setNegativeButton(context.resources.getString(R.string.no), null)
            builder.show()
        }

        return view!!
    }

}

interface PlayerListAdapterListener {
    fun nameClicked(player: PlayerItemData)
    fun buttonClicked(player: PlayerItemData)
}
