package com.dio.live3.productcatalog.repository;

import com.dio.live3.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
