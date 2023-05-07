package com.example.dependencyinjection

import android.app.Application
import com.example.dependencyinjection.cheezy_code.SqlRepositiory
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class BaseApplication : Application(){
    @Inject
    lateinit var sqlRepositiory: SqlRepositiory
    override fun onCreate() {
        super.onCreate()

        sqlRepositiory.saveUser("kamal@gmail.com","123456789")

    }
}