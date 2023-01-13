package com.example.cafe_androidkotlin_tutorial.Adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cafe_androidkotlin_tutorial.DataClasses.Kafelar
import com.example.cafe_androidkotlin_tutorial.databinding.ItemCircleCafeBinding

class KafelarAdapter : ListAdapter<Kafelar, KafelarAdapter.MyViewHolder>(diffUtil) {

    class MyViewHolder(val binding: ItemCircleCafeBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Kafelar>() {
            override fun areItemsTheSame(oldItem: Kafelar, newItem: Kafelar): Boolean {
                return oldItem == newItem
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Kafelar, newItem: Kafelar): Boolean {
                return oldItem.image == newItem.image
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemCircleCafeBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val bitta = getItem(position)
        Glide.with(holder.itemView).load(bitta.image).into(holder.binding.image)
    }
}