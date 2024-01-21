package com.lokesh.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val arrayList:List<ContactModel>):
    RecyclerView.Adapter<ContactAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(contactModel: ContactModel){
            val image = itemView.findViewById<ImageView>(R.id.personimg)
            val name = itemView.findViewById<TextView>(R.id.personname)
            image.setImageResource(contactModel.image)
            name.text = contactModel.Name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_item,parent,false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(arrayList[position])
    }

}