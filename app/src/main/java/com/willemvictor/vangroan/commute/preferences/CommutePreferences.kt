package com.willemvictor.vangroan.commute.preferences

import android.content.Context
import com.willemvictor.vangroan.commute.model.Trip

/**
 * Created by Victor on 2016/12/19.
 */
class CommutePreferences(context: Context) {

    private val persisted = Persisted(context)

    fun saveTrip(trip: Trip) {
        persisted.putComplex(TRIP, trip)
    }

    fun loadTrip() : Trip {
        return persisted.getComplex(TRIP, Trip::class.java)
    }

    companion object {
        @JvmStatic val TRIP = "trip"
    }
}