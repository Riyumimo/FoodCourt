package com.example.foodcourt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                        "Chesse Burger",
                        "4.0",
                        "Rp.34.000"
                        , R.drawable.cheseburger

                ),
                FoodModel(
                        "Pizza Burger",
                        "4.0",
                        "Rp.14.000"
                        , R.drawable.regular_burger

                ),
                FoodModel(
                        "Big Burger",
                        "6.0",
                        "Rp.64.000"
                        , R.drawable.regular_pizza

                )
                ,
                FoodModel(
                        "Big Burger",
                        "5.0",
                        "Rp.64.000"
                        , R.drawable.beef_pizza

                )




        )
        val listFoodAdapter= VertikalAdapter(datamakanan)
        RvVertikal.adapter = listFoodAdapter


    }


}

