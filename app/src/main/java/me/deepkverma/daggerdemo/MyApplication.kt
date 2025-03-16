package me.deepkverma.daggerdemo

import android.app.Application
import me.deepkverma.daggerdemo.di.component.ApplicationComponent
import me.deepkverma.daggerdemo.di.component.DaggerApplicationComponent
import me.deepkverma.daggerdemo.di.module.ApplicationModule

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
    }



    private fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}