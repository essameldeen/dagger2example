package com.example.myapplication.model


// this class third library and i cant access this constructor
class Wheels(rims: Rims, tires: Tires) {
    //we don't own this class so we can't annotate it with @Inject
    private val rims: Rims
    private val tires: Tires

    init {
        this.rims = rims
        this.tires = tires
    }
}