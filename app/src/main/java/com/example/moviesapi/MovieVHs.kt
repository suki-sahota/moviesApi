package com.example.moviesapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movies_item_one_layout.view.*
import kotlinx.android.synthetic.main.movies_item_three_layout.view.*
import kotlinx.android.synthetic.main.movies_item_two_layout.view.*

class MovieVHOne(itemOne: View):
    RecyclerView.ViewHolder(itemOne) {

    val tvOneTitle = itemOne.tv_view_one_title
    val ivOne = itemOne.iv_view_one
    val tvOneRating = itemOne.tv_view_one_rating
    val rbOne = itemOne.ratingBar1
    val tvOneYear = itemOne.tv_view_one_year
    val tvOneGenre = itemOne.tv_view_one_genre

    fun onBind(movieItem: MovieItems) {
        tvOneTitle.text = movieItem.title
        Picasso.get().load(movieItem.image).into(ivOne)
        tvOneRating.text = movieItem.rating.toString()
        rbOne.progress = movieItem.rating.toInt()
        tvOneYear.text = movieItem.releaseYear.toString()
        tvOneGenre.text = movieItem.genre.joinToString()
    }
}

class MovieVHTwo(itemTwo: View):
    RecyclerView.ViewHolder(itemTwo) {

    val tvTwoTitle = itemTwo.tv_view_two_title
    val ivTwo = itemTwo.iv_view_two
    val tvTwoRating = itemTwo.tv_view_two_rating
    val rbTwo = itemTwo.ratingBar2
    val tvTwoYear = itemTwo.tv_view_two_year
    val tvTwoGenre = itemTwo.tv_view_two_genre

    fun onBind(movieItem: MovieItems) {
        tvTwoTitle.text = movieItem.title
        Picasso.get().load(movieItem.image).into(ivTwo)
        tvTwoRating.text = movieItem.rating.toString()
        rbTwo.progress = movieItem.rating.toInt()
        tvTwoYear.text = movieItem.releaseYear.toString()
        tvTwoGenre.text = movieItem.genre.joinToString()
    }
}

class MovieVHThree(itemThree: View):
    RecyclerView.ViewHolder(itemThree) {

    val tvThreeTitle = itemThree.tv_view_three_title
    val ivThree = itemThree.iv_view_three
    val tvThreeRating = itemThree.tv_view_three_rating
    val rbThree = itemThree.ratingBar3
    val tvThreeYear = itemThree.tv_view_three_year
    val tvThreeGenre = itemThree.tv_view_three_genre

    fun onBind(movieItem: MovieItems) {
        tvThreeTitle.text = movieItem.title
        Picasso.get().load(movieItem.image).into(ivThree)
        tvThreeRating.text = movieItem.rating.toString()
        rbThree.progress = movieItem.rating.toInt()
        tvThreeYear.text = movieItem.releaseYear.toString()
        tvThreeGenre.text = movieItem.genre.joinToString()
    }
}