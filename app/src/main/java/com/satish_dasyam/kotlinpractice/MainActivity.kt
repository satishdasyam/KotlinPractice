package com.satish_dasyam.kotlinpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    val list = listOf("satish", "sandy", "sindhu")
    var dynamicList = ArrayList<String>()
    //val mutableCollection: MutableList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for(index in list.indices){
            Log.d("ARRAY",list[index])
        }
        dynamicList.add("hi")
        dynamicList.add("dynamic")
        dynamicList.add("list")


        /*for(index in dynamicList.iterator()){
            Log.d("ARRAY",dynamicList.)
        }*/
    }
}
