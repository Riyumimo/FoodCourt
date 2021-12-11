package com.example.foodcourt.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodcourt.Model.FoodModelHorizontal
import com.example.foodcourt.R

class HorizontalAdapter(val horizontalListFood:ArrayList<FoodModelHorizontal>) : RecyclerView.Adapter<HorizontalAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder ( itemView:View):RecyclerView.ViewHolder(itemView) {
        var tvname: TextView =itemView.findViewById(R.id.tv_h_nama)
        var tvharga: TextView =itemView.findViewById(R.id.tv_h_harga)
        var imgphoto: ImageView =itemView.findViewById(R.id.img_h_photo)





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_list_item,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
      val listFood =  horizontalListFood[position]

        holder.tvname.text = listFood.nama
        holder.tvharga.text= listFood.harga
       holder.imgphoto.setImageResource(listFood.photo)
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(horizontalListFood[holder.adapterPosition]) }
        }

    override fun getItemCount(): Int {
        return  horizontalListFood.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: FoodModelHorizontal)
    }
}

