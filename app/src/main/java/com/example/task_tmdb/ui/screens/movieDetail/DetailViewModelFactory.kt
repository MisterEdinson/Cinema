package com.example.task_tmdb.ui.screens.movieDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task_tmdb.app.repository.Repository
import com.example.task_tmdb.ui.screens.home.HomeViewModel

class DetailViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailsViewModel(repository) as T
    }
}