package edu.cafe.controller;


import edu.cafe.dto.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    List<Product> productList = new ArrayList<>();

    @GetMapping("/get-all-products")
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

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }

    @GetMapping("/get-all-product-names")
    public List<String> getAllProductNames(){
        List<String> productNameList = new ArrayList<>();

        productList.forEach(product -> {
            productNameList.add(product.getName());
        });

        return productNameList;
    }

    @DeleteMapping("/delete-product")
    public void deleteProduct(@RequestBody String id){
        for (int i=0; i<productList.size();i++){
            if (productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
    }


}


// http://localhost:8080/get-all-products
// http://localhost:8080/add-product
// http://localhost:8080/get-all-product-names
// http://localhost:8080/delete-product