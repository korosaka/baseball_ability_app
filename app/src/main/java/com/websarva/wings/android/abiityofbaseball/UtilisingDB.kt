package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.content.Intent
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteStatement
import android.graphics.Color
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.websarva.wings.android.abiityofbaseball.activity.ShowResultActivity
import com.websarva.wings.android.abiityofbaseball.calc_ability.CalcPitcherAbility
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerFielderClass
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerPitcherClass

class UtilisingDB(private val context: Context, private val applicationContext: Context) {

    private var helper: DatabaseHelper = DatabaseHelper(context)
    private var saveSucceed = true
    private var mFielder: PlayerFielderClass? = null
    private var mPitcher: PlayerPitcherClass? = null

    fun countSavedFielder(): Int {
        val database = helper.readableDatabase
        val count = DatabaseUtils.queryNumEntries(database, Constants.FIELDER_TABLE).toInt()
        database.close()
        return count
    }

    fun countSavedPitcher(): Int {
        val database = helper.readableDatabase
        val count = DatabaseUtils.queryNumEntries(database, Constants.PITCHER_TABLE).toInt()
        database.close()
        return count
    }

    fun saveFielder(fielder: PlayerFielderClass, saveButton: Button) {
        mFielder = fielder
        savePlayer(Constants.TYPE_FIELDER, saveButton)
    }

    fun savePitcher(pitcher: PlayerPitcherClass, saveButton: Button) {
        mPitcher = pitcher
        savePlayer(Constants.TYPE_PITCHER, saveButton)
    }

    private fun savePlayer(playerType: String, saveButton: Button) {
        val database = helper.writableDatabase
        saveSucceed = true
        try {
            insertPlayerInfo(playerType, database)
        } catch (e: java.lang.Exception) {
            saveSucceed = false
        } finally {
            database.close()
            showSaveToast(saveSucceed)
            if (saveSucceed) disableButton(saveButton)
        }
    }

    private fun insertPlayerInfo(playerType: String, database: SQLiteDatabase) {
        try {
            when (playerType) {
                Constants.TYPE_FIELDER -> {
                    val stmt = database.compileStatement(FIELDER_INSERT)
                    mFielder?.let { bindFielderStmt(stmt, it) }
                    stmt.executeInsert()
                }
                Constants.TYPE_PITCHER -> {
                    val stmt = database.compileStatement(PITCHER_INSERT)
                    mPitcher?.let { bindPitcherStmt(stmt, it) }
                    stmt.executeInsert()
                }
            }
        } catch (e: java.lang.Exception) {
            throw e
        }
    }

    private fun bindFielderStmt(stmt: SQLiteStatement, fielder: PlayerFielderClass) {
        stmt.bindString(1, fielder.playerName)
        stmt.bindString(2, fielder.mainPosition)
        stmt.bindLong(3, fielder.ballisticAbility.toLong())
        stmt.bindLong(4, fielder.contactAbility.toLong())
        stmt.bindLong(5, fielder.powerAbility.toLong())
        stmt.bindLong(6, fielder.speedAbility.toLong())
        stmt.bindLong(7, fielder.armAbility.toLong())
        stmt.bindLong(8, fielder.fieldingAbility.toLong())
        stmt.bindLong(9, fielder.catchingAbility.toLong())
        stmt.bindDouble(10, fielder.chance)
    }

    private fun bindPitcherStmt(stmt: SQLiteStatement, pitcher: PlayerPitcherClass) {
        stmt.bindString(1, pitcher.playerName)
        stmt.bindString(2, pitcher.pitcherType)
        stmt.bindLong(3, pitcher.maxBallSpeed.toLong())
        stmt.bindLong(4, pitcher.controlAbility.toLong())
        stmt.bindLong(5, pitcher.staminaAbility.toLong())
        stmt.bindLong(6, pitcher.changeBalls[CalcPitcherAbility.SLIDER_INDEX].toLong())
        stmt.bindLong(7, pitcher.changeBalls[CalcPitcherAbility.CURB_INDEX].toLong())
        stmt.bindLong(8, pitcher.changeBalls[CalcPitcherAbility.FOLK_INDEX].toLong())
        stmt.bindLong(9, pitcher.changeBalls[CalcPitcherAbility.SINKER_INDEX].toLong())
        stmt.bindLong(10, pitcher.changeBalls[CalcPitcherAbility.SHOOT_INDEX].toLong())
        stmt.bindDouble(11, pitcher.chance)
    }


    // TODO test
    fun getFielders() {
        val database = helper.readableDatabase

        val cursor = database.rawQuery(FIELDER_SELECT, null)
        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex("name"))
            val position = cursor.getString(cursor.getColumnIndex("position"))
            val ballistic = cursor.getInt(cursor.getColumnIndex("ballistic"))
            val contact = cursor.getInt(cursor.getColumnIndex("contact"))
            val power = cursor.getInt(cursor.getColumnIndex("power"))
            val speed = cursor.getInt(cursor.getColumnIndex("speed"))
            val arm = cursor.getInt(cursor.getColumnIndex("arm"))
            val fielding = cursor.getInt(cursor.getColumnIndex("fielding"))
            val catching = cursor.getInt(cursor.getColumnIndex("catching"))
            val chance = cursor.getDouble(cursor.getColumnIndex("chance"))

