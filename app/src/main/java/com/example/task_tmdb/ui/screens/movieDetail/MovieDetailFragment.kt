package com.example.task_tmdb.ui.screens.movieDetail


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.task_tmdb.R
import com.example.task_tmdb.app.model.ResultsItem
import com.example.task_tmdb.app.repository.Repository
import com.example.task_tmdb.app.utils.Constants
import com.example.task_tmdb.ui.screens.home.HomeViewModel
import com.example.task_tmdb.ui.screens.home.HomeViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie_detail.*
import kotlinx.android.synthetic.main.item_movie.view.*


class MovieDetailFragment : Fragment() {

    private lateinit var viewModel: DetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movie_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt("id") ?: 333333
//        tvDetailsTitle.text = id.toString()

        val repository = Repository()
        val viewModelFactory = DetailViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)[DetailsViewModel::class.java]

        viewModel.getMoviewDetailsModel(id)
        viewModel.repoDetails.observe(viewLifecycleOwner) { response ->
            Glide.with(this).load(Constants.API_IMG_500 +response.posterPath).into(imgDetailPoster)
            Glide.with(this).load(Constants.API_IMG_500 +response.backdropPath).into(imgDetailsBack)
            tvDetailsTitle.text = response.title
            tvDetailsDesc.text = response.overview
            tvDetailsReuting.text = response.voteAverage.toString()
            tvDetailsLanguage.text = response.originalLanguage
            tvDetailsRelease.text = response.releaseDate
            tvDetailsDuration.text = "${response.runtime}m"

//            tvDetailsChildren.text = "${response.genres?.get(1)?.id}+"

        }
    }
}