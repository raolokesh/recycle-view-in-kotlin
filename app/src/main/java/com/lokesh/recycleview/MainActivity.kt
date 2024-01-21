package com.lokesh.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactList = listOf(
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image2,"Deepak"),
            ContactModel(R.drawable.image3,"King"),
            ContactModel(R.drawable.image1,"Lokesh"),
            ContactModel(R.drawable.image3,"Karan"),
            ContactModel(R.drawable.image2,"David"),
            ContactModel(R.drawable.image1,"Hemraj"),
        )
        val recyclerView:RecyclerView = findViewById(R.id.recycleview)

        val layoutManager = GridLayoutManager(this,2)
        val adapter = ContactAdapter(contactList)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
    }
}