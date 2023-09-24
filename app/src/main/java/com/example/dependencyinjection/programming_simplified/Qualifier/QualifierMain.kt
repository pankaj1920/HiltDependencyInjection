package com.example.dependencyinjection.programming_simplified.Qualifier

import android.util.Log
import com.example.dependencyinjection.utils.Print
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class QualifierMain @Inject constructor(
  @FName
  private val fName: String,
  @Lname
     private val lName: String
) {
    fun getName() {
        Print.log("My name is $fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class QualifierModule() {
    @Provides
    @FName
    fun getFirstName(): String = "Pankaj"

    @Provides
    @LName
    fun getLastName(): String = "LastName"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName
