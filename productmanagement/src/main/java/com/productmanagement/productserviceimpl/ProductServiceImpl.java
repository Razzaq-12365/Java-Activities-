package com.productmanagement.productserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.entity.Product;
import com.productmanagement.productrepository.ProductRepository;
import com.productmanagement.productservice.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	@Override
	public Product insertRecord(Product product) {
		
		 return productRepository.save(product);
	}

	@Override
	public void deleteRecord(Product product, int productId) {
		productRepository.deleteById(productId);
		
		
	}

}
