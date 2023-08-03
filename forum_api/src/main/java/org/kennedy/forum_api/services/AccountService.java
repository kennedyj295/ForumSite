package org.kennedy.forum_api.services;

import org.kennedy.forum_api.dtos.UserDTO;
import org.kennedy.forum_api.models.Role;
import org.kennedy.forum_api.models.User;
import org.kennedy.forum_api.repository.RoleRepository;
import org.kennedy.forum_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AccountService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        Role userRole = roleRepository.findByAuthority("USER").get();
        Set<Role> authorities = new HashSet<>();
        authorities.add(userRole);

        User registeredUser = new User(username, encodedPassword, authorities);

        return userRepository.save(registeredUser);
    }
}
