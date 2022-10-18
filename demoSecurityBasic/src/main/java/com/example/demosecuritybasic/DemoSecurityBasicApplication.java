package com.example.demosecuritybasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoSecurityBasicApplication  {

    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityBasicApplication.class, args);
    }
}
