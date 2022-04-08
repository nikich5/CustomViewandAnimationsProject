package ru.netology.customviewandanimationsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<StatsView>(R.id.stats).data = listOf(
            150F,
            25F,
            250F,
            100F,
            50F,
            80F,
            400F,
        )
    }
}