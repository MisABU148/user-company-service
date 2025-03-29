package com.example.user_company_service.repositories;

import com.example.user_company_service.dto.UserDto;
import com.example.user_company_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select u.first_name from users u where id=302", nativeQuery = true)
    String findUserName();
}
