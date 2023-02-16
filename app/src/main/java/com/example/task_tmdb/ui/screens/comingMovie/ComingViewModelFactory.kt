package com.example.task_tmdb.ui.screens.comingMovie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task_tmdb.app.repository.Repository

class ComingViewModelFactory(private var repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ComingViewModel(repository) as T
    }
}