package com.mywebsite.emusicstore;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mywebsite.DAO.ProductDAO;
import com.mywebsite.product.Product;

@Controller
@RequestMapping("/music")
public class musiccontroller {

	private ProductDAO prodao= new ProductDAO();
	
	
	@RequestMapping("root")
	public String mainpage() {
		return "test";
	}
	
	@RequestMapping("products")
	public String getproducts(Model model) {
		
		List<Product> products = prodao.getproducts();
		
		
		model.addAttribute("product",products);
		return "productslist";
	}
	
	
	@RequestMapping("/productdescription/{id}")
	
	public String getProductById(@PathVariable String id, Model model)  throws IOException{
		
	Product product = prodao.getProductById(id);
	
	model.addAttribute(product);
	
	return "productdescription";
		
		
	}
	
	
}
