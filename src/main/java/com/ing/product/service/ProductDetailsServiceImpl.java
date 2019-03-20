package com.ing.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.product.dao.ProductDetailsDao;
import com.ing.product.model.ProductDetails;
import com.ing.product.model.ProductDetailsVO;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	
	@Autowired
	private ProductDetailsDao pdd;

	@Override
	public List<ProductDetails> getProductDetails( Long id) {
		
		List<ProductDetails> pdArr = pdd.findByProductId(id);
		List<ProductDetails> pdArr1 = new ArrayList<ProductDetails>();
		//List<ProductDetails> pdArr = pdd.findByProductId();
		ProductDetails pd = null;
		ProductDetailsVO pdv = new ProductDetailsVO();
		/*
		 * try { pd = pdArr.get(0); System.out.println(pd); }
		 * 
		 * catch(Exception e) { System.out.println("exception"); }
		 */
		
		/*
		 * if(pd != null) { System.out.println("data"); pdv.setId(pd.getId());
		 * pdv.setName(pd.getName()); pdv.setValue(pd.getValue()); }
		 */
		for(ProductDetails pds : pdArr) {
			if(pds.getProductId() == id)
				pdArr1.add(pds);
		}
		return pdArr1;
	}
}
