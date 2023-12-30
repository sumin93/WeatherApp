package com.sumin.weatherapp.data.repository

import com.sumin.weatherapp.data.mapper.toEntities
import com.sumin.weatherapp.data.network.api.ApiService
import com.sumin.weatherapp.domain.entity.City
import com.sumin.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}
