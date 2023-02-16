package com.example.task_tmdb.ui.screens.popular

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task_tmdb.app.repository.Repository

class PopularViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PopularViewModel(repository) as T
    }
}