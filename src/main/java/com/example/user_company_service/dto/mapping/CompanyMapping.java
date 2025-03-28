package com.example.user_company_service.dto.mapping;

import com.example.user_company_service.dto.CompanyDTO;
import com.example.user_company_service.models.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapping {
    public CompanyDTO mapToProductDto(Company entity){
        CompanyDTO dto = new CompanyDTO();
        dto.setCompany_name(entity.getCompany_name());
        dto.setBudget(entity.getBudget());
        return dto;
    }
    public Company mapToProductEntity(CompanyDTO dto){
        Company entity = new Company();
        entity.setCompany_name(dto.getCompany_name());
        entity.setBudget(dto.getBudget());
        return entity;
    }
}
