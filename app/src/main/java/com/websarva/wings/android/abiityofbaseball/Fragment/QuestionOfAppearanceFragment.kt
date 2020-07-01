package com.websarva.wings.android.abiityofbaseball.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.websarva.wings.android.abiityofbaseball.R
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*


class QuestionOfAppearanceFragment : QuestionParentFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_of_appearance, container, false)
    }

    override fun changeChoices() {
        changeAdapter(spinner_q1_a, resources.getStringArray(R.array.w_array_q1_a))
        changeAdapter(spinner_q2_a, resources.getStringArray(R.array.w_array_q2_a))
        changeAdapter(spinner_q3_a, resources.getStringArray(R.array.w_array_q3_a))
        changeAdapter(spinner_q4_a, resources.getStringArray(R.array.w_array_q4_a))
        changeAdapter(spinner_q5_a, resources.getStringArray(R.array.w_array_q5_a))
    }

    override fun setSpinner() {
        spinner_q1_a.setSelection(0)
        spinner_q2_a.setSelection(0)
        spinner_q3_a.setSelection(0)
        spinner_q4_a.setSelection(0)
        spinner_q5_a.setSelection(0)
    }

}
