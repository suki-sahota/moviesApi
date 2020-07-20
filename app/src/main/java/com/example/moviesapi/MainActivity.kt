package com.example.moviesapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {

    val finalAdapter: MovieAdapter by lazy { MovieAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initNetwork()
    }

    fun initView() {
        recycler_view.layoutManager = GridLayoutManager(this,2)
        recycler_view.adapter = finalAdapter // Calls constructor in lazy block
    }

    fun initNetwork() {
        val retrofit: Retrofit = // Create Retrofit object
            Retrofit.Builder()
            .baseUrl("https://api.androidhive.info")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        val movieApi: MovieApi = // Create the interface from Retrofit object
            retrofit.create(MovieApi::class.java)

        movieApi.getMeMovies().enqueue( // .enqueue for Asynchronous // .execute for Synchronous
            object : Callback<List<MovieItems>> { // Object expression to create an object of an anonymous class
                override fun onFailure( // No communication with server; no response
                    call: Call<List<MovieItems>>,
                    t: Throwable) {
                    Toast.makeText(
                        this@MainActivity,
                        "Failed to communicate with server.",
                        Toast.LENGTH_SHORT).show()
                }

                override fun onResponse( // Will receive response code from server
                    call: Call<List<MovieItems>>,
                    response: Response<List<MovieItems>>
                ) {
                    if (response.isSuccessful) { // response code is 200-299
                        response.body()?.let {
                            finalAdapter.dataSet = it as MutableList<MovieItems>
                        }
                    }
                }

            }
        )
    }
}