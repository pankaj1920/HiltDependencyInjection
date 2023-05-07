package com.example.dependencyinjection.programming_simplified

import com.example.dependencyinjection.utils.Print
import javax.inject.Inject

class Engine @Inject constructor() {

    fun getEngine() {
        Print.log("Engine Started")
    }
}