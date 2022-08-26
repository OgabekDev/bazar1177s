package com.example.bazar1177s.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.model.CarouselProduct
import com.example.bazar1177s.model.DiscountProduct
import com.example.bazar1177s.model.Shop
import com.example.bazar1177s.repository.HomeRepository
import com.example.bazar1177s.utils.UiStateList
import com.example.bazar1177s.utils.UiStateObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

private const val TAG = "MainViewModel"
@HiltViewModel
class MainViewModel @Inject constructor(private val homeRepository: HomeRepository) : ViewModel() {

    private val _getShopState = MutableStateFlow<UiStateList<Shop>>(UiStateList.EMPTY)
    var getShopState = _getShopState

    fun getShops() = viewModelScope.launch {
        _getShopState.value = UiStateList.LOADING
        try {
            val response = homeRepository.getShops()
            if (response.size>0) {
                Log.d(TAG, "getShops: ${response.size}")
                _getShopState.value = UiStateList.SUCCESS(response)
            } else {
                _getShopState.value = UiStateList.ERROR("ERRPR IN IF ELSE STATE")
            }
        } catch (e: Exception) {
            Log.d(TAG, "getShops: error in catch")
            _getShopState.value =
                UiStateList.ERROR(e.localizedMessage ?: "Error occured in getting Categories")
        }
    }

    private val _getCarouselProductState = MutableStateFlow<UiStateList<CarouselProduct>>(UiStateList.EMPTY)
    var getCarouselProductState = _getCarouselProductState

    fun getCarouselProducts() = viewModelScope.launch {
        _getCarouselProductState.value = UiStateList.LOADING
        try {
            val response = homeRepository.getCarouselProducts()
            if (response.data.size>0) {
                _getCarouselProductState.value = UiStateList.SUCCESS(response.data)
            } else {
                _getCarouselProductState.value = UiStateList.ERROR(response.message)
            }
        } catch (e: Exception) {
            _getCarouselProductState.value =
                UiStateList.ERROR(e.localizedMessage ?: "Error occured in getting Categories")
        }
    }

    private val _getDiscountProductState = MutableStateFlow<UiStateList<DiscountProduct>>(UiStateList.EMPTY)
    var getDiscountProductState = _getDiscountProductState

    fun getDiscountProducts() = viewModelScope.launch {
        _getDiscountProductState.value = UiStateList.LOADING
        try {
            val response = homeRepository.getDiscountProducts()
            if (response.data.size>0) {
                _getDiscountProductState.value = UiStateList.SUCCESS(response.data)
            } else {
                _getDiscountProductState.value = UiStateList.ERROR(response.message)
            }
        } catch (e: Exception) {
            _getDiscountProductState.value =
                UiStateList.ERROR(e.localizedMessage ?: "Error occured in getting DiscountProducts")
        }
    }


}