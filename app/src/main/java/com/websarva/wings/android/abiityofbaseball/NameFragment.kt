package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_name.*

class NameFragment : Fragment() {
    private var playerName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            playerName = it.getString(Constants.PLAYER_NAME)
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

    companion object {
        @JvmStatic
        fun newInstance(name: String) =
                NameFragment().apply {
                    arguments = Bundle().apply {
                        putString(Constants.PLAYER_NAME, name)
                    }
                }
    }
}