package com.satish_dasyam.kotlinpractice

import android.util.Log

//Primary Constructor
//Note that Kotlin does not have a new keyword.
class PracticeClass constructor(name: String){

    val nameToUpperCase = name.toUpperCase();//parameters of the primary constructor can  be
                                            // used in property initializers declared in the class body:

    //Secondary constructor
    constructor(args: String, age: Int) :this(args) {

    }

    init {
        Log.d("TEST", name);//parameters of the primary constructor can be used in the initializer blocks
        //code in all initializer blocks is executed before the secondary constructor body. Even if the class has no primary constructor
    }

    class InnerClass{

    }
}