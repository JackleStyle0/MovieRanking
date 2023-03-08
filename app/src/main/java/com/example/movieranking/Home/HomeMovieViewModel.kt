package com.example.movieranking.Home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieranking.data.Movie
import com.example.movieranking.data.MovieAPI
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class HomeMovieViewModel : ViewModel() {

    private val _movieListLiveData = MutableLiveData<List<Movie>>()
    val movieListLiveData: LiveData<List<Movie>> = _movieListLiveData

    fun fetchMovieList(movieAPI: MovieAPI) {
        viewModelScope.launch {
           val response = movieAPI.getMovies()
            if (response.isSuccessful) {
                val movies = response.body() ?: listOf()
                _movieListLiveData.postValue(movies)
            } else {
                _movieListLiveData.postValue(listOf())
            }
        }
    }
}