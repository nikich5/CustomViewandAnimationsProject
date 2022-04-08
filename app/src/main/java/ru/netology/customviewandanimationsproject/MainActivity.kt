package ru.netology.customviewandanimationsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.postDelayed({
            view.data = listOf(
                400F,
                150F,
                200F,
                300F,
                600F,
                300F,
                400F,
                700F
            )
        }, 1000)

    }
}