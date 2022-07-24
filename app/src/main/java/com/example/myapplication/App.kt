package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.ActivityComponent
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.DriverModule


class App : Application() {

    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(DriverModule("Essam"))
    }

    fun getAppComponent(): AppComponent = appComponent
}