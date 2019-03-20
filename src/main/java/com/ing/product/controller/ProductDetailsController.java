package com.ing.product.controller;

import java.util.List;

import com.ing.product.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ing.product.model.ProductDetails;
import com.ing.product.service.ProductGroupServiceImpl;

@RestController
public class ProductDetailsController implements ProductDetailsControllerApi {
	
	@Autowired
	private ProductDetailsService pgs;
	
	@Override
	@GetMapping("/getProductDetails/{id}")
	public List<ProductDetails> getProductDetails(@PathVariable ("id") Long id) {
		
		return pgs.getProductDetails(id) ;
	}
	
	
} 