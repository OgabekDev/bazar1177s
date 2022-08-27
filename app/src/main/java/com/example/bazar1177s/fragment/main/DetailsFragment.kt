package com.example.bazar1177s.fragment.main

import android.app.AlertDialog
import android.os.Bundle
import android.text.Editable
import android.util.Base64
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.bazar1177s.R
import com.example.bazar1177s.databinding.FragmentDetailsBinding
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.model.ProductOrder
import com.example.bazar1177s.utils.TextWatcherWrapper
import com.example.bazar1177s.utils.UiStateObject
import com.example.bazar1177s.viewmodel.DetailsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

private const val TAG = "DetailsFragment"

@AndroidEntryPoint
class DetailsFragment : Fragment(R.layout.fragment_details) {
    var productId: Long = 0
    private var amount: Int = 0
    private lateinit var product: ProductOrder
    private val binding by viewBinding(FragmentDetailsBinding::bind)
    private val viewModel: DetailsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            productId = it.getLong("productId")
        }

        viewModel.getAmount(productId = productId)
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

        with(binding) {
            icBack.setOnClickListener {
                activity?.onBackPressed()
            }
            icCart.setOnClickListener {
                findNavController().navigate(R.id.action_detailsFragment_to_orderFragment)
            }

            icBack.setOnClickListener {
                findNavController().navigateUp()
            }

            ivPlus.setOnClickListener {
                amount++
                tvProductWeight.text = "$amount ${product.type}"
            }
            ivMinus.setOnClickListener {
                if (amount > 0) {
                    amount--
                    tvProductWeight.text = "$amount ${product.type}"
                }
            }

        }
    }

    private fun setUpObservers() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getProductState.collect {
                    when (it) {
                        is UiStateObject.LOADING -> {
                            showLoading()
                        }
                        is UiStateObject.SUCCESS -> {
                            cancelLoading()
                            Log.d(TAG + "Image", "Image: ${it.data.image}")
                            initDetails(it.data)
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
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.amount.collect {
                    when (it) {
                        is UiStateObject.LOADING -> {

                        }
                        is UiStateObject.SUCCESS -> {
                            amount = it.data
//                            binding.tvProductWeight.text = "$amount ${product.type}"
                        }
                        is UiStateObject.ERROR -> {
                            amount = 0
                        }
                        else -> Unit
                    }
                }
            }
        }
    }

    private fun initDetails(data: Product) {
        val imageByteArray = Base64.decode(data.image.data, Base64.DEFAULT)
        Glide.with(binding.ivProduct).load(imageByteArray)
            .into(binding.ivProduct)
        binding.tvProductName.text = data.name
        binding.tvProductPrice.text = data.price.toString()
        binding.tvProductDescription.text = data.about
        binding.ivPlus.visibility = View.VISIBLE
        binding.ivMinus.visibility = View.VISIBLE
        binding.tvProductWeight.visibility = View.VISIBLE
        binding.tvProductWeight.text = "$amount ${data.type.name}"

//        product.apply {
//            type = data.type.name
//            entity = amount
//            image = data.image.data
//            name = data.name
//            price = data.price
//            total = entity * price
//            productId = data.id
//        }

        product = ProductOrder(
            type = data.type.name, entity = amount,
            image = data.image.data, name = data.name, price = data.price,
            total = amount * data.price, id = data.id
        )

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

    override fun onPause() {
        product.entity = amount
        product.total = product.price * product.entity

        if (product.entity > 0) viewModel.saveProduct(product)
        if (product.entity == 0) viewModel.delete(product.id)

        amount = 0

        super.onPause()
    }

}