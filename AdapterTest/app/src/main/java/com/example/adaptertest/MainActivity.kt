package com.example.adaptertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.adaptertest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val dataset = DataLoad().dataload()

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recyclerView = findViewById<RecyclerView>(R.id.rcW)
        recyclerView.adapter = Adapter(dataset, this)
        recyclerView.setHasFixedSize(true)

        val SIZE = dataset.size

        binding.bParse.setOnClickListener { parseData() }

    }

    private fun parseData(){
        val parsedData = binding.editText.text.toString().toInt()
        binding.tv.text = dataset[parsedData%5].title
    }

}