package com.example.user_company_service.repositories;

import com.example.user_company_service.dto.CompanyDto;
import com.example.user_company_service.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long> {
    @Modifying
    @Query(value = "UPDATE company SET company_name = :#{#companyDto.company_name}, " +
            "budget = :#{#companyDto.budget} " +
            "WHERE id = :#{#companyDto.id}", nativeQuery = true)
    void updateById(@Param("companyDto") CompanyDto companyDto);

    Optional<Company> findById(Long id);
}
