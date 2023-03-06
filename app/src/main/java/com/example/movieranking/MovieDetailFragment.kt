package com.example.movieranking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieranking.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment() {

    private val binding: FragmentMovieDetailBinding by lazy {
        FragmentMovieDetailBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val username = arguments?.getString("username", "")
        binding.usernameTv.text = "Hello $username"
    }

    companion object {

        @JvmStatic
        fun newInstance(username: String) =
            MovieDetailFragment().apply {
                arguments = Bundle().apply {
                    putString("username", username)
                }
            }
    }
}