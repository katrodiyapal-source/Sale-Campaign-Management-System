package com.example.Sale_Campaign.repository;

import com.example.Sale_Campaign.model.CampaignProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignProductRepo extends JpaRepository<CampaignProducts,Long> {
}
