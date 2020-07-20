package com.example.moviesapi

import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
        // Base Url https://api.androidhive.info
        // End Point /json/movies.json
    @GET("/json/movies.json")
    fun getMeMovies(): Call<List<MovieItems>> // Exposes Asynchronous execution
}