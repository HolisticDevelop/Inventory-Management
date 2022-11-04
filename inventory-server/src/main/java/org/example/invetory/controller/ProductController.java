package org.example.invetory.controller;


import org.example.invetory.entity.Product;
import org.example.invetory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @DeleteMapping
    public String deleteProduct(@RequestParam Long id){
        try {
            productService.deleteProduct(id);
            return "User successfully deleted.";
        }catch (Exception e){
            return "Error deleting product.";
        }
    }
}
