package com.example.animalpedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.animalpedia.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navigation_host_mammals) as NavHostFragment
        navView.setupWithNavController(navHostFragment.navController)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_mammals,
                R.id.navigation_reptile,
                R.id.navigation_pisces,
                R.id.navigation_aves
            )
        )
        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)
    }
}