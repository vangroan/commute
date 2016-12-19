package com.willemvictor.vangroan.commute.view.main.fragments.trip

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.willemvictor.vangroan.commute.R
import com.willemvictor.vangroan.commute.view.main.fragments.trip.adapters.TripAdapter
import kotlinx.android.synthetic.main.fragment_trip.*

class TripFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {

        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_trip, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        fragment_trip_recycler_view.layoutManager = layoutManager
        fragment_trip_recycler_view.adapter = TripAdapter(context)
        fragment_trip_recycler_view.adapter.notifyDataSetChanged()
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
