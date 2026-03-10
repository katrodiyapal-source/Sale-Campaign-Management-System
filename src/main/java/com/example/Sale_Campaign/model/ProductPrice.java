package com.example.Sale_Campaign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "product_price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_price_id")
    private long id;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "product_id")
    private long productId;

    private double price;

}
