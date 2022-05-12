package com.example.weatherapplesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapplesson.feature.weather.WeatherFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, WeatherFragment()).commit()
    }
}