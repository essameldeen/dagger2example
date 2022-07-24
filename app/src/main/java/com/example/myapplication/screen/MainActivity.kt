package com.example.myapplication.screen

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.App
import com.example.myapplication.R
import com.example.myapplication.di.ActivityComponent
import com.example.myapplication.di.DieselEngineModule
import com.example.myapplication.model.Car

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // another solution to inject car instance to mainActivity
    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // when use example of diesel Module
//        val activityComponent: ActivityComponent =
//            (application as App).getAppComponent().getActivityComponent(
//                DieselEngineModule(160)
//    )

        // when use SubComponent Builder
//        val activityComponent: ActivityComponent =
//            (application as App).getAppComponent().getActivityComponentBuilder()
//                .hoursPower(120)
//                .engineCapacity(1600)
//                .build()

        val activityComponent: ActivityComponent =
            (application as App).getAppComponent().getActivityComponentFactory()
                .create(120,1600)




        activityComponent.inject(this@MainActivity)

        // solution for get car in mainActivity
        //car = carComponent.getCar()
        car.drive()
        car2.drive()
    }
}