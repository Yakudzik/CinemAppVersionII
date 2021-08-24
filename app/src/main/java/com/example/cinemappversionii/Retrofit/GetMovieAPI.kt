package com.example.cinemappversionii.Retrofit

import com.example.cinemappversionii.Model.MovieGeneralModel
import com.example.cinemappversionii.Model.Result
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GetMovieAPI {

    @GET("3/movie/popular?api_key=f5dae6f798c7cb802ee19e60701ae0ed&language=en-US/")
    fun searchMovie(@Query("page") pageNumber: Int): Call<MovieGeneralModel>

    companion object {

       fun invoke(): GetMovieAPI { // настраиваем retrofit и  okHttp
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()

            return Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/") // popular?api_key=f5dae6f798c7cb802ee19e60701ae0ed&language=en-US&page=1/
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GetMovieAPI::class.java)
        }
    }
}
