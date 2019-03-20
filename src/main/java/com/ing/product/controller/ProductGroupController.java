package com.ing.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.product.model.ProductsGroup;
import com.ing.product.service.ProductGroupService;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductGroupController {
	
	@Autowired
	ProductGroupService productGroupService;
	
	@GetMapping("/group")
	public List<ProductsGroup> getProductGroup(){
		return	productGroupService.getProduct();
	}

}
