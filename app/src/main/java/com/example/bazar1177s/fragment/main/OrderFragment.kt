package com.example.bazar1177s.fragment.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.adapter.ProductOrderAdapter
import com.example.bazar1177s.databinding.FragmentOrderBinding
import com.example.bazar1177s.utils.UiStateList
import com.example.bazar1177s.utils.UiStateObject
import com.example.bazar1177s.viewmodel.OrderProductViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class OrderFragment : Fragment(R.layout.fragment_order) {
    private val binding by viewBinding(FragmentOrderBinding::bind)
    private val adapter by lazy { ProductOrderAdapter() }
    private val viewModel: OrderProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getProducts()
        initViews()
    }

    private fun initViews() {
        setObservers()

        binding.apply {
            rvBuyurtma.adapter = adapter

            adapter.deleteClick = {
                viewModel.deleteProduct(it)
            }
            ivBack.setOnClickListener {
                findNavController().navigateUp()
            }
            bBuyurtmaBekorQilish.setOnClickListener {
                viewModel.clearOrder()
            }
        }
    }

    private fun setObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.products.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {

                        }
                        is UiStateList.SUCCESS -> {
                            adapter.submitList(it.data)
                        }
                        is UiStateList.ERROR -> {

                        }
                        else -> Unit

                    }
                }
            }
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.deleted.collect {
                    when (it) {
                        is UiStateObject.LOADING -> {

                        }
                        is UiStateObject.SUCCESS -> {
                            viewModel.getProducts()
                        }
                        is UiStateObject.ERROR -> {

                        }
                        else -> Unit
                    }
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.cleared.collect {
                    when (it) {
                        is UiStateObject.LOADING -> {

                        }
                        is UiStateObject.SUCCESS -> {
                            viewModel.getProducts()
                        }
                        is UiStateObject.ERROR -> {

                        }
                        else -> Unit
                    }
                }
            }
        }
    }
}