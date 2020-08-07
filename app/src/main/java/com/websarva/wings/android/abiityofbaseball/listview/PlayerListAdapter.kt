package com.websarva.wings.android.abiityofbaseball.listview

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
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R


class PlayerListAdapter(
        context: Context,
        private var mPlayerList: List<PlayerItemData>,
        private val listener: PlayerListAdapterListener) :
        ArrayAdapter<PlayerItemData>(context, 0, mPlayerList) {

    private val layoutInflater = LayoutInflater.from(context)

    /**
     * ListView is supposed to reuse view(in this case => convertView),
     * ex) for 7th item, it can use 1st item view again
     * So, be careful!
     */
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

        val nameText = view?.findViewById<TextView>(R.id.player_name)
        displayPlayerName(player, nameText)

        val deleteButton = view?.findViewById<Button>(R.id.delete_player)
        putDeleteListener(deleteButton!!, player)

        return view!!
    }

    private fun displayPlayerName(player: PlayerItemData, nameText: TextView?) {
        val name = player.name
        val position = player.position

        nameText!!.text = name
        setNameTextSize(nameText)
        putSpaceBetween(nameText, name)
        setNameBackground(nameText, position)

        nameText.setOnClickListener {
            listener.nameClicked(player)
        }
    }

    private fun setNameTextSize(nameText: TextView) {
        nameText.textSize = when (nameText.length()) {
            5 -> createTextSize(9.5F)
            6 -> createTextSize(8F)
            7 -> createTextSize(6.8F)
            8 -> createTextSize(6F)
            else -> createTextSize(11.5F)
        }
    }

    private fun createTextSize(size: Float): Float {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, size, context.resources.displayMetrics)
    }

    private fun putSpaceBetween(nameText: TextView, playerName: String) {
        when (nameText.length()) {
            2 -> nameText.text = (playerName[0] + Constants.HALF_SPACE + Constants.HALF_SPACE + playerName[1])
            3 -> nameText.text = (playerName[0] + Constants.HALF_SPACE + playerName[1] + Constants.HALF_SPACE + playerName[2])
        }
    }

    private fun setNameBackground(nameText: TextView, position: String) {
        val backGround = when (position) {
            Constants.TYPE_PITCHER -> R.drawable.pitcher_name_background
            Constants.CATCHER -> R.drawable.catcher_name_background
            Constants.OUTFIELD -> R.drawable.outfielder_name_background
            else -> R.drawable.infielder_name_background
        }
        nameText.background =
                ResourcesCompat.getDrawable(context.resources, backGround, null)
    }

    private fun putDeleteListener(button: Button, player: PlayerItemData) {
        button.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            builder.setMessage(player.name + context.resources.getString(R.string.ask_delete))
            // _ means argument which is never used
            builder.setPositiveButton(context.resources.getString(R.string.done)) { _, _ ->
                button.isClickable = false
                listener.deleteClicked(player)
                remove(player)
            }
            builder.setNegativeButton(context.resources.getString(R.string.no), null)
            builder.show()
        }
    }


}

interface PlayerListAdapterListener {
    fun nameClicked(player: PlayerItemData)
    fun deleteClicked(player: PlayerItemData)
}
