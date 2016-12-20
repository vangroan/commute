package com.willemvictor.vangroan.commute.dagger

import android.app.Application
import android.content.Context
import com.willemvictor.vangroan.commute.preferences.CommutePreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Victor on 2016/12/19.
 */

@Module
class CommuteModule (private val application : Application) {

    @Provides
    @Singleton
    @ForApplication
    fun provideContext() : Context {
        return application
    }

    @Provides
    @Singleton
    fun providePreferences(): CommutePreferences {
        return CommutePreferences(provideContext())
    }
}
