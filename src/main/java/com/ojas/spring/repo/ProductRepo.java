package com.ojas.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.spring.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
