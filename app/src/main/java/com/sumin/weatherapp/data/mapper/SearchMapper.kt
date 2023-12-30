package com.sumin.weatherapp.data.mapper

import com.sumin.weatherapp.data.network.dto.CityDto
import com.sumin.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }
