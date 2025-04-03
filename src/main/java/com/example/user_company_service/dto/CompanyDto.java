package com.example.user_company_service.dto;

import lombok.Data;

import java.util.List;

@Data
public class CompanyDto {
    private Long id;
    private String company_name;
    private Long budget;
    private List<Long> employeeId;
    private List<String> employeeName;
}
