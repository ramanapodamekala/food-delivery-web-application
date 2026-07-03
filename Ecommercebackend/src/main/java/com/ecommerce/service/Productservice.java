package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.entity.*;
import com.ecommerce.repository.Productrepository;
import java.util.List;
@Service
public class Productservice {
	@Autowired
	private Productrepository repo;
	public Productclass
	saveProduct(Productclass product)
	{
		return
				repo.save(product);
	}
	public List<Productclass>getProducts(){
		return repo.findAll();
	}
	public void deleteProduct(int id)
	{
		if (repo.existsById(id))
		{
		repo.deleteById(id);
	}
	}
	public Productclass updateProduct(int id, Productclass product)
	{
	    Productclass old = repo.findById(id).get();

	    old.setName(product.getName());
	    old.setPrice(product.getPrice());

	    return repo.save(old);
	}
}
