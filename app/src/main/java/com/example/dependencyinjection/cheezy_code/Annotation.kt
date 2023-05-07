package com.example.dependencyinjection.cheezy_code

import androidx.annotation.DoNotInline
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class FirabaseQualifier()

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class SqlQualifier()