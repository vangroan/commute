package com.willemvictor.vangroan.commute.model

/**
 * Created by Victor on 2016/12/20.
 */
data class Distance(val value: Double, val unit: DistanceUnit) {

    fun to(toUnit: DistanceUnit) : Distance {
        return Distance((value / unit.factor) * toUnit.factor, toUnit)
    }

    operator fun plus(b: Distance) : Distance {
        if (unit != b.unit)
            throw DistanceUnitMismatch()
        return Distance(value + b.value, unit)
    }
}