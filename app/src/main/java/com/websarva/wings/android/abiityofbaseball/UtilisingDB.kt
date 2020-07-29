package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import com.websarva.wings.android.abiityofbaseball.calc_ability.CalcPitcherAbility
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerFielderClass
import com.websarva.wings.android.abiityofbaseball.player_class.PlayerPitcherClass

class UtilisingDB(context: Context) {

    private var helper: DatabaseHelper = DatabaseHelper(context)

    fun saveFielder(fielder: PlayerFielderClass) {
        val database = helper.writableDatabase

        val stmt = database.compileStatement(FIELDER_INSERT)
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

        stmt.executeInsert()
    }

    fun savePitcher(pitcher: PlayerPitcherClass) {
        val database = helper.writableDatabase

        val stmt = database.compileStatement(PITCHER_INSERT)
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

        stmt.executeInsert()
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
    }

}