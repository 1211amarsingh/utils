package com.test.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

class Prefs(prefName: String, context: Context) {
    private var prefs: SharedPreferences
    private val editor: SharedPreferences.Editor


    init {
        val masterKeyAlias =
            MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();

        prefs = EncryptedSharedPreferences.create(
            context,
            prefName,
            masterKeyAlias, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
        editor = prefs.edit()
    }


    fun setValue(key: String, value: Any) {

        if (value is String) {
            editor.putString(key, value)
        } else if (value is Boolean) {
            editor.putBoolean(key, value)
        } else if (value is Int) {
            editor.putInt(key, value)
        } else if (value is Long) {
            editor.putLong(key, value)
        } else if (value is Float) {
            editor.putFloat(key, value)
        }
        editor.apply()
    }

    fun getIntegerValue(key: String): Int {
        return prefs.getInt(key, 0)
    }

    fun getStringValue(key: String): String? {
        return prefs.getString(key, "")
    }

    fun getModel(key: String): String? {
        return prefs.getString(key, "")
    }

    fun getBooleanValue(key: String): Boolean {
        return prefs.getBoolean(key, false)
    }

    fun clear() {
        editor.clear()
        editor.apply()
    }
}