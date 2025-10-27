package com.example.misplashscreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        var keepSplashVisible = true
        splashScreen.setKeepOnScreenCondition { keepSplashVisible }

        Handler(Looper.getMainLooper()).postDelayed({
            keepSplashVisible = false
            setContentView(R.layout.activity_main)
        }, 3000)
    }
}

