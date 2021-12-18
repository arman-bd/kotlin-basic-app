package com.example.basicapp.presentation.activities

import android.animation.ObjectAnimator
import android.os.Bundle
import com.example.basicapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setBaseContentView(binding.root)

        animateViews()
    }

    fun animateViews() {
        ObjectAnimator
            .ofFloat(binding.txtMain, "alpha", 0f, 1f)
            .setDuration(1000L)
            .start()
    }
}