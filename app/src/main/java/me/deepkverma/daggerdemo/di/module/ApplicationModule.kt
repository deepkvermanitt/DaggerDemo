package me.deepkverma.daggerdemo.di.module

import dagger.Module
import dagger.Provides
import me.amitshekhar.dagger.learning.data.local.DatabaseService
import me.deepkverma.daggerdemo.MyApplication
import me.deepkverma.daggerdemo.data.FileHelper
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @Provides
    fun getApplicationModule(): MyApplication {
        return application
    }

    @Provides
    @Singleton
    fun getFileHelper(): FileHelper {
        return FileHelper()
    }

}