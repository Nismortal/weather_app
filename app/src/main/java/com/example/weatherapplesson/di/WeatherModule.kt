package com.example.weatherapplesson.di

import com.example.weatherapplesson.feature.weather.WeatherViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val weatherModule = module {
    viewModel {
        WeatherViewModel()
    }
}