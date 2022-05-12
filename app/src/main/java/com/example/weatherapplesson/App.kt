package com.example.weatherapplesson

import android.app.Application
import com.example.weatherapplesson.di.weatherModule
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            modules(weatherModule)
        }
    }
}