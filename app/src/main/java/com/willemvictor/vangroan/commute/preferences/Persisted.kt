package com.willemvictor.vangroan.commute.preferences

import android.content.Context
import android.content.SharedPreferences
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.reflect.KClass

/**
 * Created by Victor on 2016/12/19.
 */
class Persisted(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)
    private var mapper: ObjectMapper

    init {
        mapper = ObjectMapper()
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }

    /////////////
    // Complex //
    /////////////

    fun putComplex(key: String, value: Any) {
        val json: String = mapper.writeValueAsString(value)
        prefs.edit().putString(key, json).commit()
    }

    fun <T> getComplex(key: String, cls: Class<T>): T {
        val json = prefs.getString(key, "{}")
        return mapper.readValue(json, cls)
    }

    ////////////
    // String //
    ////////////

    fun putString(key: String, value: String) {
        prefs.edit().putString(key, value).commit()
    }

    fun getString(key: String, default: String): String {
        return prefs.getString(key, default)
    }

    companion object {
        @JvmStatic val SHARED_PREF = "commute"
    }
}