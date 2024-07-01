package com.example.gridproject.data

import android.media.Image
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

class ImageHolder (
    private val binding: ViewBinding,
    private val onItemClick:(Int)->Unit

):RecyclerView.ViewHolder(binding.root){
    fun bind(model: ImageModel){
        with(binding){

            itemView.setOnClickListener{
                onItemClick(adapterPosition)
            }
        }
    }
}