package me.deepkverma.daggerdemo.di.module

import dagger.Module
import dagger.Provides
import me.deepkverma.daggerdemo.MyApplication

@Module
class ApplicationModule(private val application: MyApplication) {

    @Provides
    fun getApplicationModule(): MyApplication {
        return application
    }
}