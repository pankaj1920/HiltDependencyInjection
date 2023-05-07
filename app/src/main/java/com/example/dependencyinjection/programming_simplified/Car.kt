package com.example.dependencyinjection.programming_simplified

import com.example.dependencyinjection.utils.Print
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheel: Wheel) {

    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Print.log("Car is running")
    }
}