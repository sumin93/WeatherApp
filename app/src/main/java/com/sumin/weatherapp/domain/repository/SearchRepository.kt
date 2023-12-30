package com.sumin.weatherapp.domain.repository

import com.sumin.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}
