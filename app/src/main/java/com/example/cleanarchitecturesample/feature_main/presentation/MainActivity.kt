package com.example.cleanarchitecturesample.feature_main.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.cleanarchitecturesample.ui.theme.CleanArchitectureSampleAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureSampleAppTheme {

            }
        }
    }
}