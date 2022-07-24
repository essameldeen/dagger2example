package com.example.myapplication.model

import android.util.Log
import com.example.myapplication.di.PerActivity
import javax.inject.Inject

const val TAG="Car"
@PerActivity
class Car @Inject constructor( private val driver:Driver,private val engine:Engine , private val wheels:Wheels) {

    @Inject
    fun connectRemote(remote: Remote){
        remote.connectToCar(this )
    }

 fun  drive(){
     engine.start()
     Log.d(TAG, "$driver name ${driver.name}  Drive $this")
 }
}