package com.willemvictor.vangroan.commute.preferences

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Victor on 2016/12/19.
 */
class Persisted (context : Context) {

    private val prefs : SharedPreferences = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)

    ////////////
    // String //
    ////////////

    fun putString(key: String, value: String) {
        prefs.edit().putString(key, value).commit()
    }

    fun getString(key: String, default: String) : String {
        return prefs.getString(key, default)
    }

    companion object {
        @JvmStatic val SHARED_PREF = "commute"
    }
}