package com.example.foodcourt.Model

import android.os.Parcelable
import android.telecom.Call
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodModel(
        var     nama:String,
        var     detail:String,
        var    rating: String,
        var  harga:String,
        var  image:Int = 0

): Parcelable