package com.example.foodcourt

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.foodcourt.Model.FoodModelHorizontal

class DetailActivity :AppCompatActivity() {
    companion object{
        const val EXTRA_FOOD = "extra_food"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent.getParcelableExtra<FoodModelHorizontal>(EXTRA_FOOD)

        val imgfood= findViewById<ImageView >(R.id.tv_image)
        val namefood= findViewById<TextView >(R.id.tv_name)
        val detailfood= findViewById<TextView >(R.id.tv_detail)
        val hargafood= findViewById<TextView >(R.id.tv_harga)


        imgfood.setImageResource(intent?.photo!!)
        namefood.text =intent?.nama
        detailfood.text =intent?.detail
        hargafood.text =intent?.harga





    }
}