package com.example.task_tmdb.app.repository

import com.example.task_tmdb.app.api.RetrofitInstance
import com.example.task_tmdb.app.model.Response
import com.example.task_tmdb.app.model.details.ResponseDetails

class Repository {
    suspend fun getCustomMovieRepo(): Response {
        return RetrofitInstance.api.getCustomMovie()
    }

    suspend fun getPopularMovieRepo(): Response {
        return RetrofitInstance.api.getPopularMovie()
    }

    suspend fun getTopMovieRepo(): Response {
        return RetrofitInstance.api.getTopMovie()
    }

    suspend fun getComingMovieRepo(): Response {
        return RetrofitInstance.api.getComingMovie()
    }
    suspend fun getDetailsMovieRepo(id:Int): ResponseDetails {
        return RetrofitInstance.api.getDetailsMovie(id)
    }


}