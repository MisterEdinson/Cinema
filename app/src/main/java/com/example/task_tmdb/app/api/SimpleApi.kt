package com.example.task_tmdb.app.api

import com.example.task_tmdb.app.model.Response
import com.example.task_tmdb.app.utils.Constants.Companion.TOKEN
import retrofit2.http.GET

interface SimpleApi {

    @GET("now_playing?api_key=${TOKEN}&page=1")
    suspend fun getCustomMovie(): Response

    @GET("popular?api_key=${TOKEN}&page=1")
    suspend fun getPopularMovie(): Response

    @GET("top_rated?api_key=${TOKEN}&page=1")
    suspend fun getTopMovie(): Response

    @GET("upcoming?api_key=${TOKEN}&page=1")
    suspend fun getComingMovie(): Response
}