package com.kay.serverproductmanagement.service;

import com.kay.serverproductmanagement.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long productId);

    Long numberOfProducts();

    List<Product> findAllProducts();
}
