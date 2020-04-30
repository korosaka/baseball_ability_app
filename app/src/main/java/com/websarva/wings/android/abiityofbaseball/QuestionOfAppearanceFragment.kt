package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*


class QuestionOfAppearanceFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_question_of_appearance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == 1) {
            textChange()
        }
        setSpinner()
    }


    private fun textChange(){

        val spinnerItems_1 = arrayOf("~150cm", "151~160cm", "161~170cm", "171~180cm","181cm~")
        val spinnerItems_2 = arrayOf("ふつう", "スリム", "ぽっちゃり", "ムッチリ", "マッチョ","グラマラス")
        val spinnerItems_3 = arrayOf("ふつう","カワイイ系", "美人系", "地味め", "派手め")
        val spinnerItems_4 = arrayOf("優しそう", "マジメそう", "こわそう", "元気そう", "大人しそう","チャラそう")
        val spinnerItems_5 = arrayOf("ふつう", "オシャレ", "地味め", "派手め", "独創的")


        var adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_1)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q1_a.adapter = adapter


        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_2)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q2_a.adapter = adapter


        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_3)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q3_a.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_4)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q4_a.adapter = adapter

        adapter = ArrayAdapter<String>(context,android.R.layout.simple_spinner_item,spinnerItems_5)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_q5_a.adapter = adapter

    }

    fun setSpinner(){
        spinner_q1_a.setSelection(0)
        spinner_q2_a.setSelection(0)
        spinner_q3_a.setSelection(0)
        spinner_q4_a.setSelection(0)
        spinner_q5_a.setSelection(0)
    }


    companion object {
        @JvmStatic
        fun newInstance(): QuestionOfAppearanceFragment{
            return QuestionOfAppearanceFragment()
        }
    }
}
