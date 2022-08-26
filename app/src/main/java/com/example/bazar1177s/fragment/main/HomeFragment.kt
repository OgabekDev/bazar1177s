package com.example.bazar1177s.fragment.main

import android.graphics.BitmapFactory
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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bazar1177s.R
import com.example.bazar1177s.adapter.CarouselAdapter
import com.example.bazar1177s.adapter.DiscountAdapter
import com.example.bazar1177s.adapter.ShopAdapter
import com.example.bazar1177s.databinding.FragmentHomeBinding
import com.example.bazar1177s.utils.UiStateList
import com.example.bazar1177s.utils.UiStateObject
import com.example.bazar1177s.viewmodel.MainViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.*


@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private val TAG = "HomeFragment"
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: MainViewModel by viewModels()
    private val shopAdapter by lazy { ShopAdapter() }
    private val carouselAdapter by lazy { CarouselAdapter() }
    private val discountAdapter by lazy { DiscountAdapter() }
    private lateinit var layoutManagerBanner: LinearLayoutManager
    private lateinit var rvMainAds: RecyclerView

    companion object {
        const val DELAY_MS: Long = 2500 //delay in milliseconds before task is to be executed
        const val PERIOD_MS: Long = 5000 // time in milliseconds between successive task executions.
    }

    private var timer: Timer? = null
    private var timerTask: TimerTask? = null
    private var position: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCarouselProducts()
        viewModel.getShops()
        viewModel.getDiscountProducts()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        setUpBanners()
        setUpObservers()
    }

    override fun onResume() {
        super.onResume()
        runAutoScrollBanner()
    }

    override fun onPause() {
        super.onPause()
        stopAutoScrollBanner()
    }


    private fun setUpObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getShopState.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE
                        }
                        is UiStateList.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE

                            Log.d(TAG, "setUpObservers: size ${it.data.size.toString()}")
                            shopAdapter.submitList(it.data)
                        }
                        is UiStateList.ERROR -> {
                            binding.progressBar.visibility = View.GONE

                            Log.d(TAG, "getCategories: Error in getCategoryState")
                        }
                        else -> Unit
                    }
                }
            }
        }


        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getCarouselProductState.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE

                        }
                        is UiStateList.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE

                            Log.d(TAG, "setUpObservers: size ${it.data.size.toString()}")
                            carouselAdapter.submitList(it.data)
                        }
                        is UiStateList.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Log.d(TAG, "getCategories: Error in getCategoryState")
                        }
                        else -> Unit
                    }
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getDiscountProductState.collect() {
                    when (it) {
                        is UiStateList.LOADING -> {
                            binding.progressBar.visibility = View.VISIBLE

                        }
                        is UiStateList.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE

                            Log.d(TAG, "setUpObservers: size ${it.data.size.toString()}")
                            discountAdapter.submitList(it.data)
                        }
                        is UiStateList.ERROR -> {
                            binding.progressBar.visibility = View.GONE

                            Log.d(TAG, "getDiscounts: Error in getDiscountState")
                        }
                        else -> Unit
                    }
                }
            }
        }

    }


    private fun initViews() {
        binding.rvShops.adapter = shopAdapter
        shopAdapter.onClick = { shop ->
            findNavController().navigate(
                R.id.action_homeFragment_to_basketFragment,
                bundleOf("catch" to shop.id)
            )
        }
        binding.icPerson.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }


        discountAdapter.onClick = { it ->
            findNavController().navigate(
                R.id.action_homeFragment_to_detailsFragment, bundleOf("productId" to it))
        }



        with(binding) {
            icPerson.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
            }
            icCart.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_orderFragment)
            }
            rvDiscounts.adapter = discountAdapter
        }

    }

    private fun setUpBanners() {
        rvMainAds = binding.rvMainAds
        layoutManagerBanner =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        rvMainAds.layoutManager = layoutManagerBanner
        rvMainAds.adapter = carouselAdapter

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rvMainAds)
        binding.dotsIndicator.attachToRecyclerView(rvMainAds)
        rvMainAds.smoothScrollBy(5, 0)
        rvMainAds.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                position = layoutManagerBanner.findFirstCompletelyVisibleItemPosition()
            }
        })

        carouselAdapter.onClick = {
            findNavController().navigate(
                R.id.action_homeFragment_to_detailsFragment,
                bundleOf("productId" to it.id)
            )
        }
    }


    private fun runAutoScrollBanner() {
        if (timer == null && timerTask == null) {
            timer = Timer()
            timerTask = object : TimerTask() {
                override fun run() {
                    if (position == carouselAdapter.itemCount - 1) {
                        position = 0
                        rvMainAds.smoothScrollToPosition(position)
                    } else {
                        rvMainAds.smoothScrollToPosition(++position)
                    }
                }
            }
            timer!!.schedule(timerTask, DELAY_MS, PERIOD_MS)
        }
    }

    private fun stopAutoScrollBanner() {
        if (timer != null && timerTask != null) {
            timer!!.cancel()
            timer = null
            timerTask!!.cancel()
            timerTask = null
            position = layoutManagerBanner.findFirstCompletelyVisibleItemPosition()
        }
    }


}