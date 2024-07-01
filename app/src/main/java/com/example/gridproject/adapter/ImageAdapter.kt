package com.example.gridproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gridproject.data.ImageModel
import com.example.gridproject.data.ImageData
import com.example.gridproject.data.ImageHolder
import com.example.gridproject.databinding.RecyclerRowBinding

class ImageAdapter(private val onItemClicked:(ImageModel)->Unit):ListAdapter<ImageModel,ImageHolder>(ImageCallback()){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        val binding = GridLayout.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageHolder(binding){
            onItemClicked(getItem(it))
        }
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        holder.bind(model= getItem(position))
    }


}

