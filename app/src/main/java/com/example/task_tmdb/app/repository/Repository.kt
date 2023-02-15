package com.example.task_tmdb.app.repository

import com.example.task_tmdb.app.api.RetrofitInstance
import com.example.task_tmdb.app.model.ResultsItem

class Repository {
    suspend fun getMovieNow(): ResultsItem {
        return RetrofitInstance.api.getMovieNow()
    }
}