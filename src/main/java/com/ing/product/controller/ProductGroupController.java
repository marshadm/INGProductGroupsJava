package com.ing.product.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
		List<ProductsGroup> productsGroups = productGroupService.getProduct();
		Collections.sort(productsGroups);
		return productsGroups;
	}

	@PutMapping("/updateCount/{productId}")
    public List<ProductsGroup> updateCount(@PathVariable("productId") Long productId){
		ProductsGroup productsGroup = productGroupService.getProductGroup(productId);
		Long count = productsGroup.getCount()+1l;
		productsGroup.setCount(count.intValue());
		productGroupService.updateProductGroup(productsGroup);
		List<ProductsGroup> productsGroups = productGroupService.getProduct();
        Collections.sort(productsGroups);
		return productsGroups;
    }

}
