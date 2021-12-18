package com.example.basicapp.presentation.activities

import android.os.Bundle
import com.example.basicapp.databinding.ActivitySplashBinding
import com.example.basicapp.presentation.activities.BaseActivity

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}