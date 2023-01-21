package com.example.cafe_androidkotlin_tutorial.fragment.importantFiles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cafe_androidkotlin_tutorial.Adapters.KafelarAdapter
import com.example.cafe_androidkotlin_tutorial.DataClasses.Kafelar
import com.example.cafe_androidkotlin_tutorial.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var adapter: KafelarAdapter

    val kafelar = arrayListOf<Kafelar>(
        Kafelar("https://www.google.com/url?sa=i&url=https%3A%2F%2Ftgstat.com%2Fchannel%2F%40cafe_anor&psig=AOvVaw1MsVk2jTMf0A5bzBB3Rhl6&ust=1673706379417000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCND51aTgxPwCFQAAAAAdAAAAABAF"),
        Kafelar("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.facebook.com%2Fzaytunrestaurant%2F&psig=AOvVaw16KJE58A5DsEM5jDMsYE7c&ust=1673706722238000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCJDr0MfhxPwCFQAAAAAdAAAAABAK"),
        Kafelar("https://www.google.com/url?sa=i&url=http%3A%2F%2Fedencafekosher.com%2F&psig=AOvVaw3nGNUjN7RXqby3K5CNAo9q&ust=1673706925995000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCKiU66jixPwCFQAAAAAdAAAAABAK"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        adapter = KafelarAdapter()
        adapter.submitList(kafelar)
        binding.recyclerView.adapter = adapter


        binding.searchView.setActivated(true)
        binding.searchView.setQueryHint("Ovqatni qidirish")
        binding.searchView.onActionViewExpanded()
        binding.searchView.setIconified(false)
        binding.searchView.clearFocus()

    }
}