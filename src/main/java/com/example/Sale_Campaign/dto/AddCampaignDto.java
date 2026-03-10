package com.example.Sale_Campaign.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddCampaignDto {

    private LocalDate startDate;
    private LocalDate endDate;
    private String title;
    private List<CampaignProductDto> campaignProductsList;


}
