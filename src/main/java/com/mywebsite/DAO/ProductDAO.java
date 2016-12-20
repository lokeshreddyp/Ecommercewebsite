package com.mywebsite.DAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mywebsite.product.Product;

public class ProductDAO {

	
	private List <Product> productlist;
	
	
	public List<Product> getproducts() {
		Product productobj = new Product();
		Product productobj1 = new Product();
	
		
		productobj.setId("1");
		productobj.setProductCategory("Instrument");
		productobj.setProductCondition("new");
		//productobj.setProductDescription("this is a good project");
		//productobj.setProductManufacturer("lokesh");
		productobj.setProductName("GUITAR");
		productobj.setProductPrice(190.98);
		//productobj.setProductStatus("available");
		//productobj.setUnitInStock(1);
		
		
		
productobj1.setId("2");
		productobj1.setProductCategory("Test");
		productobj1.setProductCondition("old");
		//productobj.setProductDescription("this is a good project");
		//productobj.setProductManufacturer("lokesh");
		productobj1.setProductName("Lotar");
		productobj1.setProductPrice(1989.98);
		
		
		productlist = new ArrayList<Product>();
		
		
		
		productlist.add(productobj);
		productlist.add(productobj1);
		return productlist;
		
		
	}


	public Product getProductById(String id) throws  IOException{
		for(Product product :getproducts()) {
			if(product.getId().equals(id)) {
				return product;
			}
		}
		
		throw new IOException();
	}


	
	
}
