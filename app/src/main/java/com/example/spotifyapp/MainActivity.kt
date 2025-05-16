
package com.example.spotifyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = MusicAdapter(getMusicList())
    }

    private fun getMusicList(): List<Music> {
        return listOf(
            Music("Top Hits", R.drawable.top_hits),
            Music("Daily Mix", R.drawable.daily_mix),
            Music("Chill Vibes", R.drawable.chill_vibes),
            Music("Focus", R.drawable.focus),
            Music("Workout", R.drawable.workout),
            Music("Party", R.drawable.party)
        )
    }
}
