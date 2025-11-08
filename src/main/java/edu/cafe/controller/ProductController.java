package edu.cafe.controller;


import edu.cafe.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    List<Product> productList = new ArrayList<>();

    @GetMapping("/get-all")
    public List<Product> getProductList(){
        productList.add(new Product(
                "P001",
                "Kokowa",
                2500.0,
                30
        ));

        productList.add(new Product(
                "P002",
                "Banana",
                500.0,
                50
        ));

        return productList;
    }

    @PostMapping("/add-customer")
    public Product addProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }





}
