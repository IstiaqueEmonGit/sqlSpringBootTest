package com.example.mysqltest.persistence;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Entity
public class SalesRecordResult {
    @Column(insertable=false, updatable=false, name = "journey_date")
    private Date journeyDate;
    @Id
    @Column(insertable=false, updatable=false,name = "journey_year")
    private int journeyYear;
    @Column(insertable=false, updatable=false,name = "journey_month")
    private int journeyMonth;
    @Column(insertable=false, updatable=false,name = "company_id")
    private int companyId;
    @Column(insertable=false, updatable=false,name = "company_name")
    private String companyName;
    @Column(insertable=false, updatable=false,name = "coach_type_id")
    private int coachTypeId;
    @Column(insertable=false, updatable=false,name = "coach_type_title")
    private String coachTypeTitle;
    @Column(insertable=false, updatable=false,name = "is_online")
    private boolean isOnline;
    @Column(insertable=false, updatable=false,name = "payment_method_title")
    private String paymentMethodTitle;
    @Column(insertable=false, updatable=false,name = "customer_gender")
    private String customerGender;
    @Column(insertable=false, updatable=false,name = "order_count")
    private int orderCount;
    @Column(insertable=false, updatable=false,name = "total_revenue")
    private Double totalRevenue;
    // Getters and setters

    @Override
    public String toString() {
        return "SalesRecordResult{" +
                "journeyYear=" + journeyYear +
                ", companyName='" + companyName + '\'' +
                ", journeyDate=" + journeyDate +
                ", journeyMonth=" + journeyMonth +
                ", companyId=" + companyId +
                ", coachTypeId=" + coachTypeId +
                ", coachTypeTitle='" + coachTypeTitle + '\'' +
                ", isOnline=" + isOnline +
                ", paymentMethodTitle='" + paymentMethodTitle + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", orderCount=" + orderCount +
                ", totalRevenue=" + totalRevenue +
                '}';
    }

}


