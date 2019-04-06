package com.websarva.wings.android.abiityofbaseball

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_select_player_type.*

class SelectPlayerTypeActivity : AppCompatActivity(){

    companion object {
        const val PLAYER_NAME = "playerName"
        const val SEXID = "sex_id"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_player_type)

        // 広告処理
        MobileAds.initialize(this,"ca-app-pub-6298264304843789~4492140864")
        val adRequest = AdRequest.Builder().build()
        adView_selectType.loadAd(adRequest)

    }

    // 選手をつくるボタンクリックで画面遷移
    fun onClickSelectFielder(view : View){

        val editText = player_name
        val playerName = editText.text.toString()
        // 名前空欄はダメ
        if(playerName.isNotEmpty()){
            makeIntent(playerName)
        } else {
            Toast.makeText(applicationContext,"登録名を入力してください",Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * 入力情報をsetして次のページへ
     */
    private fun makeIntent(name:String){

        val intent = Intent(this,PlayerMakingActivity::class.java)

        val radioGroup = sex_radio
        val id = radioGroup.checkedRadioButtonId

        when(id){
            R.id.radio_m -> intent.putExtra(SEXID,0)
            R.id.radio_w -> intent.putExtra(SEXID,1)
        }

        intent.putExtra(PLAYER_NAME,name)

        startActivity(intent)
    }


}