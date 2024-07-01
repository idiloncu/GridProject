package com.example.gridproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.gridproject.adapter.ImageAdapter
import com.example.gridproject.data.ImageData
import com.example.gridproject.data.ImageModel
import com.example.gridproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var getImageList=ImageData.getImageData()
    private lateinit var imageAdapter: ImageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initBinding()

        /*getImageList =ArrayList()
        getImageList.add(ImageModel(R.drawable.octo))

        binding.recyclerView.layoutManager=GridLayoutManager(this,1)
        binding.recyclerView.adapter = imageAdapter

         */
    }

    private fun initBinding(){
        with(binding){
            recyclerView.apply {
                adapter=ImageAdapter{item->getImageList(item)

                }.apply {
                    
                }
            }
        }
    }

    private fun getImageList(selectedItem: ImageModel) {
        imageAdapter.submitList(imageAdapter.currentList.map { newItem->
            if (newItem==selectedItem){
                newItem.copy()
            }
            else{
                newItem
            }
        })
    }
}