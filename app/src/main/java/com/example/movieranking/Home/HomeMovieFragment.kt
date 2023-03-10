package com.example.movieranking.Home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.movieranking.MovieAdapter
import com.example.movieranking.R
import com.example.movieranking.data.MovieFactoryAPI
import com.example.movieranking.databinding.FragmentHomeMovieBinding
import kotlinx.coroutines.Dispatchers
import okhttp3.internal.notifyAll

class HomeMovieFragment : Fragment() {

    private val binding: FragmentHomeMovieBinding by lazy {
        FragmentHomeMovieBinding.inflate(layoutInflater)
    }

    private val viewModel: HomeMovieViewModel by viewModels()
    private val adapter: MovieAdapter by lazy {
        MovieAdapter(listOf()) {
            val bundle = bundleOf(
                "movie" to it,
                "username" to arguments?.getString("username", "")
            )
            findNavController().navigate(R.id.action_homeMovieFragment_to_movieDetailFragment, bundle)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val username = arguments?.getString("username", "")
        binding.usernameTv.text = "Hello $username"
        binding.recyclerView.adapter = adapter
        viewModel.movieListLiveData.observe(viewLifecycleOwner) {
            adapter.list = it
            adapter.notifyDataSetChanged()
        }

        viewModel.fetchMovieList(MovieFactoryAPI.createAPI())
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeMovieFragment()
    }
}