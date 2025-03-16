package me.deepkverma.daggerdemo.ui.main

import me.amitshekhar.dagger.learning.data.local.DatabaseService
import me.deepkverma.daggerdemo.AcitivityScope
import me.deepkverma.daggerdemo.data.FileHelper
import javax.inject.Inject

@AcitivityScope
class MainViewModel @Inject constructor(
private val fileHelper: FileHelper
) {

    fun getSomeDate(): String {
        return "Data from mainViewModel"
    }
}