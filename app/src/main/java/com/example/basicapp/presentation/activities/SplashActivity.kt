package com.example.basicapp.presentation.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.basicapp.databinding.ActivitySplashBinding
import java.util.*
import java.util.Timer
import kotlin.concurrent.schedule

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding
    private var context: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timer("startMain", false).schedule(2500) {
            startActivity(Intent(context, MainActivity::class.java))
            overridePendingTransition(0, 0)
            finish()
        }

    }

}