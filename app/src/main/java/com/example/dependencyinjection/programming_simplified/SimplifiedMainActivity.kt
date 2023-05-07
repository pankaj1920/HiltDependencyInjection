package com.example.dependencyinjection.programming_simplified

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjection.R
import com.example.dependencyinjection.programming_simplified.Qualifier.QualifierMain
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Qualifier

@AndroidEntryPoint
class SimplifiedMainActivity : AppCompatActivity() {
    @Inject
    lateinit var car:Car

/*    @Inject
    lateinit var qulafierMain: QualifierMain*/

   /* @Inject
    lateinit var main: Main*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simplified_main)

        car.getCar()

//        main.getName()

//        qulafierMain.getName()
    }
}