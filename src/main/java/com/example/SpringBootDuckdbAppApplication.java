package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(exclude = JdbcRepositoriesAutoConfiguration.class)
public class SpringBootDuckdbAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDuckdbAppApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        return (args) -> {
            // Fetch all users
            System.out.println("Users found with JdbcTemplate:");
            System.out.println("---------------------------");
            jdbcTemplate.query(
                "SELECT id, name, email FROM users",
                (rs, rowNum) -> new User(rs.getString("name"), rs.getString("email"))
            ).forEach(System.out::println);
            System.out.println();
        };
    }
}