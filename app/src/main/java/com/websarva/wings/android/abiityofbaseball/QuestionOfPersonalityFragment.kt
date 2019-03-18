package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_question_of_personality.*


class QuestionOfPersonalityFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_of_personality, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == 1) {
            textChange()
        }
        setSpinner()
    }

    private fun textChange(){

        val spinnerItems_1 = arrayOf("穏やか", "おとなしい", "サバサバ", "うるさい","メンヘラ")
        val spinnerItems_2 = arrayOf("優しい", "気が強い", "無気力", "かまってちゃん","一匹オオカミ")
        val spinnerItems_3 = arrayOf("リーダー","控えめ", "ムードメーカー", "評論家", "アイデアマン")
        val spinnerItems_4 = arrayOf("ふつう","勉強得意", "頭キレキレ", "頭からっぽ", "脳筋")
        val spinnerItems_5 = arrayOf("ふつう", "冗談多め", "話が面白い", "つまらない", "全てが面白い")


        var adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_1)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q1_p.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_2)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q2_p.adapter = adapter


        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_3)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q3_p.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_4)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q4_p.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_5)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q5_p.adapter = adapter

    }

    fun setSpinner(){
        spinner_q1_p.setSelection(0)
        spinner_q2_p.setSelection(0)
        spinner_q3_p.setSelection(0)
        spinner_q4_p.setSelection(0)
        spinner_q5_p.setSelection(0)
    }



    companion object {
        @JvmStatic
        fun newInstance(): QuestionOfPersonalityFragment{
            return QuestionOfPersonalityFragment()
        }
    }
}
