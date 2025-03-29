package com.example.user_company_service.controllers;

import com.example.user_company_service.dto.CompanyDTO;
import com.example.user_company_service.dto.UserDto;
import com.example.user_company_service.models.User;
import com.example.user_company_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String createUser(@RequestBody UserDto user) {
        userService.createUser(user);
        return "user creasted";
    }

    @GetMapping("/read")
    public List<UserDto> readUser() {
        return userService.getUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    @PutMapping("/update")
    public void updateCompany(@RequestBody UserDto userDto) {
        userService.updateData(userDto);
    }
}
