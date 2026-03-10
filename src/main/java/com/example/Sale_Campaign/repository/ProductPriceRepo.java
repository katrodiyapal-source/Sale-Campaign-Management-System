package com.example.Sale_Campaign.repository;

import com.example.Sale_Campaign.model.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepo extends JpaRepository<ProductPrice,Long> {
}
