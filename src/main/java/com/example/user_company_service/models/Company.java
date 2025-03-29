package com.example.user_company_service.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Table(name = "COMPANY")
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
    private String budget;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "company", orphanRemoval = false)
    private List<User> employee;

    public Company(String company_name, String budget) {
        this.company_name = company_name;
        this.budget = budget;
    }

    public Company() {
    }
}
