package com.example.myapplication.di

import com.example.myapplication.model.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    // fun getActivityComponent(dieselEngineModule: DieselEngineModule ):ActivityComponent

    // when use SubComponentBuilder
    //fun getActivityComponentBuilder( ):ActivityComponent.Builder

    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {

        fun create(driverModule: DriverModule): AppComponent
    }

}