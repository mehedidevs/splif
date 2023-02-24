package com.arif.spliff.ui.all_products

import androidx.lifecycle.ViewModel
import com.arif.spliff.entity.Cart
import com.arif.spliff.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(var repository: Repository) : ViewModel() {


    fun responseAllProduct() = repository.getProductRepo()
    fun responseAllCart() = repository.getCartRepo()
    fun insertCart(cart: Cart) = repository.insertCartRepo(cart)


}