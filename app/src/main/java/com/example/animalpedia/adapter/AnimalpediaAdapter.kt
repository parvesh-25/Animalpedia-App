package com.example.animalpedia.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animalpedia.DetailActivity
import com.example.animalpedia.data.Animalpedia
import com.example.animalpedia.databinding.RowItemYellowBinding

class AnimalpediaAdapter(private val listAnimalpedia: ArrayList<Animalpedia>) :
    RecyclerView.Adapter<AnimalpediaAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemYellowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
        RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listAnimalpedia[position]){
                tvName.text = name
                image.setImageResource(imageHome!!)
                holder.itemView.setOnClickListener{
                    val intent = Intent(it.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.ANIMALPEDIA_DATA, listAnimalpedia[position])
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listAnimalpedia.size

}