package com.example.aps.user;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence")
    private Long id;

    private String name;
    private String email;
    private String handphone;
    private String password;

    private LocalDate createddate;

    public User() {}

    public User(Long id, String name, String email, String handphone, String password, LocalDate createddate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.handphone = handphone;
        this.password = password;
        this.createddate = createddate;
    }

    public User(String name, String email, String handphone, String password, LocalDate createddate) {
        this.name = name;
        this.email = email;
        this.handphone = handphone;
        this.password = password;
        this.createddate = createddate;
    }



    public LocalDate getCreateddate() {
        return createddate;
    }

    public void setCreateddate(LocalDate createddate) {
        this.createddate = createddate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandphone() {
        return handphone;
    }

    public void setHandphone(String handphone) {
        this.handphone = handphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", handphone='" + handphone + '\'' +
                ", password='" + password + '\'' +
                ", createddate=" + createddate +
                '}';
    }
}
