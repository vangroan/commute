package com.willemvictor.vangroan.commute.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.willemvictor.vangroan.commute.CommuteApplication
import com.willemvictor.vangroan.commute.R
import com.willemvictor.vangroan.commute.preferences.CommutePreferences
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    companion object {
        @JvmStatic val TAG : String? = MainActivity::class.simpleName;
    }

    @Inject
    lateinit var prefs : CommutePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as CommuteApplication).component.inject(this)
        Log.d(TAG, "onCreate")
    }
}
