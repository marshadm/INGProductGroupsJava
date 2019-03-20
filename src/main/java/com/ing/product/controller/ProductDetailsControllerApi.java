package com.ing.product.controller;

import java.util.List;

import com.ing.product.model.ProductDetails;

public interface ProductDetailsControllerApi {
	
	public List<ProductDetails> getProductDetails( Long id);
}
