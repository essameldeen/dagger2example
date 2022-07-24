package com.example.myapplication.di

import com.example.myapplication.model.Engine
import com.example.myapplication.model.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule (private val  hoursPower:Int) {

    @Binds
    abstract fun  bindEngine(petrolEngine: PetrolEngine):Engine


}