
package com.example.spotifyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Music(val title: String, val imageRes: Int)

class MusicAdapter(private val musicList: List<Music>) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.title.text = music.title
        holder.image.setImageResource(music.imageRes)
    }

    override fun getItemCount(): Int = musicList.size

    class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.musicTitle)
        val image: ImageView = itemView.findViewById(R.id.musicImage)
    }
}
