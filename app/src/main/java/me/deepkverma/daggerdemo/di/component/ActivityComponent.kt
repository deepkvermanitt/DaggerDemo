package me.deepkverma.daggerdemo.di.component

import dagger.Component
import dagger.Provides
import me.amitshekhar.dagger.learning.data.local.DatabaseService
import me.deepkverma.daggerdemo.AcitivityScope
import me.deepkverma.daggerdemo.di.module.ActivityModule
import me.deepkverma.daggerdemo.ui.main.MainActivity
import javax.inject.Singleton

@AcitivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)


}