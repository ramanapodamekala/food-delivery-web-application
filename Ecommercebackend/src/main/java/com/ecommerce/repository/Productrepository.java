package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.entity.Productclass;

public interface 
Productrepository extends
JpaRepository<Productclass,
Integer>
{
	

}
