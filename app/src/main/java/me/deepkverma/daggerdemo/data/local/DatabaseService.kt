package me.amitshekhar.dagger.learning.data.local

import javax.inject.Singleton

@Singleton
class DatabaseService {
    fun getData(): String {
        return "Data from Database Service"
    }
}
