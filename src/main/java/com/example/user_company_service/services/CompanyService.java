package com.example.user_company_service.services;

import com.example.user_company_service.dto.CompanyDto;
import com.example.user_company_service.dto.mapping.CompanyMapping;
import com.example.user_company_service.models.Company;
import com.example.user_company_service.repositories.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyMapping companyMapping;

    public void createCompany(CompanyDto companyDTO) {
        Company newCompany = companyMapping.mapToCompanyEntity(companyDTO);
        companyRepository.save(newCompany);
    }

    public List<CompanyDto> readCompany() {
        return companyRepository.findAll().stream()
                .map(company -> companyMapping.mapToCompanyDto(company))
                .toList();
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    public void updateCompany(CompanyDto companyDto) {
        companyRepository.updateById(companyDto);
    }
}
