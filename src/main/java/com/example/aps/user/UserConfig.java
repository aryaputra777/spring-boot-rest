package com.example.aps.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User arya = new  User(1L, "Arya", "putraarya@mail.com","0121433", "password" , LocalDate.of(1992, Month.DECEMBER, 12));
            User putra = new  User(2L, "Putra", "putraarya@mail.com","0121433", "password" , LocalDate.of(1992, Month.DECEMBER, 12));

            userRepository.saveAll(List.of(arya, putra));
        };
    }
}
