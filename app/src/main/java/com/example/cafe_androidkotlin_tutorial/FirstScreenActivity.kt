package com.example.cafe_androidkotlin_tutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.cafe_androidkotlin_tutorial.databinding.ActivityFirstScreenBinding

class FirstScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstScreenBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.container)
        binding.bottomNav.setupWithNavController(navController)


    }
}