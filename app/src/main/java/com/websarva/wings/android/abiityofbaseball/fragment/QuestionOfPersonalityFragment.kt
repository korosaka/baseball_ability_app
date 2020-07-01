package com.websarva.wings.android.abiityofbaseball.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.R
import kotlinx.android.synthetic.main.fragment_question_of_personality.*


class QuestionOfPersonalityFragment : QuestionParentFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_of_personality, container, false)
    }

    override fun changeChoices() {
        changeAdapter(spinner_q1_p, resources.getStringArray(R.array.w_array_q1_p))
        changeAdapter(spinner_q2_p, resources.getStringArray(R.array.w_array_q2_p))
        changeAdapter(spinner_q3_p, resources.getStringArray(R.array.w_array_q3_p))
        changeAdapter(spinner_q4_p, resources.getStringArray(R.array.w_array_q4_p))
        changeAdapter(spinner_q5_p, resources.getStringArray(R.array.w_array_q5_p))
    }

    override fun setSpinner() {
        spinner_q1_p.setSelection(0)
        spinner_q2_p.setSelection(0)
        spinner_q3_p.setSelection(0)
        spinner_q4_p.setSelection(0)
        spinner_q5_p.setSelection(0)
    }

}
