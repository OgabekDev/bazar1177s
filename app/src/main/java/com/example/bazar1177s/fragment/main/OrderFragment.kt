package com.example.bazar1177s.fragment.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.databinding.FragmentOrderBinding

class OrderFragment: Fragment(R.layout.fragment_order) {
    private val binding by viewBinding(FragmentOrderBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVIews()
    }

    private fun initVIews() {
        binding.ivBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}