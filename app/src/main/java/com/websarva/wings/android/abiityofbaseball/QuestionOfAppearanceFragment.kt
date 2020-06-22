package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*


class QuestionOfAppearanceFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_of_appearance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == Constants.ID_WOMAN) {
            changeChoices()
        }
        setSpinner()
    }


    private fun changeChoices() {
        changeAdapter(spinner_q1_a, resources.getStringArray(R.array.w_array_q1_a))
        changeAdapter(spinner_q2_a, resources.getStringArray(R.array.w_array_q2_a))
        changeAdapter(spinner_q3_a, resources.getStringArray(R.array.w_array_q3_a))
        changeAdapter(spinner_q4_a, resources.getStringArray(R.array.w_array_q4_a))
        changeAdapter(spinner_q5_a, resources.getStringArray(R.array.w_array_q5_a))
    }

    private fun changeAdapter(spinner: Spinner, choices: Array<String>) {
        val adapter = ArrayAdapter<String>(context!!, android.R.layout.simple_spinner_item, choices)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    private fun setSpinner() {
        spinner_q1_a.setSelection(0)
        spinner_q2_a.setSelection(0)
        spinner_q3_a.setSelection(0)
        spinner_q4_a.setSelection(0)
        spinner_q5_a.setSelection(0)
    }


    companion object {
        @JvmStatic
        fun newInstance(): QuestionOfAppearanceFragment {
            return QuestionOfAppearanceFragment()
        }
    }
}
