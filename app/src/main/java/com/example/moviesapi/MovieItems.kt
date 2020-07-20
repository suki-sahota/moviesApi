package com.example.moviesapi

import com.squareup.moshi.Json

data class MovieItems(
    @Json(name = "title") val title: String,
    @Json(name = "image") val image: String,
    @Json(name = "rating") val rating: Double,
    @Json(name = "releaseYear") val releaseYear: Int,
    @Json(name = "genre") val genre: List<String>
)