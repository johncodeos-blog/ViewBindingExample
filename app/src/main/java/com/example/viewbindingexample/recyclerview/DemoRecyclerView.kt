package com.example.viewbindingexample.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindingexample.databinding.RecyclerviewDemoBinding

class DemoRecyclerView : AppCompatActivity() {

    private lateinit var itemsCells: ArrayList<String?>
    private lateinit var adapter: Items_RVAdapter

    private lateinit var binding: RecyclerviewDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RecyclerviewDemoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //** Set the data for our ArrayList
        setItemsData()

        //** Set the adapter of the RecyclerView
        setAdapter()

        //** Set the Layout Manager of the RecyclerView
        setRVLayoutManager()
    }


    private fun setItemsData() {
        itemsCells = ArrayList()
        for (i in 0..40) {
            itemsCells.add("Item $i")
        }
    }

    private fun setAdapter() {
        adapter = Items_RVAdapter(itemsCells)
        adapter.notifyDataSetChanged()
        binding.itemsrv.adapter = adapter
    }

    private fun setRVLayoutManager() {
        val mLayoutManager = LinearLayoutManager(binding.itemsrv.context)
        binding.itemsrv.layoutManager = mLayoutManager
        binding.itemsrv.setHasFixedSize(true)
    }
}

