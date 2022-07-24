package com.example.myapplication.model

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val hoursPower:Int) :Engine  {

    override fun start() {
       Log.d(TAG,"Diesel engine started hoursPower : $hoursPower")
    }
}