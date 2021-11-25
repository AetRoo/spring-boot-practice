package com.sda.practice.springbootpractice.models;

import lombok.Data;

/**
 * Login model for security
 */
@Data
public class Login {
    private String username;
    private String password;
}
