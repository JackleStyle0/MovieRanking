package com.example.movieranking.data

import retrofit2.Response
import retrofit2.http.GET

interface MovieAPI {

    @GET("movies")
    suspend fun getMovies(): Response<List<Movie>>

}