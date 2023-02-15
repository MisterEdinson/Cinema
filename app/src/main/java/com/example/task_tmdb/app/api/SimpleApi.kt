package com.example.task_tmdb.app.api

import com.example.task_tmdb.app.model.ResultsItem
import com.example.task_tmdb.app.utils.Constants.Companion.TOKEN
import retrofit2.http.GET

interface SimpleApi {
    @GET("now_playing?api_key=${TOKEN}&page=1")
    suspend fun getMovieNow(): ResultsItem
}