package me.deepkverma.daggerdemo.di.component

import dagger.Component
import me.deepkverma.daggerdemo.MyApplication
import me.deepkverma.daggerdemo.data.FileHelper
import me.deepkverma.daggerdemo.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MyApplication)

    fun getFileHelper(): FileHelper
}