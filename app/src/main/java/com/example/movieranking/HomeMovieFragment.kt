package com.example.movieranking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieranking.databinding.FragmentHomeMovieBinding

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
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeMovieFragment()
    }
}