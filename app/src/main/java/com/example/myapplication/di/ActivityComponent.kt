package com.example.myapplication.di

import com.example.myapplication.screen.MainActivity
import com.example.myapplication.model.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named


@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

//
//    @Subcomponent.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun hoursPower(@Named("power") hoursPower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacity(@Named("capacity") engineCapacity: Int): Builder
//
//
//        fun build(): ActivityComponent
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("power") hoursPower: Int,
            @BindsInstance @Named("capacity") engineCapacity: Int,

            ): ActivityComponent
    }

}