package com.example.task_tmdb.ui.screens.top

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task_tmdb.app.repository.Repository

class TopViewModelFactory(private var repository: Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TopViewModel(repository) as T
    }
}