package com.willemvictor.vangroan.commute.view.main.viewholders

import android.support.annotation.CallSuper
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by Victor on 2016/12/19.
 */

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @CallSuper
    open fun populate(data: T) {
        reset()
    }

    abstract protected fun reset()
}