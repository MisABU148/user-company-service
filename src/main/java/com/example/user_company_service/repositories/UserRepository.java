package com.example.user_company_service.repositories;

import com.example.user_company_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
