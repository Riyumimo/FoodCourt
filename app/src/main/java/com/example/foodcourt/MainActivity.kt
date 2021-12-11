package com.example.foodcourt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodcourt.Adapter.HorizontalAdapter
import com.example.foodcourt.Adapter.VertikalAdapter
import com.example.foodcourt.DetailActivity.Companion.EXTRA_FOOD
import com.example.foodcourt.Model.FoodModel
import com.example.foodcourt.Model.FoodModelHorizontal

class MainActivity : AppCompatActivity() {
    private lateinit var RvVertikal: RecyclerView
    private lateinit var rvHorizontal:RecyclerView
    private  var list:ArrayList<FoodModelHorizontal> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileButton = findViewById<ImageButton>(R.id.profile)
        profileButton.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }


        rvHorizontal = findViewById(R.id.horizontalrecyclerView)
        rvHorizontal.setHasFixedSize(true  )
        list.addAll(FoodData.listdata)



        ShowHorizontalRecycleView()
        ShowVerticalRecycleView()

    }

    private fun ShowHorizontalRecycleView() {


        rvHorizontal.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val listhorizontal = HorizontalAdapter(list)
        rvHorizontal.adapter = listhorizontal
        listhorizontal.setOnItemClickCallback(object :HorizontalAdapter.OnItemClickCallback{
            override fun onItemClicked(data: FoodModelHorizontal) {

                val intent =Intent(this@MainActivity,DetailActivity::class.java)
                intent.putExtra(EXTRA_FOOD, data)
                startActivity(intent)

            }
        })

    }

    private fun ShowVerticalRecycleView() {
        RvVertikal = findViewById(R.id.rv_vertical)
        RvVertikal.setHasFixedSize(true)
        RvVertikal.layoutManager = LinearLayoutManager(this)
        val datamakanan =  arrayListOf<FoodModel>(
            FoodModel(
                "Coca Cola",
                "Coke adalah produk minuman bersoda yang telah mendunia dan sangat terkenal, produk ini dapat ditemukan hampir di setiap penjuru dunia, di restoran-restoran, toko swalayan, bahkan mesin penjual minuman (vending machine). Minuman ini diproduksi oleh The Coca-cola Company.",
                "6.0",
                "Rp.8.000"
                , R.drawable.coca_cola

            ),
            FoodModel(
                "Coffe Cup",
                "Kopi adalah minuman hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk. Kopi merupakan salah satu komoditas di dunia yang dibudidayakan lebih dari 50 negara.",
                "5.0",
                "Rp.10.000",
                R.drawable.cofee_cup


            ),
            FoodModel(
                "Bobaa \nMilkTea",
                "Bubble tea atau boba milk atau teh susu mutiara adalah minuman dengan bahan dasar teh, susu, dan boba",
                "5.0",
                "Rp.15.000",
                R.drawable.bobaa_mikltea


            ),
                FoodModel(
                        "Regular Burger",
                        "Hamburger (atau sering kali disebut dengan burger) adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai.",
                        "4.0",
                        "Rp.14.000"
                        , R.drawable.regular_burger

                ),
                FoodModel(
                        "Reguler Pizza",
                        "Pizza adalah roti berbentuk bulat pipih dengan diameter 30 cm yang dipanggang dalam oven dan biasanya disiram saus tomat serta keju dan dengan makanan tambahan lainnya (topping) yang sesuai selera penikmatnya.",
                        "4.0",
                    "Rp.60.000"
                        , R.drawable.regular_pizza

                ),
                FoodModel(
                        "Double Chesse \nBurger",
                        "Perpaduan roti burger dengan 2 Lapisan daging gurih dan 2 lapisan keju disajikan dengan saus tomat, acar, potongan bawang dan mustard.",
                        "6.0",
                        "Rp.30.000"
                        , R.drawable.double_chesse_burger

                ),








        )
        val listFoodAdapter= VertikalAdapter(datamakanan)
        RvVertikal.adapter = listFoodAdapter
        listFoodAdapter.setOnItemClickCallback(object :VertikalAdapter.OnItemClickCallback{
            override fun onItemClicked(data: FoodModel) {
                val intent =Intent(this@MainActivity,VertikalDetail::class.java)
                intent.putExtra(EXTRA_FOOD, data)
                startActivity(intent)
            }
        })


    }


}

