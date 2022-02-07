package com.example.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.product;
import com.example.ecommerce.repository.ProductRepository;
import java.util.*;

@Service
public class ProductService {
	@Autowired
    ProductRepository productRepository; 
	
	//CREATE 
	public product createProduct(product pro) {
	    return productRepository.save(pro);
	}

	//READ
	public List<product> getProducts() {
	    return productRepository.findAll();
	}
	

	// DELETE
	public void deleteProduct(Long productid) {
	    productRepository.deleteById(productid);
	}
	
	// UPDATE
	public product updateProduct(Long productId, product productDetails) {
		product pro = productRepository.findById(productId).get();
	    pro.setId(productDetails.getId());
	    pro.setProductName(productDetails.getProductName());
	    pro.setDescription(productDetails.getDescription());
	    pro.setManufacturer(productDetails.getManufacturer());
	    pro.setSeller(productDetails.getSeller());
	    pro.setPrice(productDetails.getPrice());
	    pro.setCategory_id(productDetails.getCategory_id());
	    pro.setQuanity(productDetails.getQuanity());
	    return productRepository.save(pro);                                
	}
	
	
}
