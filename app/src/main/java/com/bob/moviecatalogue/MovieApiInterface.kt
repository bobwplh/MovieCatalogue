package com.bob.moviecatalogue

import com.bob.moviecatalogue.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/tv/{tv_id}/season/{season_number}/episode/{episode_number}?api_key=a1d918077d594b50fdddca5a51b7df78")
    fun getMovieList(): Call<MovieResponse>
}