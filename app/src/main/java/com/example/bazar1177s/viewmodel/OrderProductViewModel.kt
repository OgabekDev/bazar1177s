package com.example.bazar1177s.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.model.ProductOrder
import com.example.bazar1177s.repository.OrderRepository
import com.example.bazar1177s.utils.UiStateList
import com.example.bazar1177s.utils.UiStateObject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class OrderProductViewModel @Inject constructor(private val repository: OrderRepository) :
    ViewModel() {

    private val _products = MutableStateFlow<UiStateList<ProductOrder>>(UiStateList.EMPTY)
    var products = _products

    private val _deleted = MutableStateFlow<UiStateObject<Boolean>>(UiStateObject.EMPTY)
    var deleted = _deleted

    private val _cleared = MutableStateFlow<UiStateObject<Boolean>>(UiStateObject.EMPTY)
    var cleared = _cleared

    fun getProducts() = viewModelScope.launch {
        _products.value = UiStateList.LOADING
        try {
            val response = repository.getProducts()
            if (response.isNotEmpty()) {
                _products.value = UiStateList.SUCCESS(response)
            } else {
                _products.value = UiStateList.ERROR("Product is not saved")
            }
        } catch (e: Exception) {
            _products.value = UiStateList.ERROR("Product is not saved")
        }
    }

    fun deleteProduct(id: Long) = viewModelScope.launch {
        _deleted.value = UiStateObject.LOADING
        try {
            val response = repository.deleteProduct(id)
            _deleted.value = UiStateObject.SUCCESS(true)

        } catch (e: Exception) {
            _deleted.value = UiStateObject.ERROR("Error")
        }
    }

    fun clearOrder()=viewModelScope.launch {
        _cleared.value=UiStateObject.LOADING
        try {
            val response = repository.clearProducts()
            _cleared.value = UiStateObject.SUCCESS(true)
        } catch (e: Exception) {
            _cleared.value = UiStateObject.ERROR("Error")
        }
    }


}