package com.example.task_tmdb.ui.screens.movieDetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task_tmdb.app.model.Response
import com.example.task_tmdb.app.model.details.ResponseDetails
import com.example.task_tmdb.app.repository.Repository
import kotlinx.coroutines.launch

class DetailsViewModel(private val repository: Repository):ViewModel() {

    val repoDetails: MutableLiveData<ResponseDetails> = MutableLiveData()

    fun getMoviewDetailsModel(id:Int) {
        viewModelScope.launch {
            val responce: ResponseDetails = repository.getDetailsMovieRepo(id)
            repoDetails.value = responce
        }
    }
}