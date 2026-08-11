package com.nit.product.service;

import com.nit.product.bean.*;

interface ProductDao {
	
	public void addProduct(Product p);
	
	public void updateProduct(Product p);
	public void deleteProduct(int id);
	public void getProductById(int id);
	public void getAllProducts();

}
