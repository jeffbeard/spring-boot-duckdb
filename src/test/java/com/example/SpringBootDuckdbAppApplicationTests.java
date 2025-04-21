package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@ActiveProfiles("test")
class SpringBootDuckdbAppApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        // Basic test to verify context loading
    }
    
    @Test
    void shouldFindUsers() {
        List<User> users = jdbcTemplate.query(
            "SELECT id, name, email FROM users",
            (rs, rowNum) -> {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                return user;
            }
        );
        
        assertFalse(users.isEmpty(), "User list should not be empty");
    }
}