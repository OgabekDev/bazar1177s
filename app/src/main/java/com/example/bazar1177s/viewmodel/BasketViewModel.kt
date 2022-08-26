package com.example.bazar1177s.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.model.OrderedProducts
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.model.Shop
import com.example.bazar1177s.model.ShopCategory
import com.example.bazar1177s.repository.BasketRepository
import com.example.bazar1177s.repository.HomeRepository
import com.example.bazar1177s.utils.UiStateList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "BasketViewModel"
@HiltViewModel
class BasketViewModel @Inject constructor(private val basketRepository: BasketRepository) : ViewModel() {
    private val _getShopCategoryState = MutableStateFlow<UiStateList<ShopCategory>>(UiStateList.EMPTY)
    var getShopCategoryState = _getShopCategoryState

    fun getShopCategories(id:Int) = viewModelScope.launch {
        _getShopCategoryState.value = UiStateList.LOADING
        try {
            Log.d(TAG, "getShopCategories: inside try")
            val response = basketRepository.getShopCategories(id)
            Log.d(TAG, "getShopCategories: ${response.data.size}")
            if (response.data.size>0) {
                _getShopCategoryState.value = UiStateList.SUCCESS(response.data)
            } else {
                _getShopCategoryState.value = UiStateList.ERROR(response.message)
            }
        } catch (e: Exception) {
            Log.d(TAG, "getShopCategories: EXCEPTION IN CATCH")
            _getShopCategoryState.value =
                UiStateList.ERROR(e.localizedMessage ?: "Error occured in getting Categories")
        }
    }

    private val _getProducstState = MutableStateFlow<UiStateList<Product>>(UiStateList.EMPTY)
    var getProductsState = _getProducstState

    fun getProducts(id:Int) = viewModelScope.launch {
        _getProducstState.value = UiStateList.LOADING
        try {
            Log.d(TAG, "getShopCategories: inside try")
            val response = basketRepository.getProducts(id)
            Log.d(TAG, "getShopCategories: ${response.data.size}")
            if (response.data.size>0) {
                _getProducstState.value = UiStateList.SUCCESS(response.data)
            } else {
                _getProducstState.value = UiStateList.ERROR(response.message)
            }
        } catch (e: Exception) {
            Log.d(TAG, "getShopCategories: EXCEPTION IN CATCH")
            _getProducstState.value =
                UiStateList.ERROR(e.localizedMessage ?: "Error occured in getting Categories")
        }
    }


    fun addProductToDataBase(newProduct:OrderedProducts) = viewModelScope.launch {
        basketRepository.addProductsToDataBase(newProduct)
    }
}