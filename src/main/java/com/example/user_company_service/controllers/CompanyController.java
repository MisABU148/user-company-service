package com.example.user_company_service.controllers;

import com.example.user_company_service.dto.CompanyDTO;
import com.example.user_company_service.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/create")
    private String createCompany(@RequestBody CompanyDTO companyDTO
    ) {
        companyService.createCompany(companyDTO);
        return "created";
    }
    @GetMapping("/read")
    private List<CompanyDTO> readCompany() {
        return companyService.readCompany();
    }

    @DeleteMapping("/delete/{id}")
    private String deleteCompany(@PathVariable("id") Long id) {
        companyService.deleteCompany(id);
        return "deleted";
    }
    @PutMapping("/update")
    public String updateCompany(@RequestBody CompanyDTO companyDTO) {
        companyService.updateCompany(companyDTO);
        return "company updated";
    }
}
