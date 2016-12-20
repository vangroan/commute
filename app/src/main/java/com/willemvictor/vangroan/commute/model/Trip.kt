package com.willemvictor.vangroan.commute.model

/**
 * Created by Victor on 2016/12/19.
 */
class Trip(private val unit: DistanceUnit = DistanceUnit.KM) {

    var distance = Distance(0.0, unit)
        get() = field
        set(value) {
            field = value.to(unit)
        }
}