package com.example.myapplication.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("power") private val hoursPower:Int,@Named("capacity") private val  engineCapacity:Int) :Engine  {

    override fun start() {
        Log.d(TAG,"Petrol Engine started with hoursPower : $hoursPower and with Engine Capacity :$engineCapacity")
    }
}