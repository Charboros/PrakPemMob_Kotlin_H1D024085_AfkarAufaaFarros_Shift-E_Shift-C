package com.example.praktikkummobile.ui.viewmodel

import com.example.praktikkummobile.data.model.Category
import com.example.praktikkummobile.data.model.Product

sealed interface ProductUiState {
    object Loading : ProductUiState
    data class Success(
        val categories: List<Category>,
        val products: List<Product>
    ) : ProductUiState
    data class Error(val message: String) : ProductUiState
}
