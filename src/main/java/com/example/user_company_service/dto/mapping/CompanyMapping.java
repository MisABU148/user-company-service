package com.example.user_company_service.dto.mapping;

import com.example.user_company_service.dto.CompanyDto;
import com.example.user_company_service.models.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapping {
    public CompanyDto mapToCompanyDto(Company entity){
        CompanyDto dto = new CompanyDto();
        dto.setId(entity.getId());
        dto.setCompany_name(entity.getCompany_name());
        dto.setBudget(entity.getBudget());
        dto.setEmployeeName(entity.getEmployee().stream()
                .map(user -> user.getFirstName()+" "+user.getLastName()).toList());
        return dto;
    }
    public Company mapToCompanyEntity(CompanyDto dto){
        Company entity = new Company();
        entity.setCompany_name(dto.getCompany_name());
        entity.setBudget(dto.getBudget());
        return entity;
    }
}
