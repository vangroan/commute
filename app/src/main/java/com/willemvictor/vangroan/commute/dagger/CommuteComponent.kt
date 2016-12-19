package com.willemvictor.vangroan.commute.dagger

import com.willemvictor.vangroan.commute.CommuteApplication
import com.willemvictor.vangroan.commute.view.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Victor on 2016/12/19.
 */

@Singleton
@Component(modules = arrayOf(CommuteModule::class))
interface CommuteComponent {

    fun inject(o: CommuteApplication)

    fun inject(o: MainActivity)
}