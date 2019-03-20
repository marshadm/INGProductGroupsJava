package com.ing.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ing.product.model.ProductsGroup;

@Service
public interface ProductGroupService {

	public List<ProductsGroup> getProduct();
}
