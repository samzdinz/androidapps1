package com.example.aplikasipertamabagicode.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasipertamabagicode.R
import com.example.aplikasipertamabagicode.list.adapter.VerticalAdapter
import com.example.aplikasipertamabagicode.list.adapter.VerticalItem

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val rvList = this.findViewById<RecyclerView>(R.id.rv_list)

        val verticalAdapter = VerticalAdapter()

        val dataDummy = listOf<VerticalItem>(
            VerticalItem(1, "samz", "jln Rancasawo", 0),
            VerticalItem(2, "keyzie", "jln sekehaji 1", 0),
            VerticalItem(3, "azmie", "jln sekehaji 2", 0),
            VerticalItem(4, "zidane", "jln sekehaji 3", 0),
            VerticalItem(5, "hayyu", "jln pasirjati", 0),
        )
        verticalAdapter.submitList(dataDummy)
        rvList.adapter = verticalAdapter
    }
}