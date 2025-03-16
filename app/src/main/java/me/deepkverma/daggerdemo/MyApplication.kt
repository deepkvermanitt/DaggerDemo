package me.deepkverma.daggerdemo

import android.app.Application
import me.deepkverma.daggerdemo.data.FileHelper
import me.deepkverma.daggerdemo.di.component.ApplicationComponent
import me.deepkverma.daggerdemo.di.component.DaggerApplicationComponent
import me.deepkverma.daggerdemo.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var fileHelper: FileHelper

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }


    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}