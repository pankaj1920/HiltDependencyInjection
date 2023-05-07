package com.example.dependencyinjection.cheezy_code

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
 class UserModule {

    @Provides
//    @Named("sql")
    @SqlQualifier
    fun provideSqlApiService(sqlRepositiory: SqlRepositiory):ApiService{
        return  sqlRepositiory
    }

    @Provides
//    @Named("firebase")
    @FirabaseQualifier
    fun provideFirebaseService():ApiService{
        return FirebaseRepository()
    }

/*
    @Binds
    abstract fun bindUserApiService(sqlRepositiory: SqlRepositiory):ApiService*/
}