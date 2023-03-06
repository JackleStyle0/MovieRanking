package com.example.movieranking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.movieranking.databinding.ActivityConstraintLayoutBinding
import com.example.movieranking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityConstraintLayoutBinding by lazy {
        ActivityConstraintLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_3)
    }
}