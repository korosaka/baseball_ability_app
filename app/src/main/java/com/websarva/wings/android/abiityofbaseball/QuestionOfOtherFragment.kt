package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_question_of_other.*


class QuestionOfOtherFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_of_other, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == 1) {
            textChange()
        }
        setSpinner()
    }

    private fun textChange(){

        val spinnerItems_1 = arrayOf("マドンナ", "モテる", "一部から", "ふつう","ぷぅ〜")
        val spinnerItems_2 = arrayOf("大人気", "まぁまぁ", "ふつう", "あんまり","ぷぅ〜")
        val spinnerItems_3 = arrayOf("最強","なかなか", "ふつう", "あんまり", "豆腐メンタル")
        val spinnerItems_4 = arrayOf("大好き","まぁまぁ", "ふつう", "興味深い", "アンチ")
        val spinnerItems_5 = arrayOf("特になし", "スポーツ少女", "ボスキャラ", "お色気", "大和撫子", "ヘビースモーカー", "酒豪")


        var adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_1)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q1_o.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_2)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q2_o.adapter = adapter


        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_3)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q3_o.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_4)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q4_o.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_5)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q5_o.adapter = adapter

    }

    fun setSpinner(){
        spinner_q1_o.setSelection(3)
        spinner_q2_o.setSelection(2)
        spinner_q3_o.setSelection(2)
        spinner_q4_o.setSelection(2)
        spinner_q5_o.setSelection(0)
    }



    companion object {
        @JvmStatic
        fun newInstance(): QuestionOfOtherFragment{
            return QuestionOfOtherFragment()
        }
    }
}
