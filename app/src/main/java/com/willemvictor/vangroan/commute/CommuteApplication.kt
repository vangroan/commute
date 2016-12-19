package com.willemvictor.vangroan.commute

import android.app.Application
import com.willemvictor.vangroan.commute.dagger.CommuteComponent
import com.willemvictor.vangroan.commute.dagger.CommuteModule
import com.willemvictor.vangroan.commute.dagger.DaggerCommuteComponent

/**
 * Created by Victor on 2016/12/19.
 */

class CommuteApplication : Application() {

    lateinit var component: CommuteComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerCommuteComponent.builder()
                .commuteModule(CommuteModule())
                .build()
        component.inject(this)
    }
}
