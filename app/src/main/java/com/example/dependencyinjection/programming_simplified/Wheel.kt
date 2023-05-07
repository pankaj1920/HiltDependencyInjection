package com.example.dependencyinjection.programming_simplified

import android.os.Build.VERSION_CODES.P
import com.example.dependencyinjection.utils.Print
import javax.inject.Inject

class Wheel  @Inject constructor(){

    fun getWheel(){
        Print.log("Wheel Started")
    }
}