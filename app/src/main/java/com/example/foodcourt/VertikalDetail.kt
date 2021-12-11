package com.example.foodcourt

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodcourt.Model.FoodModel

class VertikalDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertikal_detail)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.detail_toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }

        val intent = intent.getParcelableExtra<FoodModel>(DetailActivity.EXTRA_FOOD)
        val imgfood = findViewById<ImageView>(R.id.iv_vd_image)
        val namefood = findViewById<TextView>(R.id.tv_vd_name)
        val detailfood = findViewById<TextView>(R.id.tv_vd_detail)
        val hargafood = findViewById<TextView>(R.id.tv_vd_harga)
        val ratingfood = findViewById<TextView>(R.id.tv_vd_rating)


        imgfood.setImageResource(intent?.image!!)
        namefood.text = intent?.nama
        detailfood.text = intent?.detail
        ratingfood.text = intent?.rating
        hargafood.text = intent?.harga
    }
}