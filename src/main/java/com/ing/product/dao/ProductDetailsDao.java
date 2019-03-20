package com.ing.product.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ing.product.model.ProductDetails;

@Repository
public interface ProductDetailsDao extends JpaRepository<ProductDetails, Long> {

	@Query("Select p from ProductDetails p") 
	//where p.productId = :productid")
	//@Param("productid") Long id
	public List<ProductDetails> findByProductId(Long productid);



}
