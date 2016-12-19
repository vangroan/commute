package com.willemvictor.vangroan.commute.view.main

import android.os.Bundle
import com.willemvictor.vangroan.commute.CommuteApplication
import com.willemvictor.vangroan.commute.R
import com.willemvictor.vangroan.commute.preferences.CommutePreferences
import com.willemvictor.vangroan.commute.view.CommuteActivity
import com.willemvictor.vangroan.commute.view.main.adapters.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : CommuteActivity() {

    private lateinit var adapter: MainPagerAdapter

    companion object {
        @JvmStatic val TAG: String? = MainActivity::class.simpleName
    }

    @Inject
    lateinit var prefs: CommutePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as CommuteApplication).component.inject(this)

        adapter = MainPagerAdapter(supportFragmentManager)
        activity_main_view_pager.adapter = adapter
        activity_main_tab_layout.setupWithViewPager(activity_main_view_pager)

        activity_main_add_action_button.setOnClickListener {
            onAddActionClick()
        }
    }

    private fun onAddActionClick() {
        adapter.current?.onAddActionClick()
    }
}
