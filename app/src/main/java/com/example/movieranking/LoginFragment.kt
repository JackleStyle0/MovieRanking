package com.example.movieranking

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movieranking.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val binding: FragmentLoginBinding by lazy {
        FragmentLoginBinding.inflate(layoutInflater)
    }

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
                val intent = Intent(requireContext(), MovieDetailActivity::class.java).apply {
                    putExtra("username", username)
                }
                startActivity(intent)
            }
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}