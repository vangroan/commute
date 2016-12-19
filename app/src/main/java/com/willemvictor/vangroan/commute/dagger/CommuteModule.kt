package com.willemvictor.vangroan.commute.dagger

import com.willemvictor.vangroan.commute.preferences.CommutePreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Victor on 2016/12/19.
 */

@Module
class CommuteModule {

    @Provides
    @Singleton
    fun providePreferences(): CommutePreferences {
        return CommutePreferences()
    }
}
