package com.example.user_company_service.services;

import com.example.user_company_service.dto.UserDto;
import com.example.user_company_service.dto.mapping.UserMapping;
import com.example.user_company_service.models.User;
import com.example.user_company_service.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapping userMapping;

    public void createUser(UserDto userDto) {
        User user = userMapping.mapToUserEntity(userDto);
        userRepository.save(user);
    }
    public List<UserDto> getUsers() {
        return userRepository.findAll().stream()
                .map(user -> userMapping.mapToUserDto(user))
                .toList();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateData(UserDto userDto) {
        userRepository.findAll().stream()
                .filter(user -> user.getFirstName().equals(userDto.getFirstName()))
                .filter(user -> user.getLastName().equals(userDto.getLastName()))
                .findFirst()
                .ifPresentOrElse(
                        company -> {
                            company.setPhoneNumber(userDto.getPhoneNumber());
                            userRepository.save(company);
                        },
                        () -> {
                            log.info("error");
                        }
                );
    }
}
