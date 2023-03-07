package com.example.movieranking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieranking.databinding.FragmentHomeMovieBinding

class HomeMovieFragment : Fragment() {

    private val binding: FragmentHomeMovieBinding by lazy {
        FragmentHomeMovieBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = MovieAdapter(
            listOf(
                Movie(
                    "Avatar",
                    "2009",
                    "$2,923,706,026",
                    "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                    "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                    "1"
                ),
                Movie(
                    "Avatar2",
                    "2009",
                    "$2,923,706,026",
                    "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                    "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                    "2"
                ),
                Movie(
                    "Avatar3",
                    "2009",
                    "$2,923,706,026",
                    "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                    "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                    "3"
                ),
                Movie(
                    "Avatar4",
                    "2009",
                    "$2,923,706,026",
                    "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                    "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
                    "4"
                )
            )
        ) {
            val bundle = bundleOf(
                "movie" to it
            )
            findNavController().navigate(R.id.action_homeMovieFragment_to_movieDetailFragment, bundle)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeMovieFragment()
    }
}