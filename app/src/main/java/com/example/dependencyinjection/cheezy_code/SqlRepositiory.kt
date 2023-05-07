package com.example.dependencyinjection.cheezy_code

import com.example.dependencyinjection.utils.Print
import javax.inject.Inject

class SqlRepositiory @Inject constructor() :ApiService{
    override fun saveUser(email: String, password: String) {
        Print.log("User Saved in Sql Db")
    }
}

class FirebaseRepository @Inject constructor():ApiService{
    override fun saveUser(email: String, password: String) {
        Print.log("User save in firebase")
    }

}