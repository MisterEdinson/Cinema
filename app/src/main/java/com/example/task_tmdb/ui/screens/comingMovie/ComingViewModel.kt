package com.example.task_tmdb.ui.screens.comingMovie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task_tmdb.app.model.Response
import com.example.task_tmdb.app.repository.Repository
import kotlinx.coroutines.launch

class ComingViewModel(private var repository: Repository) : ViewModel() {
    val repoCustom: MutableLiveData<Response> = MutableLiveData()

    fun getMoviewCustomModel() {
        viewModelScope.launch {
            val responce: Response = repository.getComingMovieRepo()
            repoCustom.value = responce
        }
    }
}