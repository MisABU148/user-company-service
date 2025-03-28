package com.example.user_company_service.repositories;

import com.example.user_company_service.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
//   Company findByCompanyName(String companyName);
}
