package com.example.adaptertest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val dataset: List<Product>,
    private val context: Context)
    : RecyclerView.Adapter<Adapter.ProductHolder>() {

    class ProductHolder(item: View): RecyclerView.ViewHolder(item){

        val tvTitle: TextView = item.findViewById(R.id.tv_title)
        val tvCategory: TextView = item.findViewById(R.id.tv_category)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val mainLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)

        return ProductHolder(mainLayout)
    }


    override fun getItemCount() = dataset.size


    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val item = dataset[position]
        holder.tvTitle.text = item.title
        holder.tvCategory.text = item.category
    }

}