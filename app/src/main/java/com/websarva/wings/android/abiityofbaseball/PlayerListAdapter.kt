package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.res.ResourcesCompat


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
        displayPlayerName(player, playerName)

        val deleteButton = view?.findViewById<Button>(R.id.delete_player)
        putDeleteListener(deleteButton!!, player)

        return view!!
    }

    private fun displayPlayerName(player: PlayerItemData, playerName: TextView?) {
        val name = player.name
        val position = player.position

        playerName!!.text = name
        when (playerName.length()) {
            2 -> playerName.text = (name[0] + Constants.HALF_SPACE + Constants.HALF_SPACE + name[1])
            3 -> playerName.text = (name[0] + Constants.HALF_SPACE + name[1] + Constants.HALF_SPACE + name[2])
            5 -> playerName.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 9.5F, context.resources.displayMetrics)
            6 -> playerName.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 8F, context.resources.displayMetrics)
            7 -> playerName.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6.8F, context.resources.displayMetrics)
            8 -> playerName.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6F, context.resources.displayMetrics)
        }

        val backGround = when (position) {
            Constants.TYPE_PITCHER -> R.drawable.pitcher_name_background
            Constants.CATCHER -> R.drawable.catcher_name_background
            Constants.OUTFIELD -> R.drawable.outfielder_name_background
            else -> R.drawable.infielder_name_background
        }
        playerName.background =
                ResourcesCompat.getDrawable(context.resources, backGround, null)


        playerName.setOnClickListener {
            listener.nameClicked(player)
        }
    }

    private fun putDeleteListener(button: Button, player: PlayerItemData) {
        button.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            builder.setMessage(player.name + context.resources.getString(R.string.ask_delete))
            // _ means argument which is never used
            builder.setPositiveButton(context.resources.getString(R.string.done)) { _, _ ->
                button.isClickable = false
                listener.buttonClicked(player)
                remove(player)
            }
            builder.setNegativeButton(context.resources.getString(R.string.no), null)
            builder.show()
        }
    }


}

interface PlayerListAdapterListener {
    fun nameClicked(player: PlayerItemData)
    fun buttonClicked(player: PlayerItemData)
}
