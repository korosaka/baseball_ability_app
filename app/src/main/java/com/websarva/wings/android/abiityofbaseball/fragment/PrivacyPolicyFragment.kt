package com.websarva.wings.android.abiityofbaseball.fragment

import android.app.Dialog
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.websarva.wings.android.abiityofbaseball.R

class PrivacyPolicyFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(context!!)
        dialog.setCanceledOnTouchOutside(false)
        dialog.setContentView(R.layout.fragment_privacy_policy)

        val agreeButton = dialog.findViewById<Button>(R.id.agree_button)
        agreeButton.setOnClickListener {
            dialog.dismiss()
        }
        val linkText = dialog.findViewById<TextView>(R.id.link)
        linkText.movementMethod = LinkMovementMethod.getInstance()

        return dialog
    }

}