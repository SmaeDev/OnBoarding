package com.smaedev.onboarding

import android.content.Context
import android.content.SharedPreferences

class PrefManager(context: Context) {

    // shared pref mode
    var PRIVATE_MODE = 0

    // Shared preferences file name
    private val PREF_NAME = "skip-welcome"

    private val IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch"

    var pref: SharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
    var spredff = this.pref
    var editor: SharedPreferences.Editor? = spredff.edit()

    fun setFirstTimeLaunch(isFirstTime: Boolean) {
        editor!!.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime)
        editor!!.commit()
    }

    fun isFirstTimeLaunch(): Boolean {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true)
    }
}