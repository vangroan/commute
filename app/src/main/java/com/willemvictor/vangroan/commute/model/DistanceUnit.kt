package com.willemvictor.vangroan.commute.model

import android.content.Context
import com.willemvictor.vangroan.commute.R

/**
 * Created by Victor on 2016/12/20.
 */
enum class DistanceUnit(
        private val symbolRes: Int,
        private val nameRes: Int,
        val factor: Double) {

    M(R.string.distance_unit_m_symbol, R.string.distance_unit_m_name, 1.0),
    KM(R.string.distance_unit_km_symbol, R.string.distance_unit_km_name, 1 / 1000.0),
    MI(R.string.distance_unit_mi_symbol, R.string.distance_unit_mi_name, 1 / 1609.34);

    fun getSymbol(context: Context): String {
        return context.getString(symbolRes)
    }

    fun getName(context: Context): String {
        return context.getString(nameRes)
    }
}