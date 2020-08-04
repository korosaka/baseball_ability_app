package com.websarva.wings.android.abiityofbaseball.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R
import kotlinx.android.synthetic.main.activity_select_player_type.*

class SelectPlayerTypeActivity : BaseBannerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_select_player_type)
        setAdViewContainer(ad_view_container_on_select_player_type)
        super.onCreate(savedInstanceState)

        operateKeyBoard()
        back_button.setOnClickListener {
            backToTop(it)
        }
    }

    // OKでフォーカス移してキーボード隠す
//    fun onClickNameOK(view: View){
//        orderText.requestFocus()
//        player_name.setFocusable(false)
//    }

    // 選手をつくるボタンクリックで画面遷移
    // 野手
    fun onClickSelectFielder(view: View) {

        val editText = edit_player_name
        val playerName = editText.text.toString()
        // 名前空欄はダメ
        if (playerName.isNotEmpty()) {
            makeIntent(playerName, Constants.TYPE_FIELDER)
        } else {
            Toast.makeText(applicationContext, resources.getString(R.string.input_name), Toast.LENGTH_SHORT).show()
        }
    }

    // 投手
    fun onClickSelectPitcher(view: View) {

        val editText = edit_player_name
        val playerName = editText.text.toString()
        // 名前空欄はダメ
        if (playerName.isNotEmpty()) {
            makeIntent(playerName, Constants.TYPE_PITCHER)
        } else {
            Toast.makeText(applicationContext, resources.getString(R.string.input_name), Toast.LENGTH_SHORT).show()
        }
    }


    /**
     * 入力情報をsetして次のページへ
     */
    private fun makeIntent(name: String, type: String) {

        val intent = Intent(this, AnswerQuestionsActivity::class.java)

        when (sex_radio.checkedRadioButtonId) {
            R.id.radio_m -> intent.putExtra(Constants.SEX_ID, Constants.ID_MAN)
            R.id.radio_w -> intent.putExtra(Constants.SEX_ID, Constants.ID_WOMAN)
        }

        intent.putExtra(Constants.PLAYER_NAME, name)
        intent.putExtra(Constants.PLAYER_TYPE, type)

        startActivity(intent)
        finish()
    }

    /**
     * キーボード表示操作
     */
    private fun operateKeyBoard() {
        edit_player_name.setOnFocusChangeListener { view, b ->
            // フォーカスを取得→キーボード表示
            if (b) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showSoftInput(view, 0)
            }
            // フォーカス外れる→キーボード非表示
            else {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }
    }

    private fun backToTop(view: View) {
        val intent = Intent(this, TopActivity::class.java)
        startActivity(intent)
        finish()
    }

}