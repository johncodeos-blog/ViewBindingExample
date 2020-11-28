package com.example.viewbindingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.FragmentDemoBinding

class DemoInflateFragment : Fragment() {

    private var fragmentDemoBinding: FragmentDemoBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDemoBinding.inflate(inflater, container, false)
        fragmentDemoBinding = binding

        // TextView
        binding.fragmentTextview.text = "View Binding TextView Example"


        // ImageView
        binding.fragmentImageview.setImageResource(R.drawable.ic_baseline_android_24)


        // Button
        binding.fragmentButton.text = "View Binding Button Example"
        binding.fragmentButton.setOnClickListener {
            Toast.makeText(this.context, "Testing View Binding", Toast.LENGTH_LONG).show()
        }


        return binding.root
    }


    override fun onDestroyView() {
        fragmentDemoBinding = null
        super.onDestroyView()
    }
}