package com.project.memorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.memorygame.databinding.CardItemBinding

class GameView(private val inputData: ArrayList<TextView>,
                private val context: Context): RecyclerView.Adapter<GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val adapterLayout = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GameViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentTile = inputData[position]
        holder.binding.tile.addView(currentTile)
    }

    override fun getItemCount() = inputData.size


}

class GameViewHolder(val binding: CardItemBinding): RecyclerView.ViewHolder(binding.root){

}
