package com.example.myapplication.di

import com.example.myapplication.model.Rims
import com.example.myapplication.model.Tires
import com.example.myapplication.model.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims():Rims{
        return Rims()
    }

    @Provides
    fun provideTires():Tires{
        val tires = Tires()
        tires.trigger()
        return  tires
    }

    @Provides
    fun provideWheels(tires: Tires,rims: Rims):Wheels{
        return Wheels(rims = rims,tires = tires)
    }
}