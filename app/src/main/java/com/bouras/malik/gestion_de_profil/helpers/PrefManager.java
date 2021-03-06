package com.bouras.malik.gestion_de_profil.helpers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Gestion du sharedpref
 */
public class PrefManager {
    // Shared preferences file name
    private static final String PREF_NAME = "pref";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String SERVER_TOKEN = "server_token";
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    // shared pref mode
    private int PRIVATE_MODE = 0;

    @SuppressLint("CommitPrefEdits")
    public PrefManager(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
}
