package com.example.cinemappversionii.Model


import com.google.gson.annotations.SerializedName

data class MovieGeneralModel(
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)