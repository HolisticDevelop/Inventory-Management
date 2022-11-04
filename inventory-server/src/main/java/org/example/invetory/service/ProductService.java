package org.example.invetory.service;

import org.example.invetory.entity.Product;
import org.example.invetory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>) productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return  productRepository.save(product);
    }

    public void deleteProduct(Long id)  {
        productRepository.deleteById(id);
    }
}
