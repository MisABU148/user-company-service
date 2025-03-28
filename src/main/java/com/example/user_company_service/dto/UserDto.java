package com.example.user_company_service.dto;

import lombok.Data;

@Data
public class UserDto {
    String firstName;
    String lastName;
    String phoneNumber;
    Long company;
}
