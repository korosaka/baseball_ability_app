package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_select_player_type.*

class SelectPlayerTypeActivity : BaseBannerActivity() {

    companion object {
        const val PLAYER_NAME = "playerName"
        const val PLAYER_TYPE = "playerType"
        const val SEXID = "sex_id"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_select_player_type)
        super.setAdViewContainer(ad_view_container_on_select_player_type)
        super.onCreate(savedInstanceState)

        operateKeyBoard()

    }

    // OKでフォーカス移してキーボード隠す
//    fun onClickNameOK(view: View){
//        orderText.requestFocus()
//        player_name.setFocusable(false)
//    }

    // 選手をつくるボタンクリックで画面遷移
    // 野手
    fun onClickSelectFielder(view : View){

        val editText = player_name
        val playerName = editText.text.toString()
        // 名前空欄はダメ
        if(playerName.isNotEmpty()){
            makeIntent(playerName,"fielder")
        } else {
            Toast.makeText(applicationContext,"登録名を入力してください",Toast.LENGTH_SHORT).show()
        }
    }

    // 投手
    fun onClickSelectPitcher(view : View){

        val editText = player_name
        val playerName = editText.text.toString()
        // 名前空欄はダメ
        if(playerName.isNotEmpty()){
            makeIntent(playerName,"pitcher")
        } else {
            Toast.makeText(applicationContext,"登録名を入力してください",Toast.LENGTH_SHORT).show()
        }
    }


    /**
     * 入力情報をsetして次のページへ
     */
    private fun makeIntent(name:String,type:String){

        val intent = Intent(this,PlayerMakingActivity::class.java)

        val radioGroup = sex_radio
        val id = radioGroup.checkedRadioButtonId

        when(id){
            R.id.radio_m -> intent.putExtra(SEXID,0)
            R.id.radio_w -> intent.putExtra(SEXID,1)
        }

        intent.putExtra(PLAYER_NAME,name)
        intent.putExtra(PLAYER_TYPE,type)

        startActivity(intent)
        finish()
    }

    /**
     * キーボード表示操作
     */
    private fun operateKeyBoard(){
        player_name.setOnFocusChangeListener{ view, b ->
                // フォーカスを取得→キーボード表示
                if(b){
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.showSoftInput(view,0)
                }
                // フォーカス外れる→キーボード非表示
                else {
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(view.getWindowToken(),0)
                }
        }
    }


}