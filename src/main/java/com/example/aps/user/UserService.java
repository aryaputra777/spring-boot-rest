package com.example.aps.user;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {

    public List<User> getStudents(){
        return List.of(
                new User(1L, "Arya", "putraarya@mail.com","0121433", "password" , LocalDate.of(1992, Month.DECEMBER, 12))
        );
    }
}
