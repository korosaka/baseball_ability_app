package com.websarva.wings.android.abiityofbaseball.fragment

import android.app.Dialog
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.websarva.wings.android.abiityofbaseball.Constants
import com.websarva.wings.android.abiityofbaseball.R

class PrivacyPolicyFragment : DialogFragment() {

    lateinit var agreeButton: Button

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(context!!)
        addDialogLayout(dialog)

        return dialog
    }

    private fun addDialogLayout(dialog: Dialog) {
        dialog.setCanceledOnTouchOutside(false)
        dialog.setContentView(R.layout.fragment_privacy_policy)

        addButtonSetting(dialog)
        addLinkTextSetting(dialog)
    }

    private fun addButtonSetting(dialog: Dialog) {
        agreeButton = dialog.findViewById<Button>(R.id.agree_button)
        val buttonType = arguments?.getString(Constants.BUTTON_TYPE).toString()

        changeButtonText(buttonType)
        addButtonListener(buttonType, dialog)
    }

    private fun addLinkTextSetting(dialog: Dialog) {
        val linkText = dialog.findViewById<TextView>(R.id.link)
        linkText.movementMethod = LinkMovementMethod.getInstance()
    }

    private fun changeButtonText(buttonType: String) {
        when (buttonType) {
            Constants.AGREE -> agreeButton.text = resources.getString(R.string.agree)
            Constants.CLOSE -> agreeButton.text = resources.getString(R.string.close)
        }
    }

    private fun addButtonListener(buttonType: String, dialog: Dialog) {
        agreeButton.setOnClickListener {
            when (buttonType) {
                Constants.AGREE -> {

                }
            }
            dialog.dismiss()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(buttonType: String) =
                PrivacyPolicyFragment().apply {
                    arguments = Bundle().apply {
                        putString(Constants.BUTTON_TYPE, buttonType)
                    }
                }
    }


}