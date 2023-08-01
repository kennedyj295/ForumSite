package org.kennedy.forum_api.controllers;

import org.kennedy.forum_api.models.User;
import org.kennedy.forum_api.repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UsersController {

    private final UserRepository repository;

    UsersController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }

    @GetMapping("/users/{username}")
    public Optional<User> getUserByUserName(@PathVariable String username) {
        return repository.findByUsername(username);
    }
}
