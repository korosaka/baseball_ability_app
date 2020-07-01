package com.websarva.wings.android.abiityofbaseball.Fragment

import android.graphics.Color
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.websarva.wings.android.abiityofbaseball.Constants

abstract class AbilityParentFragment : Fragment() {

    protected fun changeLankColor(alphabet: TextView) {

        when (alphabet.text) {
            Constants.LANK_A -> alphabet.setTextColor(Color.parseColor(Constants.LANK_A_COLOR))
            Constants.LANK_B -> alphabet.setTextColor(Color.parseColor(Constants.LANK_B_COLOR))
            Constants.LANK_C -> alphabet.setTextColor(Color.parseColor(Constants.LANK_C_COLOR))
            Constants.LANK_D -> alphabet.setTextColor(Color.parseColor(Constants.LANK_D_COLOR))
            Constants.LANK_E -> alphabet.setTextColor(Color.parseColor(Constants.LANK_E_COLOR))
            Constants.LANK_F -> alphabet.setTextColor(Color.parseColor(Constants.LANK_F_COLOR))
            Constants.LANK_G -> alphabet.setTextColor(Color.parseColor(Constants.LANK_G_COLOR))

        }
    }

}