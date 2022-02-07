package com.example.ecommerce.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.product;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
    ProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public product createProduct(@Validated @RequestBody product pro) {
	    return productService.createProduct(pro);
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public List<product> readProduct() {
	    return productService.getProducts();
	}
	
	@RequestMapping(value="/product/{productId}", method=RequestMethod.PUT)
	public product readProduct(@PathVariable(value = "productId") Long product_id, @RequestBody product productDetails) {
	    return productService.updateProduct(product_id, productDetails);
	}

	@RequestMapping(value="/product/{productId}", method=RequestMethod.DELETE)
	public void deleteProducts(@PathVariable(value = "productId") Long product_id) {
	    productService.deleteProduct(product_id);
	}

}
