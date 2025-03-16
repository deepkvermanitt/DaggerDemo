package me.deepkverma.daggerdemo.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import me.amitshekhar.dagger.learning.data.local.DatabaseService

@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    fun provideActivityModule(): Activity {
        return activity
    }
    @Provides
    fun getDataBaseService(): DatabaseService {
        return DatabaseService()
    }
}