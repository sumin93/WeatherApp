package com.sumin.weatherapp

import android.app.Application
import com.sumin.weatherapp.di.ApplicationComponent
import com.sumin.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}
