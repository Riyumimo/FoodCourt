package com.example.foodcourt.Model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.ParcelField
import kotlinx.parcelize.Parcelize


@Parcelize
data class FoodModelHorizontal (
    var nama:String ="",
    var detail: String="",
    var harga:String="",
    var photo :Int =0
        ):Parcelable




