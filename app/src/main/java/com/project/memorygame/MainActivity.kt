package com.project.memorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.memorygame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.game_layout, GameFragment.newInstance())
            .commit()
    }
}