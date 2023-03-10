package com.example.movieranking

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val _navigateToHome = MutableLiveData<String>()
    val navigateToHome: LiveData<String> = _navigateToHome

    fun validateUsername(username: String) {
        if (username.isNotEmpty()) {
            _navigateToHome.value = username
        }
    }
}