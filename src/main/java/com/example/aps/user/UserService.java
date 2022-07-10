package com.example.aps.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addNewUsers(User user) {

        Optional<User> nameExist = this.userRepository.finsUserbyname(user.getName());
        Optional<User> emailExist = this.userRepository.finsUserbyemail(user.getEmail());
        if (nameExist.isPresent() && emailExist.isPresent()) {
            throw new IllegalStateException("name or email taken");
        }
        this.userRepository.save(user);

    }

    @Transactional
    public void updateUser(Long userId, String name, String email) {
        User user = this.userRepository.findById(userId).orElseThrow(() -> new IllegalStateException("user with id " + userId + " does not exists"));

        if (name != null && name.length() > 0 && !Objects.equals(user.getName(), name)) {
            user.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
            user.setEmail(email);
        }
    }

    public void deleteUser(Long userId) {
        boolean exists = userRepository.existsById(userId);
        if (!exists) {
            throw new IllegalStateException("user with id " + userId + " does not exists");
        }
        this.userRepository.deleteById(userId);
    }

}