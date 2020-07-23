package com.websarva.wings.android.abiityofbaseball

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.net.Uri
import android.os.Environment
import android.view.View
import android.widget.Toast
import androidx.core.app.ShareCompat
import java.io.File
import java.io.FileOutputStream

class Tweet(private val context: Context,
            private val activity: Activity,
            private val view: View,
            private val playerName: String) {


    private val displayPlayerName = "『$playerName』"
    private val message1 = "野球能力診断アプリで"
    private val message2 = "を診断しました！"
    private val androidTab = "Android: "
    private val googlePlayUrl = "https://bit.ly/39dbyZP"
    private val hashTagMessage = "#野球能力診断"
    private val nextLine = "\n"
    private val tweetMessage = message1 + nextLine + displayPlayerName + message2 + nextLine +
            nextLine + androidTab + googlePlayUrl+ nextLine + nextLine + hashTagMessage
    private val dataType = "image/jpeg"

    private val fileName = "player_info.jpg"
    private val errorMassage = "エラー発生"
    private val meaningLessNum = 1


    private fun takeScreenShot(view: View): Bitmap {
        val returnedBitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(returnedBitmap)

        val bgDrawable = view.background
        if (bgDrawable != null) bgDrawable.draw(canvas)
        else canvas.drawColor(Color.WHITE)

        view.draw(canvas)
        return returnedBitmap
    }

    private fun saveImage(bitmap: Bitmap): Uri {
        try {
            val directory = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES).toString()

            val folder = File(directory)
            if (!folder.exists()) {
                folder.mkdirs()
            }
            val imageFile = File(folder, fileName)
            imageFile.createNewFile()

            var fos: FileOutputStream? = null
            fos = FileOutputStream(imageFile)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.close()

            return Uri.parse("$directory/$fileName")

        } catch (e: Exception) {
            Toast.makeText(context, errorMassage, Toast.LENGTH_SHORT).show()
        }
        return Uri.parse(Constants.EMPTY)
    }

    private fun shareCompat(imagePath: Uri) {

        val builder = ShareCompat.IntentBuilder.from(activity)
        builder.setChooserTitle(Constants.EMPTY)
                .setText(tweetMessage)
                .setStream(imagePath)
                .setType(dataType)

        val intent =
                builder.createChooserIntent().addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

        activity.startActivityForResult(intent, meaningLessNum)
    }

    public fun tweet() {
        val mBitmap = takeScreenShot(view)
        shareCompat(saveImage(mBitmap))
    }

}