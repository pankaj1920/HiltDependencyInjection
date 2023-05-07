package com.example.dependencyinjection.cheezy_code

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){

    fun log(message:String){
        Log.d("log",message)
    }
}