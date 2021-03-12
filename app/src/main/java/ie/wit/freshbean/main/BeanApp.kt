package ie.wit.freshbean.main

import android.app.Application
import android.util.Log
import ie.wit.freshbean.models.BeanMemStore
import ie.wit.freshbean.models.BeanStore

class BeanApp : Application() {

    lateinit var beansStore: BeanStore

    override fun onCreate() {
        super.onCreate()
        beansStore = BeanMemStore()
        Log.v("Purchase","Beans App started")
    }
}