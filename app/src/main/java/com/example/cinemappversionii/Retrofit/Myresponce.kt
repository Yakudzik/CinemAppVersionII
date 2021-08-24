package com.example.cinemappversionii.Retrofit

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.*
import androidx.recyclerview.widget.RecyclerView
import com.example.cinemappversionii.MainActivity
import com.example.cinemappversionii.Model.MovieGeneralModel
import com.example.cinemappversionii.Model.Result
import com.example.cinemappversionii.R
import com.example.cinemappversionii.recycler.MovieAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Myresponce() {

    fun getData(activity: MainActivity, mycontext: Context) {

        GetMovieAPI.invoke().searchMovie(1).enqueue(object : Callback<MovieGeneralModel?> {
            override fun onResponse(
                call: Call<MovieGeneralModel?>,
                response: Response<MovieGeneralModel?>
            ) {
                if (response.isSuccessful) {

                    val result = response.body()?.results
                    result.let {
                        val adapter = MovieAdapter(result as ArrayList<Result>)
                        val recycler = activity.findViewById<RecyclerView>(R.id.recyclerViewID)
                        recycler?.layoutManager = LinearLayoutManager(mycontext)
                        recycler?.adapter = adapter
                    }
                }
            }

            override fun onFailure(call: Call<MovieGeneralModel?>, t: Throwable) {
                Log.e("Error api", "Error Error RETROFIT Error Error")
            }
        })
    }

    fun getDataTest() {

        GetMovieAPI.invoke().searchMovie(1).enqueue(object : Callback<MovieGeneralModel?> {
            override fun onResponse(
                call: Call<MovieGeneralModel?>,
                response: Response<MovieGeneralModel?>
            ) {
                if (response.isSuccessful) {

                }
            }

            override fun onFailure(call: Call<MovieGeneralModel?>, t: Throwable) {
                Log.e("Error api", "Error Error RETROFIT Error Error")
            }
        })
    }
}


/*
 var modelka =MovieViewModel()
                        modelka.title = response.body()!!.results[x].originalTitle
                        modelka.originaLanguage = response.body()!!.results[x].originalLanguage
                        modelka.posterPath = response.body()!!.results[x].posterPath
                        modelka.reliseDate = response.body()!!.results[x].releaseDate

                        modelOrigin.putMovie2List(modelka)
                        Log.i("response API1", modelOrigin.getMovieList()[x].title)
                        Log.i("response API2", modelOrigin.getMovieList()[x].reliseDate)
                        Log.i("response API3", modelOrigin.getMovieList()[x].originaLanguage)
* */