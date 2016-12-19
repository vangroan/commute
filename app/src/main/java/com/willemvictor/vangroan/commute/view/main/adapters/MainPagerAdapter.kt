package com.willemvictor.vangroan.commute.view.main.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.willemvictor.vangroan.commute.view.main.enums.MainPagerPosition
import com.willemvictor.vangroan.commute.view.main.fragments.trip.TripFragment

/**
 * Created by Victor on 2016/12/19.
 */
class MainPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (MainPagerPosition.byIndex(position)) {
            MainPagerPosition.TRIP -> TripFragment.newInstance()
            else -> TripFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return MainPagerPosition.values().size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return MainPagerPosition.byIndex(position)?.name ?: ""
    }
}