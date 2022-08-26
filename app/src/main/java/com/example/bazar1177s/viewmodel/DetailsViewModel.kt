package com.example.bazar1177s.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.data.db.ProductOrderDao
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.model.ProductOrder
import com.example.bazar1177s.repository.DetailsRepository
import com.example.bazar1177s.utils.UiStateObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "DetailsViewModel"

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val detailsRepository: DetailsRepository,
) :
    ViewModel() {

    private val _getProductState = MutableStateFlow<UiStateObject<Product>>(UiStateObject.EMPTY)
    var getProductState = _getProductState

    private val _amount = MutableStateFlow<UiStateObject<Int>>(UiStateObject.EMPTY)
    var amount = _amount

    private val _saveProduct = MutableStateFlow<UiStateObject<Boolean>>(UiStateObject.EMPTY)
    var saveProduct = _saveProduct

    fun getProduct(id: Int) = viewModelScope.launch {
        _getProductState.value = UiStateObject.LOADING
        try {
            val response = detailsRepository.getProduct(id)
            if (response.success) {
                _getProductState.value = UiStateObject.SUCCESS(response.data)
            } else {
                _getProductState.value = UiStateObject.ERROR(response.message)
            }
        } catch (e: Exception) {
            Log.d(TAG, "getShopCategories: EXCEPTION IN CATCH")
            _getProductState.value =
                UiStateObject.ERROR(e.localizedMessage ?: "Error occured in getting Categories")
        }
    }

    fun getAmount(productId: Long) = viewModelScope.launch {
        _amount.value = UiStateObject.LOADING
        try {
            val response = detailsRepository.getAmount(productId)
            _amount.value = UiStateObject.SUCCESS(response)
        } catch (e: Exception) {
            _amount.value = UiStateObject.ERROR("0")
        }
    }

    fun saveProduct(productOrder: ProductOrder) = viewModelScope.launch {
        _saveProduct.value = UiStateObject.LOADING
        try {
            var product = detailsRepository.saveProduct(productOrder)
            _saveProduct.value = UiStateObject.SUCCESS(true)
        } catch (e: Exception) {
            _saveProduct.value = UiStateObject.ERROR(e.localizedMessage)
        }
    }
}