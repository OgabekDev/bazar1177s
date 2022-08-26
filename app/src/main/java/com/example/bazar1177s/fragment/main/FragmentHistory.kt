package com.example.bazar1177s.fragment.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.databinding.FragmentHistoryBinding

class FragmentHistory: Fragment(R.layout.fragment_history){
    private val binding by viewBinding(FragmentHistoryBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVIews()
    }

    private fun initVIews() {

    }
}