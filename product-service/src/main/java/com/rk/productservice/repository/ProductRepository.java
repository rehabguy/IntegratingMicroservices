package com.rk.productservice.repository;

import com.rk.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository< Product,String> {

}
