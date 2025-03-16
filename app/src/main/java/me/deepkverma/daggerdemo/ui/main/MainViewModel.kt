package me.deepkverma.daggerdemo.ui.main

import me.amitshekhar.dagger.learning.data.local.DatabaseService
import me.deepkverma.daggerdemo.AcitivityScope
import me.deepkverma.daggerdemo.data.FileHelper
import javax.inject.Inject

@AcitivityScope
class MainViewModel @Inject constructor(
    private val fileHelper: FileHelper, private val dataBaseService: DatabaseService
) {

    fun getSomeDate(): String {
        return "${fileHelper.getFilePath()} & Data from mainViewModel  & ${dataBaseService.getData()}"
    }
}