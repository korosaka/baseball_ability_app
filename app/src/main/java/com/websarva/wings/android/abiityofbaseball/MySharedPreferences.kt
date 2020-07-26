package com.websarva.wings.android.abiityofbaseball

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences(context: Context) {

    var dataStore: SharedPreferences = context.getSharedPreferences("DataStore", Context.MODE_PRIVATE)

    fun storeBoolean(boolean: Boolean, key: String) {
        val editor = dataStore.edit()
        editor.putBoolean(key, boolean)
        editor.apply()
    }

    fun getBoolean(key: String): Boolean {
        return dataStore.getBoolean(key, false)
    }
}