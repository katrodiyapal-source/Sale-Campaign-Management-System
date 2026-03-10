package com.example.Sale_Campaign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "campaign_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CampaignProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    private double discount;
}
