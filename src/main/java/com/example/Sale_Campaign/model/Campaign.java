package com.example.Sale_Campaign.model;

import com.example.Sale_Campaign.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "campaign_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private long campaignId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate ebdDate;

    private String title;

    @OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL)
    private List<CampaignProducts> productsList;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status = Status.UPCOMING;





}

