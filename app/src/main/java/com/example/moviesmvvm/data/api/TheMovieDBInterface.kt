package com.example.moviesmvvm.data.api

import com.example.moviesmvvm.data.vo.MovieDetails
import com.example.moviesmvvm.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

     // https://api.themoviedb.org/3/movie/popular?api_key=cf1603afe5094fdc99639b9da4d92945&page=1
     // https://api.themoviedb.org/3/movie/29953?api_key=cf1603afe5094fdc99639b9da4d92945
    // https://api.themoviedb.org/3

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int):Single<MovieDetails>
}