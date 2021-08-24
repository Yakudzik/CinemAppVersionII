package com.example.cinemappversionii.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cinemappversionii.Model.MovieGeneralModel
import com.example.cinemappversionii.Model.MovieViewModel
import com.example.cinemappversionii.Model.Result
import com.example.cinemappversionii.R
import com.squareup.picasso.Picasso

class MovieAdapter(private val movieAdapterList: ArrayList<Result>) :
    RecyclerView.Adapter<MovieAdapter.myViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.one_element, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.bindingData(movieAdapterList[position])
        holder.counter.text = (position + 1).toString()
    }

    override fun getItemCount(): Int = movieAdapterList.size

    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val counter: TextView = itemView.findViewById(R.id.postercounterID)

        fun bindingData(mvm: Result) {
            val title: TextView = itemView.findViewById(R.id.oneElementTitleID)
            val image: ImageView = itemView.findViewById(R.id.oneElementPosterID)

            title.text = mvm.title

            Picasso.get().load("https://image.tmdb.org/t/p/w500/${mvm.posterPath}")
                .into(image)
        }
    }

}
