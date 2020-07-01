package com.websarva.wings.android.abiityofbaseball.Fragment

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import kotlinx.android.synthetic.main.fragment_name.*

class NameFragment : Fragment() {
    private lateinit var playerName: String
    private lateinit var position: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            playerName = it.getString(Constants.PLAYER_NAME).toString()
            position = it.getString(KEY_POSITION).toString()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayPlayerName(playerName)
        displayPositionColor()
    }

    private fun displayPlayerName(name: String?) {
        if (name == null) return
        name_box.text = name

        // 字数でサイズ変更
        when (name_box.length()) {
            2 -> name_box.text = (name[0] + Constants.HALF_SPACE + Constants.HALF_SPACE + name[1])
            3 -> name_box.text = (name[0] + Constants.HALF_SPACE + name[1] + Constants.HALF_SPACE + name[2])
            5 -> name_box.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 9.5F, resources.displayMetrics)
            6 -> name_box.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 8F, resources.displayMetrics)
            7 -> name_box.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6.8F, resources.displayMetrics)
            8 -> name_box.textSize = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 6F, resources.displayMetrics)
        }

    }

    private fun displayPositionColor() {
        when (position) {
            Constants.TYPE_PITCHER -> name_box.setBackgroundResource(R.drawable.pitcher_name_background)
            Constants.CATCHER -> name_box.setBackgroundResource(R.drawable.catcher_name_background)
            Constants.OUTFIELD -> name_box.setBackgroundResource(R.drawable.outfielder_name_background)
            else -> name_box.setBackgroundResource(R.drawable.infielder_name_background)
        }
    }


    companion object {
        private const val KEY_POSITION = "position"

        @JvmStatic
        fun newInstance(name: String, position: String) =
                NameFragment().apply {
                    arguments = Bundle().apply {
                        putString(Constants.PLAYER_NAME, name)
                        putString(KEY_POSITION, position)
                    }
                }
    }
}