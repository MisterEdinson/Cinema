package com.example.task_tmdb.app.api

import com.example.task_tmdb.app.model.Response
import com.example.task_tmdb.app.model.details.ResponseDetails
import com.example.task_tmdb.app.utils.Constants.Companion.TOKEN
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleApi {

    @GET("now_playing?api_key=${TOKEN}&language=ru-RU&page=1")
    suspend fun getCustomMovie(): Response

    @GET("popular?api_key=${TOKEN}&language=ru-RU&page=1")
    suspend fun getPopularMovie(): Response

    @GET("top_rated?api_key=${TOKEN}&language=ru-RU&page=1")
    suspend fun getTopMovie(): Response

    @GET("upcoming?api_key=${TOKEN}&language=ru-RU&page=1")
    suspend fun getComingMovie(): Response

//    https://api.themoviedb.org/3/movie/315162?api_key=28f901f91b098a9340cb95de778fabab&language=en-US
    @GET("{idMovie}?api_key=${TOKEN}&language=ru-RU")
    suspend fun getDetailsMovie(
        @Path("idMovie") id: Int
    ): ResponseDetails
}