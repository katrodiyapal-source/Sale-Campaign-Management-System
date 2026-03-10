package com.example.Sale_Campaign.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;

    private String title;

    @Column(name = "mrp")
    private double MRP;

    @Column(name = "current_price")
    private double currentPrice;

    private double discount;

    private int stock;





}
