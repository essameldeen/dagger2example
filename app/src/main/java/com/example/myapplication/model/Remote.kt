package com.example.myapplication.model

import android.util.Log
import javax.inject.Inject


class Remote @Inject constructor(){

  fun connectToCar(car: Car){
     Log.d(TAG,"remote Connect to Car,,,,")
  }
}