package com.example.homework_1_month_4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework_1_month_4.databinding.ItemAnimalBinding

class MainAdapter(private val click: Result) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val list = ArrayList<Int>()
    fun setList(list: List<Int>){
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    inner class MainViewHolder(private val binding: ItemAnimalBinding): ViewHolder(binding.root){
        fun onBind(pos: Int){
            binding.imgAnimal.setImageResource(list[pos])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder = MainViewHolder(
        ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )



    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.onBind(position)
        holder.itemView.setOnClickListener {
            holder.itemView.alpha=0.2f
            click.onClick(list[position])
        }
    }

    override fun getItemCount(): Int = list.size
    interface Result{
        fun onClick(image : Int)
    }
}