package com.example.bazar1177s.fragment.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.adapter.ProductAdapter
import com.example.bazar1177s.adapter.ShopCategoryAdapter
import com.example.bazar1177s.databinding.FragmentBasketBinding
import com.example.bazar1177s.utils.UiStateList
import com.example.bazar1177s.viewmodel.BasketViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

private const val TAG = "BasketFragment"
@AndroidEntryPoint
class   BasketFragment:Fragment(R.layout.fragment_basket) {
    private val shopCategoryAdapter by lazy { ShopCategoryAdapter() }
    private val productAdapter by lazy { ProductAdapter() }
    private val viewModel:  BasketViewModel by viewModels()
    private val binding by viewBinding(FragmentBasketBinding::bind)
      var shopId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shopId = arguments?.getInt("catch") ?: 0
        Log.d(TAG, "onCreate: shopId $shopId")
        viewModel.getShopCategories(shopId)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: init")
        initVIews()
        Log.d(TAG, "onViewCreated: setup")
        setUpObservers()
    }

    private fun setUpObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getShopCategoryState.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {
                        }
                        is UiStateList.SUCCESS -> {
                            viewModel.getProducts(it.data.first().id)
                            Log.d(TAG, "setUpObservers: size ${it.data.size}")
                            shopCategoryAdapter.onClick = {
                                viewModel.getProducts(it.id)
                            }
                            shopCategoryAdapter.submitList(it.data)
                            Log.d(TAG, "getProducts id: ${it.data.first().id}")

                        }
                        is UiStateList.ERROR -> {
                            Log.d(TAG, "getCategories: Error in getCategoryState")
                        }
                        else -> Unit
                    }
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getProductsState.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {
                        }
                        is UiStateList.SUCCESS -> {
                            Log.d(TAG, "setUpObservers: size ${it.data.size}")
                            productAdapter.submitList(it.data)
                            productAdapter.onClick = {
                                findNavController().navigate(R.id.action_basketFragment_to_detailsFragment, bundleOf("productIdFromBasket" to it.id))
                            }
                            productAdapter.addProduct = {
                                viewModel.addProductToDataBase(it)
                            }
                        }
                        is UiStateList.ERROR -> {
                            Log.d(TAG, "getProducts: Error in getProductState")
                        }
                        else -> Unit
                    }
                }
            }
        }
    }

    private fun initVIews() {
        binding.rvCartHorizontal.adapter = shopCategoryAdapter
        binding.rvCartVertical.adapter = productAdapter


        with(binding){
            icBack.setOnClickListener {
               activity?.onBackPressed()
            }
            icCart.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_orderFragment)
            }
        }

        binding.icBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}