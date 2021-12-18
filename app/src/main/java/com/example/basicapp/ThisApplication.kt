package com.example.basicapp

import android.app.Application
import com.example.basicapp.ioc.appModule
import com.example.basicapp.ioc.repoModule
import com.example.basicapp.ioc.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class ThisApplication: Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: ThisApplication? = null

        fun applicationContext() : ThisApplication {
            return instance as ThisApplication
        }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            printLogger(Level.DEBUG)
            androidContext(this@ThisApplication)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }

}