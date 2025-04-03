package com.example.user_company_service.dto;

import lombok.Data;

@Data
public class UserDto {
    Long id;
    String firstName;
    String lastName;
    String phoneNumber;
    Long companyId;
    String companyName;
}
