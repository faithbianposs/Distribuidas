package com.example.catalog.service;

import com.example.catalog.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> list();

    public Optional<Product> getById(Integer id);

    public Product save(Product product);

    public Product update(Integer id, Product product);

    public void delete(Integer id);

}