package com.example.task_tmdb.ui.adapters

import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.task_tmdb.R
import com.example.task_tmdb.app.model.ResultsItem
import com.example.task_tmdb.app.utils.Constants.Companion.API_IMG_500
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_movie.view.*


class MovieRecyclerAdapter: RecyclerView.Adapter<MovieRecyclerAdapter.ItemHolder>(){

    private var listMovie = emptyList<ResultsItem>()

    class ItemHolder(view: View): RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        return ItemHolder(view)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val article = listMovie[position]
        holder.itemView.apply {
            Glide.with(this).load(API_IMG_500+article.posterPath).into(imgRv)

            val textId = article.id
            val bundle = Bundle()
            imgRv.setOnClickListener{
                textId?.let { it1 -> bundle.putInt("id", it1) }
                findNavController().navigate(R.id.movieDetailFragment,bundle)
            }
        }
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    fun setList(list: List<ResultsItem>){
        listMovie = list
        notifyDataSetChanged()
    }


}

