package com.sumin.weatherapp.domain.entity

data class Forecast(
    val currentWeather: Weather,
    val upcoming: List<Weather>
)
