package com.example.basicapp.presentation.activities

import android.os.Bundle
import com.example.basicapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBaseContentView(binding.root)
    }
}