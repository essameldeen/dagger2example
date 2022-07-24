package com.example.myapplication.di

import com.example.myapplication.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DriverModule (private val name:String){

    @Singleton
    @Provides
    fun provideDriver(): Driver = Driver(name)
}