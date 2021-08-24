package com.example.cinemappversionii.Model

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.cinemappversionii.Retrofit.GetMovieAPI
import com.example.cinemappversionii.Retrofit.Myresponce
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel : ViewModel() {
    lateinit var title: String
    lateinit var genre: String
    lateinit var originaLanguage: String
    lateinit var posterPath: String
    lateinit var reliseDate: String
    lateinit var video: String
    lateinit var videoPath: String
   private var movieArrayList = ArrayList<MovieViewModel>()


    //    fun setMovie(
//        title: String,
//        //genre: String,
//        language: String,
//        poster: String,
//        date: String,
//        //     video: String
//    ) {
//        this.title = title
//        //  this.genre = genre
//        this.originaLanguage = language
//        this.posterPath = poster
//        this.reliseDate = date
//        //  this.videoPath = video
//    }
//
    fun putMovie2List(movie: MovieViewModel) {
        movieArrayList.add(movie)
   //     Log.i("movie array size", movieArrayList.size.toString())
    }

    fun getMovieList(): ArrayList<MovieViewModel> {
//        var siz = movieArrayList.size.toInt()
//      Log.i("movie array size", movieArrayList[siz-1].title)
        return movieArrayList
    }
}


