package com.ecommerce.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;
	import com.ecommerce.entity.Productclass;
	import com.ecommerce.service.Productservice;
    import java.util.List;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PutMapping;
	@RestController
	@RequestMapping("/products")
	public class ProductController {

	    @Autowired
	    private Productservice service;

	    @PostMapping
	    public Productclass 
	    saveProduct(@RequestBody 
	    		Productclass product) {

	        return service.saveProduct(product);
	    }
	        @GetMapping
	        public List<Productclass>
	        getproducts()
	        {
	        	return service.getProducts();
	        }
	        @DeleteMapping("/{id}")
	        public String 
	        deleteProduct(@PathVariable ("id")int id) 
	        {
	        	service.deleteProduct(id);
	        	return"Product Deleted";
	        }
	        @PutMapping("/{id}")
	        public Productclass updateProduct(@PathVariable("id") int id,
	                @RequestBody Productclass product)
	        {
	            return service.updateProduct(id, product);
	        }
	    }
	

