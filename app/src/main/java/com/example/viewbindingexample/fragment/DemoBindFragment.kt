package com.example.viewbindingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.FragmentDemoBinding

class DemoBindFragment : Fragment(R.layout.fragment_demo) {

    private var fragmentDemoBinding: FragmentDemoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentDemoBinding.bind(view)
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
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentDemoBinding = null
        super.onDestroyView()
    }

}