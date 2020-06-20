package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*
import kotlinx.android.synthetic.main.fragment_question_of_popularity.*


class QuestionOfPopularityFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_of_popularity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == 1) {
            changeChoices()
        }
        setSpinner()
    }

    private fun changeChoices() {
        changeAdapter(spinner_q1_o, resources.getStringArray(R.array.w_array_q1_o))
        changeAdapter(spinner_q2_o, resources.getStringArray(R.array.w_array_q2_o))
        changeAdapter(spinner_q3_o, resources.getStringArray(R.array.w_array_q3_o))
        changeAdapter(spinner_q4_o, resources.getStringArray(R.array.w_array_q4_o))
        changeAdapter(spinner_q5_o, resources.getStringArray(R.array.w_array_q5_o))
    }

    private fun changeAdapter(spinner: Spinner, choices: Array<String>) {
        val adapter = ArrayAdapter<String>(context!!, android.R.layout.simple_spinner_item, choices)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    private fun setSpinner() {
        spinner_q1_o.setSelection(3)
        spinner_q2_o.setSelection(2)
        spinner_q3_o.setSelection(2)
        spinner_q4_o.setSelection(2)
        spinner_q5_o.setSelection(0)
    }


    companion object {
        @JvmStatic
        fun newInstance(): QuestionOfPopularityFragment {
            return QuestionOfPopularityFragment()
        }
    }
}
