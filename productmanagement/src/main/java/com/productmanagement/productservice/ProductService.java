package com.productmanagement.productservice;

import com.productmanagement.entity.Product;

public interface ProductService {
	Product insertRecord(Product product);
	//void updateRecord(Sales s, int salesId);
	void deleteRecord(Product product, int productId);
	//Sales getRecord(int salesId);

}
