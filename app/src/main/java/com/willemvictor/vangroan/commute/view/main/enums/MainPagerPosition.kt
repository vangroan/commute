package com.willemvictor.vangroan.commute.view.main.enums

import java.util.*

/**
 * Created by Victor on 2016/12/19.
 */
enum class MainPagerPosition(private val index : Int) {
    TRIP(0);

    companion object {

        @JvmStatic val map : MutableMap<Int, MainPagerPosition> = HashMap()

        init {
            for (pos in values())
                map.put(pos.index, pos)
        }

        fun byIndex(index : Int) : MainPagerPosition? {
            return map[index]
        }
    }
}