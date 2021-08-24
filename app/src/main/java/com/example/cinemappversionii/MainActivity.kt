package com.example.cinemappversionii

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cinemappversionii.Model.MovieViewModel
import com.example.cinemappversionii.Retrofit.Myresponce
import com.example.cinemappversionii.recycler.MovieAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
  //  var mList = MovieViewModel()
      var response = Myresponce()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        response.getData(this,this)

//        findViewById<RecyclerView>(R.id.recyclerViewID).adapter = adapter
//        findViewById<RecyclerView>(R.id.recyclerViewID).layoutManager = LinearLayoutManager(this)
//        findViewById<RecyclerView>(R.id.recyclerViewID).setHasFixedSize(false)

    }
}