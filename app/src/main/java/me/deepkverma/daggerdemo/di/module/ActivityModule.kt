package me.deepkverma.daggerdemo.di.module

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    fun provideActivityModule(): Activity {
        return activity
    }
}