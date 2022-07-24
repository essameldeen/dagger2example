package com.example.myapplication.di

import com.example.myapplication.model.DieselEngine
import com.example.myapplication.model.Engine
import com.example.myapplication.model.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule (private val  hoursPower:Int) {


    @Provides
    fun provideHoursPower():Int{
        return hoursPower
    }
    @Provides
     fun  bindEngine(dieselEngine: DieselEngine ):Engine{
         return  dieselEngine
     }
}