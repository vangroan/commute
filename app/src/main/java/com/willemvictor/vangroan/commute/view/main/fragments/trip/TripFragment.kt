package com.willemvictor.vangroan.commute.view.main.fragments.trip

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.willemvictor.vangroan.commute.R

class TripFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {

        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_trip, container, false)
    }

    companion object {
        fun newInstance(): TripFragment {
            val fragment = TripFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
