package com.websarva.wings.android.abiityofbaseball

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_question_of_appearance.*


class QuestionOfAppearanceFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_question_of_appearance, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (PlayerMakingActivity.sex_id == 1) {
            textChange()
        }

    }


    private fun textChange(){

        val spinnerItems_1 = arrayOf("~150cm", "151~160cm", "161~170cm", "171~180cm","181cm~")
        val spinnerItems_2 = arrayOf("ふつう", "スリム", "ぽっちゃり", "マッチョ","グラマラス")
        val spinnerItems_3 = arrayOf("ふつう","カワイイ系", "美人系", "地味め", "派手め")
        val spinnerItems_4 = arrayOf("優しそう", "こわそう", "元気そう", "大人しそう","不思議ちゃん")
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


    companion object {
        @JvmStatic
        fun newInstance(sex_id : Int): QuestionOfAppearanceFragment{

            val fragment = QuestionOfAppearanceFragment()

//            val args = Bundle()
//            args.putInt("sex",sex_id)
//            fragment.arguments = args

            return fragment
        }
    }
}
