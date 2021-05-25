package com.devjamesp.recyclerviewactivity

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private val items: ArrayList<Pet>,
    private val context: Context,
    val itemSelect: (Pet) -> Unit
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_layout, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img_pet: ImageView by lazy {
            view.findViewById(R.id.img_pet)
        }
        val tv_breed: TextView by lazy {
            view.findViewById(R.id.tv_breed)
        }
        val tv_age: TextView by lazy {
            view.findViewById(R.id.tv_age)
        }
        val tv_gender: TextView by lazy {
            view.findViewById(R.id.tv_gender)
        }

        init {
            img_pet
            tv_breed
            tv_age
            tv_gender
        }

        fun bind(pet: Pet, context: Context) {
            if (pet.photo != "") {
                val resourceId = context.resources.getIdentifier(
                    pet.photo,
                    "drawa  ble",
                    context.packageName
                )
                img_pet.setImageResource(resourceId)
                Log.d("testt", "${pet.photo}")
            } else {
                Log.d("testt", "${pet.photo}")
                img_pet.setImageResource(R.mipmap.ic_launcher)
            }

            tv_breed.text = pet.breed
            tv_age.text = pet.age
            tv_gender.text = pet.gender

            itemView.setOnClickListener{ itemSelect(pet) }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], context)
    }


    override fun getItemCount(): Int = items.size
}

