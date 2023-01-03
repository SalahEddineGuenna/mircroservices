package org.sid.inventoryservice.controller;

import org.springframework.core.env.Environment;
import org.sid.inventoryservice.beans.ProductBean;
import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {

    @Autowired
    Environment environment;

    @Autowired
    ProductRepository productRepository;

@GetMapping("/products/{id}")
    public ProductBean checkProduct(@PathVariable Long id){

    Product product=productRepository.findProductById(id);

    ProductBean productBean=new ProductBean(
            product.getId(),
            product.getName(),
            product.getPrice(),
            product.getQuantity(),
            Integer.parseInt(environment.getProperty("local.server.port"))
    );

    return productBean;
}
}
