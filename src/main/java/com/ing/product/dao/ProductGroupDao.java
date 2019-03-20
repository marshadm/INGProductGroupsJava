package com.ing.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.product.model.ProductsGroup;

public interface ProductGroupDao extends JpaRepository<ProductsGroup, Integer>{

}
