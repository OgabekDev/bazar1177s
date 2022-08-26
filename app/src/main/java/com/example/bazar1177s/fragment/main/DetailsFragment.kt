package com.example.bazar1177s.fragment.main

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.bazar1177s.R
import com.example.bazar1177s.databinding.FragmentDetailsBinding
import com.example.bazar1177s.model.DiscountProduct
import com.example.bazar1177s.utils.TextWatcherWrapper
import com.example.bazar1177s.utils.UiStateObject
import com.example.bazar1177s.viewmodel.DetailsViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

private const val TAG = "DetailsFragment"
@AndroidEntryPoint
class DetailsFragment : Fragment(R.layout.fragment_details) {
     var productId:Int = 0
    private val binding by viewBinding(FragmentDetailsBinding::bind)
    private val viewModel: DetailsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            productId = it.getInt("productId")
        }

        viewModel.getProduct(productId)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpObservers()
        initViews()
    }

    private fun initViews() {
        val textWatcherWrapper = object : TextWatcherWrapper() {
            override fun afterTextChanged(s: Editable) {
                super.afterTextChanged(s)
                binding.tvProductName.text = s.toString()
            }
        }

        with(binding){
            icBack.setOnClickListener {
                activity?.onBackPressed()
            }
            icCart.setOnClickListener {
                findNavController().navigate(R.id.action_detailsFragment_to_orderFragment)
            }

        binding.icBack.setOnClickListener {
            findNavController().navigateUp()
        }


        }
    }

    private fun setUpObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getProductState.collect() {
                    when (it) {
                        is UiStateObject.LOADING -> {
                            showLoading()
                        }
                        is UiStateObject.SUCCESS -> {
                            cancelLoading()
                            Log.d(TAG + "Image", "Image: ${it.data.image}")

                            val imageByteArray = Base64.decode(it.data.image.data, Base64.DEFAULT)
                            Glide.with(binding.ivProduct).load(imageByteArray).into(binding.ivProduct)
                            binding.tvProductName.text=it.data.name
                            binding.tvProductPrice.text=it.data.price.toString()
                            binding.tvProductDescription.text=it.data.about
                            binding.ivPlus.visibility = View.VISIBLE
                            binding.ivMinus.visibility = View.VISIBLE
                            binding.tvProductWeight.visibility = View.VISIBLE
                        }
                        is UiStateObject.ERROR -> {
                            cancelLoading()
                            showError(it.message)
                            Log.d(TAG, "data: ${it.message}")
                        }
                        else -> Unit
                    }
                }
            }
        }
    }

    private fun showError(message: String) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Something went wrong")
        builder.setMessage("Error:  $message")
        builder.setPositiveButton("OK") { _, _ ->
            requireActivity().onBackPressed()
        }
    }

    private fun cancelLoading() {
        binding.pbLoading.visibility = View.GONE
    }

    private fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }



}