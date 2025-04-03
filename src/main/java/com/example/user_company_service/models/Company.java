package com.example.user_company_service.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "budget")
    private Long budget;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<User> employee;

    public Company() {
    }
}
