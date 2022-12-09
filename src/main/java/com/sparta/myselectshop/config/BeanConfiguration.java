/*
package com.sparta.myselectshop.config;

import com.sparta.myselectshop.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ProductRepository productRepository() {
        String dbUrl = "jdbc:h2:mem:db";
        //jdbc:h2:mem:db;MODE=MYSQL;
        String username = "sa";
        String password = "";
        return new ProductRepository(dbUrl, username, password);
    }
}*/
