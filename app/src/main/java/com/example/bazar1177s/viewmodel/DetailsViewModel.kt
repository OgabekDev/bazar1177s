package com.example.bazar1177s.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bazar1177s.model.Product
import com.example.bazar1177s.repository.DetailsRepository
import com.example.bazar1177s.utils.UiStateObject
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "DetailsViewModel"
@HiltViewModel
class DetailsViewModel @Inject constructor(private val detailsRepository: DetailsRepository) : ViewModel() {

    private val _getProductState = MutableStateFlow<UiStateObject<Product>>(UiStateObject.EMPTY)
    var getProductState = _getProductState

    fun getProduct(id:Int) = viewModelScope.launch {
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

}