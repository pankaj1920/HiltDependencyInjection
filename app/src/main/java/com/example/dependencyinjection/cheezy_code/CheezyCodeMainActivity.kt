package com.example.dependencyinjection.cheezy_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class CheezyCodeMainActivity : AppCompatActivity() {
    @Inject
//    @Named("firebase")
    @FirabaseQualifier
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cheezy_code_main)

        apiService.saveUser("pankaj@gamil.com","123")
    }
}