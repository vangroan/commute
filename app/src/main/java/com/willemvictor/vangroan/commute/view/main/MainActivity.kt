package com.willemvictor.vangroan.commute.view.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.willemvictor.vangroan.commute.CommuteApplication
import com.willemvictor.vangroan.commute.R
import com.willemvictor.vangroan.commute.preferences.CommutePreferences
import com.willemvictor.vangroan.commute.view.main.adapters.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    companion object {
        @JvmStatic val TAG: String? = MainActivity::class.simpleName
    }

    @Inject
    lateinit var prefs: CommutePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as CommuteApplication).component.inject(this)

        activity_main_view_pager.adapter = MainPagerAdapter(supportFragmentManager)
        activity_main_tab_layout.setupWithViewPager(activity_main_view_pager)
    }
}
