package com.example.movieranking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieranking.databinding.ItemMovieBinding

class MovieAdapter(var list: List<Movie>, val onClickItem: (Movie) -> Unit) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(ItemMovieBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(list[position])
        holder.binding.root.setOnClickListener {
            onClickItem(list[position])
        }
    }
}

class MovieViewHolder(val binding: ItemMovieBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        binding.titleTv.text = movie.title
        binding.cashupTv.text = movie.cashup
        binding.yearTv.text = movie.year
        Glide.with(binding.imageView)
            .load(movie.url)
            .placeholder(R.drawable.ic_launcher_background)
            .into(binding.imageView)
    }
}