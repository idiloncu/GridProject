package com.example.gridproject.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.gridproject.data.ImageModel

class ImageCallback:DiffUtil.ItemCallback<ImageModel>() {
    override fun areItemsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: ImageModel, newItem: ImageModel): Boolean {
        return oldItem.toString()==newItem.toString()

    }


}
