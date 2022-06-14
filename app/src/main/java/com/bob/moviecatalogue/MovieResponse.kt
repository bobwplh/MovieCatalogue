package com.bob.moviecatalogue

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

class MovieResponse(val movies: List<Movie>) {


    @Parcelize
    data class MovieResponse(
        @SerializedName("results")
        val movies: List<Movie>

    ) : Parcelable {
        constructor() : this(mutableListOf())
    }

}