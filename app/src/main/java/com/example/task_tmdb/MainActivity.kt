package com.example.task_tmdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navConctroller = findNavController(R.id.fragmentActiv)

        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.popularFragment,
            R.id.topMovieFragment,
            R.id.comingFragment
        ))

        setupActionBarWithNavController(navConctroller,appBarConfiguration)
        bottomNavigation.setupWithNavController(navConctroller)
    }
}