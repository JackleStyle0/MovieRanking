package com.example.movieranking

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.movieranking.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val binding: FragmentLoginBinding by lazy {
        FragmentLoginBinding.inflate(layoutInflater)
    }

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val username = binding.usernameTextField.text.toString()
            if (username.isNotEmpty()) {
                viewModel.validateUsername(username)
            }
        }

        viewModel.navigateToHome.observe(viewLifecycleOwner) {
            val bundle = bundleOf("username" to it)
            findNavController().navigate(R.id.action_loginFragment_to_homeMovieFragment, bundle)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}