package com.ing.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.product.dao.ProductGroupDao;
import com.ing.product.model.ProductsGroup;

@Service
public class ProductGroupServiceImpl implements ProductGroupService{

	@Autowired
	ProductGroupDao productGroupDao;
	@Override
	public List<ProductsGroup>  getProduct() {
		
		return productGroupDao.findAll();
	}

}
