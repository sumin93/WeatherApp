package com.sumin.weatherapp.data.network.api

import com.sumin.weatherapp.data.network.dto.CityDto
import com.sumin.weatherapp.data.network.dto.WeatherCurrentDto
import com.sumin.weatherapp.data.network.dto.WeatherForecastDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("current.json?key=")
    suspend fun loadCurrentWeather(
        @Query("q") query: String
    ): WeatherCurrentDto

    @GET("forecast.json?key=")
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") daysCount: Int = 4
    ): WeatherForecastDto

    @GET("search.json?key=")
    suspend fun searchCity(
        @Query("q") query: String
    ): List<CityDto>
}
