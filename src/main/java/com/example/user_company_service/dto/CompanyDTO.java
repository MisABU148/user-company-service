package com.example.user_company_service.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompanyDTO {
    private String company_name;
    private String budget;
    private List<String> employee;
}
