package com.test.myapplication

import android.content.Context


object PrefManager {
    lateinit var prefs: Prefs
    private var prefName = "encrypted_shared_pref"

    fun initPrefs(context: Context) {
        prefs = Prefs(prefName, context)
    }
}