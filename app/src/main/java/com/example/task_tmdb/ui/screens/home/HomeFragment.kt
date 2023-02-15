package com.example.task_tmdb.ui.screens.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.task_tmdb.R
import com.example.task_tmdb.app.repository.Repository

class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val repo = Repository()
        val viewModelFactory = HomeViewModelFactory(repo)
        viewModel = ViewModelProvider(this,viewModelFactory).get(HomeViewModel::class.java)
        viewModel.getMovieNow()
        viewModel.repo.observe(viewLifecycleOwner, Observer { responce ->
            Log.d("Responce", responce.title.toString())
            Log.d("Responce", responce.originalLanguage.toString())
        })
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}