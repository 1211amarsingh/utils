package com.kv.ledgeraccountbook.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    private final SharedPreferences.Editor editor;
    private SharedPreferences sharedPreferences;

    @SuppressLint("CommitPrefEdits")
    public PrefManager(Context context, String db) {
        if (db == null) {
            db = "default_db";
        }
        sharedPreferences = context.getSharedPreferences(db, 0);//Activity.MODE_PRIVATE
        editor = sharedPreferences.edit();
    }

    public PrefManager(Context context) {
        String db = "default_db";
        sharedPreferences = context.getSharedPreferences(db, 0);//Activity.MODE_PRIVATE
        editor = sharedPreferences.edit();
    }

    public boolean exist(String key) {
        return sharedPreferences.contains(key);
    }

    public void putString(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    public int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public void putLong(String key, long value) {
        editor.putLong(key, value);
        editor.apply();
    }

    public long getLong(String key) {
        return sharedPreferences.getLong(key, 0);
    }

    public void putFloat(String key, float value) {
        editor.putFloat(key, value);
        editor.apply();
    }

    public float getFloat(String key) {
        return sharedPreferences.getFloat(key, 0);
    }

    public void clear() {
        editor.clear();
        editor.apply();
    }


    /*
    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            dir.delete();
        } catch (Exception e) {}
    }*/
}
