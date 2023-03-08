package com.example.movieranking.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val title: String,
    val year: String,
    val cashup: String,
    val detail: String,
    val url: String,
    val rank: Int
): Parcelable
