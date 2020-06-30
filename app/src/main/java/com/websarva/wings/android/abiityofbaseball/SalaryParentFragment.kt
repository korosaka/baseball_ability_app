package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_making_status.*
import kotlinx.android.synthetic.main.activity_making_status_pitcher.*

open class SalaryParentFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_salary_parent, container, false)
    }

    fun displaySalary(salary: Int) {
        if (salary < 10000) {
            hundred_million_unit.visibility = View.GONE
            ten_thousand_number.text = salary.toString()
        } else {
            hundred_million_number.text = (salary / 10000).toString()
            val tenThousandPartOfSalary = salary % 10000
            if (tenThousandPartOfSalary == 0) ten_thousand_unit.visibility = View.GONE
            else ten_thousand_number.text = tenThousandPartOfSalary.toString()
        }
    }


}