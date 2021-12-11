package com.example.foodcourt.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodcourt.Model.FoodModel
import com.example.foodcourt.R

class VertikalAdapter (val listfood:ArrayList<FoodModel>) :RecyclerView.Adapter<VertikalAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: VertikalAdapter.OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: VertikalAdapter.OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

   inner class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

       var tvname:TextView=itemView.findViewById(R.id.tv_v_name)
       var tvrating :TextView=itemView.findViewById(R.id.tv_v_rating)
       var tvharga :TextView=itemView.findViewById(R.id.tv_v_harga)
       var imgphoto: ImageView=itemView.findViewById(R.id.img_v_photo)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.new_list_view,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listfood[position]

        holder.tvname.text = food.nama
        holder.tvrating.text = food.rating
        holder.tvharga.text= food.harga
        holder.imgphoto.setImageResource(food.image)
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listfood[holder.adapterPosition])

        }

    }

    override fun getItemCount(): Int {
       return listfood.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: FoodModel)
    }
}