package com.willemvictor.vangroan.commute.view.main.fragments.trip.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.willemvictor.vangroan.commute.R
import com.willemvictor.vangroan.commute.model.Trip
import com.willemvictor.vangroan.commute.view.main.fragments.trip.viewholders.TripViewHolder
import java.util.*

/**
 * Created by Victor on 2016/12/19.
 */
class TripAdapter(val context: Context) : RecyclerView.Adapter<TripViewHolder>() {

    private val trips: MutableList<Trip> = ArrayList()

    init {
        trips.add(Trip())
        trips.add(Trip())
        trips.add(Trip())
        trips.add(Trip())
    }

    override fun getItemCount(): Int {
        return trips.size
    }

    override fun onBindViewHolder(holder: TripViewHolder?, position: Int) {
        holder!!.populate(trips[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TripViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_holder_trip, parent, false)
        return TripViewHolder(view)
    }
}