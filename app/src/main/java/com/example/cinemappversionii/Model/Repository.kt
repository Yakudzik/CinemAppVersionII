package com.example.cinemappversionii.Model

import com.example.cinemappversionii.Retrofit.GetMovieAPI
import retrofit2.Retrofit

class Repository constructor( private val getMovieAPI: GetMovieAPI) {

    fun getData() = getMovieAPI.searchMovie(1)
}