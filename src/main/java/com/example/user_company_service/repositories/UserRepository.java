package com.example.user_company_service.repositories;

import com.example.user_company_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("select g from users u " +
//            "inner join AdditionalAttributeString aas on aas.docId = g.id " +
//            "where " +
//            "aas.code = :code " +
//            "and aas.stringValue = :stringValue ")
//    List<User> findAllByAdditionalStringAttribute(@Param("code") String code, @Param("stringValue") String stringValue);
}
