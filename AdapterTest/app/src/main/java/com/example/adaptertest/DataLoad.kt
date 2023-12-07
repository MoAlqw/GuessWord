package com.example.adaptertest

import com.example.adaptertest.Category.HAT
import com.example.adaptertest.Category.SHOES
import com.example.adaptertest.Category.WATCH
import com.example.adaptertest.Category.WEAR

class DataLoad {

    fun dataload(): List<Product>{
        return listOf(
                Product("Nike", SHOES),
                Product("Adidas", SHOES),
                Product("Apple", WATCH),
                Product("H&M", WEAR),
                Product("NY", HAT),
                Product("Climber", WEAR)
        )
    }

}
