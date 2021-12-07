package com.example.foodcourt

import com.example.foodcourt.Model.FoodModel
import com.example.foodcourt.Model.FoodModelHorizontal

object FoodData {
    private val foodNames = arrayOf(
            "Regular Burger",
            "Chicken Burger",
            "Chesse Burger",
            "Double Chesse Burger",
            "Regular Pizza",
            "Beef Pizza",
            "Spesial Pizza"
    )
    private val  foodPrice = arrayOf(
            "Rp.14.000",
            "Rp.16.000",
            "Rp.20.000",
            "Rp.30.000",
            "Rp.60.000",
            "Rp.90.000",
            "Rp.120.000",
    )

    private val foodDetail = arrayOf(
            "Hamburger (atau sering kali disebut dengan burger) adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai.",
            "Roti Burger dengan daging ayam goreng yang disajikan dengan roti lembut , selada segar dan saus McChicken.",
            "Burger keju adalah hamburger yang disisipi keju. Pembuatannya adalah keju dipotong tipis, lalu dibiarkan sesaat agar keju meleleh.",
            "Perpaduan roti burger dengan 2 Lapisan daging gurih dan 2 lapisan keju disajikan dengan saus tomat, acar, potongan bawang dan mustard.",
            "Pizza adalah roti berbentuk bulat pipih dengan diameter 30 cm yang dipanggang dalam oven dan biasanya disiram saus tomat serta keju dan dengan makanan tambahan lainnya (topping) yang sesuai selera penikmatnya.",
            "Perpaduan Daging Beef dan adonan pizza adalah Harmoni yang Legendari",
            "Spesial Pizza yang di buat dengan isian daging sapi asap pilihan, dibalut dengan keju mozarella import menjadi satu. Kejunya meleleh di tiap gigitan, bener2 bikin ketagihan.."
    )

    private  val foodImage = intArrayOf(R.drawable.regular_burger,
            R.drawable.chiken_burger,
            R.drawable.chesse_burger,
            R.drawable.double_chesse_burger,
            R.drawable.regular_pizza,
            R.drawable.beef_pizza,
            R.drawable.spesial_pizza,
            )
    val  listdata : ArrayList<FoodModelHorizontal>
    get() {
        val list = arrayListOf<FoodModelHorizontal>()
        for ( position in foodNames.indices){
            val Food = FoodModelHorizontal ()
            Food.nama = foodNames[position]
            Food.harga = foodPrice[position]
            Food.detail = foodDetail[position]
            Food.photo = foodImage[position]
            list.add(Food)
        }
        return list
    }
}