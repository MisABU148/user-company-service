package com.example.user_company_service.dto.mapping;

import com.example.user_company_service.dto.UserDto;
import com.example.user_company_service.models.User;
import com.example.user_company_service.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapping {
    @Autowired
    private CompanyRepository repository;
    public UserDto mapToUserDto(User entity) {
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setCompanyId(entity.getCompany().getId());
        dto.setCompanyName(entity.getCompany().getCompany_name());
        return dto;
    }
    public User mapToUserEntity(UserDto dto) {
        User entity = new User();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setCompany(repository.findById(dto.getCompanyId())
                .orElseThrow());
        return entity;
    }
}
