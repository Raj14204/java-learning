package com.prathamesh.SimpleWebApp.service;

import com.prathamesh.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.set;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "raa", 5000),
            new Product(102, "aaa", 120)
    ));
    public List<Product> getProduct(){
    return products;
    }

    public Product getProductById(int prodId) {
    return  products.stream().filter( p -> p.getProdId() == prodId).findFirst().orElse( new Product(100,"no Items",0));
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
    public void updateProduct(Product prod){
        int i=0;
        for(int ii=0;ii<products.size();ii++){

            if(products.get(ii).getProdId() == prod.getProdId()){
                i = ii;
             }
        }
        products.set(i,prod);
    }

    public void deleteProduct(int prodId) {
        int i=0;
        for(int ii=0;ii<products.size();ii++){

            if(products.get(ii).getProdId() == prodId){
                i = ii;
            }
        }

        products.remove(i);
    }
}
