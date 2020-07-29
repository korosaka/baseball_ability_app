package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
        SQLiteOpenHelper(context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION) {

    override fun onCreate(database: SQLiteDatabase?) {
        database?.execSQL(CREATE_FIELDER_TABLE)
        database?.execSQL(CREATE_PITCHER_TABLE)
    }

    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}


    companion object {
        const val CREATE_FIELDER_TABLE =
                "CREATE TABLE " +
                        Constants.FIELDER_TABLE +
                        "(fielder_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name TEXT, " +
                        "position TEXT, " +
                        "ballistic INTEGER, " +
                        "contact INTEGER, " +
                        "power INTEGER, " +
                        "speed INTEGER, " +
                        "arm INTEGER, " +
                        "fielding INTEGER, " +
                        "catching INTEGER, " +
                        "chance REAL);"
        const val CREATE_PITCHER_TABLE =
                "CREATE TABLE " +
                        Constants.PITCHER_TABLE +
                        "(pitcher_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name TEXT, " +
                        "type TEXT, " +
                        "max_speed INTEGER, " +
                        "control INTEGER, " +
                        "stamina INTEGER, " +
                        "slider INTEGER, " +
                        "curb INTEGER, " +
                        "folk INTEGER, " +
                        "sinker INTEGER, " +
                        "shoot INTEGER, " +
                        "chance REAL);"
    }
}
