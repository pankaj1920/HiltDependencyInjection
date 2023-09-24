import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//package com.example.dependencyinjection.programming_simplified.interface_injection
//
//import com.example.dependencyinjection.utils.Print
//import dagger.Binds
//import dagger.Module
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Inject
//import javax.inject.Singleton
//
//interface One {
//    fun getName()
//}
//
//class ImplementOne @Inject constructor(private val name :String) : One {
//    override fun getName() {
//        Print.log("Interface One $name")
//    }
//}
//
//class Main @Inject constructor(private val one: One) {
//    fun getName() {
//        one.getName()
//    }
//}
//


/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun binding(implementOne: ImplementOne): One()
}*/

/*
@Module
@InstallIn(SingletonComponent::class)
class  AppModule{

    @Provides
    @Singleton
    @FName
    fun getFName():String = "Pankaj"

     @Provides
    @Singleton
    @LName
    fun getLName():String = "Pankaj"

    @Provides
    @Singleton
    fun binding(
        @FName
        name:String
    ):One = ImplementOne(name)


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName
}*/
