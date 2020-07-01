package com.websarva.wings.android.abiityofbaseball.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.R
import kotlinx.android.synthetic.main.fragment_question_of_popularity.*


class QuestionOfPopularityFragment : QuestionParentFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_of_popularity, container, false)
    }

    override fun changeChoices() {
        changeAdapter(spinner_q1_o, resources.getStringArray(R.array.w_array_q1_o))
        changeAdapter(spinner_q2_o, resources.getStringArray(R.array.w_array_q2_o))
        changeAdapter(spinner_q3_o, resources.getStringArray(R.array.w_array_q3_o))
        changeAdapter(spinner_q4_o, resources.getStringArray(R.array.w_array_q4_o))
        changeAdapter(spinner_q5_o, resources.getStringArray(R.array.w_array_q5_o))
    }

    override fun setSpinner() {
        spinner_q1_o.setSelection(3)
        spinner_q2_o.setSelection(2)
        spinner_q3_o.setSelection(2)
        spinner_q4_o.setSelection(2)
        spinner_q5_o.setSelection(0)
    }

}
