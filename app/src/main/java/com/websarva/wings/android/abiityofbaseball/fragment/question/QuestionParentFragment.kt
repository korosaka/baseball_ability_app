package com.websarva.wings.android.abiityofbaseball.fragment.question

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.websarva.wings.android.abiityofbaseball.activity.AnswerQuestionsActivity
import com.websarva.wings.android.abiityofbaseball.Constants

abstract class QuestionParentFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (AnswerQuestionsActivity.sex_id == Constants.ID_WOMAN) {
            changeChoices()
        }
        setSpinner()
    }

    protected abstract fun changeChoices()
    protected abstract fun setSpinner()

    protected fun changeAdapter(spinner: Spinner, choices: Array<String>) {
        val adapter = ArrayAdapter<String>(context!!, R.layout.simple_spinner_item, choices)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

}