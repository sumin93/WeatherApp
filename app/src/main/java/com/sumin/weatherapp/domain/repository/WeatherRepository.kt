package com.sumin.weatherapp.domain.repository

import com.sumin.weatherapp.domain.entity.Forecast
import com.sumin.weatherapp.domain.entity.Weather

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}
