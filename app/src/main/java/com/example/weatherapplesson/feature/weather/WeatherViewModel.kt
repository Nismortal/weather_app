package com.example.weatherapplesson.feature.weather

import com.example.weatherapplesson.base.BaseViewModel
import com.example.weatherapplesson.base.Event

class WeatherViewModel: BaseViewModel<ViewState>() {
    override fun initialViewState(): ViewState {
        return ViewState(isLoading = true)
    }

    override fun reduce(event: Event, previousState: ViewState): ViewState? {
        TODO("Not yet implemented")
    }
}