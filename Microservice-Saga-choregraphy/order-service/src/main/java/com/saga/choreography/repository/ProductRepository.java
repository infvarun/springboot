package com.saga.choreography.repository;

import com.saga.choreography.entity.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Products, Long> {
    // Define custom query methods if needed
    // Custom query method to find products with prices lower than a given threshold
    @Query("SELECT p FROM Products p WHERE p.price < "+500)
    List<Products> findProductsByPriceLowerThan();
}
