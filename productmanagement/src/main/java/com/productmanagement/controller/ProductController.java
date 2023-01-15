package com.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.entity.Product;
import com.productmanagement.productserviceimpl.ProductServiceImpl;
@RestController
public class ProductController {
	@Autowired
	ProductServiceImpl productServiceImpl;
	int saveProduct(Product product)
	{
		productServiceImpl.insertRecord(product);
	  return product.getProductId();
	}

	
}
