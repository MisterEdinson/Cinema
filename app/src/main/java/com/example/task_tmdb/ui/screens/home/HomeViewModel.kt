package com.example.task_tmdb.ui.screens.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task_tmdb.app.model.ResultsItem
import com.example.task_tmdb.app.repository.Repository
import kotlinx.coroutines.launch

class HomeViewModel (private val repository: Repository):ViewModel(){
    val repo : MutableLiveData <ResultsItem> = MutableLiveData()
    fun getMovieNow(){
        viewModelScope.launch {
            val responce : ResultsItem = repository.getMovieNow()
            repo.value = responce
        }
    }
}