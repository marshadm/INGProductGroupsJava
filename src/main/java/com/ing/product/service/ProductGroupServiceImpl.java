package com.ing.product.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public ProductsGroup getProductGroup(Long productId) {

		ProductsGroup productsGroup = null;
		Optional<ProductsGroup> pg = productGroupDao.findById(productId.intValue());
		if(pg.isPresent()){
			productsGroup = pg.get();
		}
		return productsGroup;
	}

	@Override
	public void updateProductGroup(ProductsGroup productsGroup) {
		productGroupDao.save(productsGroup);
	}
}
