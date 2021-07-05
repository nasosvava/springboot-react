package com.kay.serverproductmanagement.repository;

import com.kay.serverproductmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
