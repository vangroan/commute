package com.willemvictor.vangroan.commute.model

/**
 * Created by Victor on 2016/12/20.
 */
data class Distance(val value: Double, val unit: DistanceUnit) {

    fun to(toUnit: DistanceUnit) : Distance {
        return Distance((value / unit.factor) * toUnit.factor, toUnit)
    }
}