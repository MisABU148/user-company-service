package com.example.user_company_service.configuration;

import com.example.user_company_service.models.Company;
import com.example.user_company_service.repositories.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class CompanyConfig {

    private static final Logger log = LoggerFactory.getLogger(CompanyConfig.class);

//    @Bean
//    CommandLineRunner commandLineRunner(CompanyRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(new  Company("Bavaria", 50000L)));
//            log.info("Preloading " + repository.save(new  Company("Test", 20000L)));
//        };

//        return args -> {
//            Company bava = new Company("Bavaria", 50000L);
//            repository.save(bava);
//        };
//    }
}
