package com.sumin.weatherapp.domain.usecase

import com.sumin.weatherapp.domain.repository.FavouriteRepository
import javax.inject.Inject

class ObserveFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {

    operator fun invoke(cityId: Int) = repository.observeIsFavourite(cityId)
}
