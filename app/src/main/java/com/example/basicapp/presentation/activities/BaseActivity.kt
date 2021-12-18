package com.example.basicapp.presentation.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.basicapp.databinding.ActivityBaseBinding

open class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun setBaseContentView(view: View) {
        binding.rootLayout.removeAllViews();
        binding.rootLayout.addView(view);
    }

}