            Log.e("test_db", "$name $position $ballistic $contact $power $speed $arm $fielding $catching $chance")
            database.close()
        }
    }

    fun getFielderForList(): ArrayList<PlayerItemData> {
        val fielderItemList = ArrayList<PlayerItemData>()

        val database = helper.readableDatabase
        val cursor = database.rawQuery(FIELDER_FOR_LIST, null)
        while (cursor.moveToNext()) {
            val fielderId = cursor.getInt(cursor.getColumnIndex("fielder_id"))
            val name = cursor.getString(cursor.getColumnIndex("name"))
            val position = cursor.getString(cursor.getColumnIndex("position"))
            val player = PlayerItemData(fielderId, name, position)

            fielderItemList.add(player)
        }
        database.close()

        return fielderItemList
    }

    fun getFielderWithId(id: Int) : Intent {
        val intent = Intent(context, ShowResultActivity::class.java)
        val database = helper.readableDatabase
        val cursor = database.rawQuery(FIELDER_SELECT_WITH_ID + id, null)
        if (cursor.moveToNext()) {
            intent.putExtra(Constants.PLAYER_NAME, cursor.getString(cursor.getColumnIndex("name")))
            intent.putExtra(Constants.POSITION, cursor.getString(cursor.getColumnIndex("position")))
            intent.putExtra(Constants.BALLISTIC, cursor.getInt(cursor.getColumnIndex("ballistic")))
            intent.putExtra(Constants.CONTACT, cursor.getInt(cursor.getColumnIndex("contact")))
            intent.putExtra(Constants.POWER, cursor.getInt(cursor.getColumnIndex("power")))
            intent.putExtra(Constants.SPEED, cursor.getInt(cursor.getColumnIndex("speed")))
            intent.putExtra(Constants.ARM_STRENGTH, cursor.getInt(cursor.getColumnIndex("arm")))
            intent.putExtra(Constants.FIELDING, cursor.getInt(cursor.getColumnIndex("fielding")))
            intent.putExtra(Constants.CATCHING, cursor.getInt(cursor.getColumnIndex("catching")))
            intent.putExtra(Constants.CHANCE, cursor.getDouble(cursor.getColumnIndex("chance")))
        }
        database.close()
        return intent
    }


    // TODO test
    fun getPitcher() {
        val database = helper.readableDatabase

        val cursor = database.rawQuery(PITCHER_SELECT, null)
        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndex("name"))
            val type = cursor.getString(cursor.getColumnIndex("type"))
            val maxSpeed = cursor.getInt(cursor.getColumnIndex("max_speed"))
            val control = cursor.getInt(cursor.getColumnIndex("control"))
            val stamina = cursor.getInt(cursor.getColumnIndex("stamina"))
            val slider = cursor.getInt(cursor.getColumnIndex("slider"))
            val curb = cursor.getInt(cursor.getColumnIndex("curb"))
            val folk = cursor.getInt(cursor.getColumnIndex("folk"))
            val sinker = cursor.getInt(cursor.getColumnIndex("sinker"))
            val shoot = cursor.getInt(cursor.getColumnIndex("shoot"))
            val chance = cursor.getDouble(cursor.getColumnIndex("chance"))

            Log.e("pitcher_db", "$name $type $maxSpeed $control $stamina $slider $curb $folk $sinker $shoot $chance")
            database.close()
        }
    }

    private fun showSaveToast(success: Boolean) {
        val messageId = if (success) R.string.completed_save
        else R.string.failed_save
        Toast.makeText(applicationContext, context.resources.getString(messageId), Toast.LENGTH_SHORT).show()
    }

    private fun disableButton(button: Button) {
        button.isEnabled = false
        button.setTextColor(Color.parseColor(Constants.SAVE_DISABLE_COLOR))
        val disableBackground =
                ResourcesCompat.getDrawable(context.resources, R.drawable.save_button_disable, null)
        button.background = disableBackground
    }


    companion object {

        const val FIELDER_INSERT = "INSERT INTO " +
                Constants.FIELDER_TABLE +
                "(name, position, ballistic, contact, power, speed, arm, fielding, catching, chance) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?)"

        const val PITCHER_INSERT = "INSERT INTO " +
                Constants.PITCHER_TABLE +
                "(name, type, max_speed, control, stamina, slider, curb, folk, sinker, shoot, chance) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?)"

        const val FIELDER_SELECT = "SELECT * FROM " + Constants.FIELDER_TABLE
        const val PITCHER_SELECT = "SELECT * FROM " + Constants.PITCHER_TABLE
        const val FIELDER_FOR_LIST = "SELECT fielder_id, name, position FROM " + Constants.FIELDER_TABLE
        const val FIELDER_SELECT_WITH_ID = "SELECT * FROM " + Constants.FIELDER_TABLE + " WHERE fielder_id = "
    }

}