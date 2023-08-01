package org.kennedy.forum_api.controllers;

import org.kennedy.forum_api.dtos.AccountResponseDTO;
import org.kennedy.forum_api.dtos.RegisterDTO;
import org.kennedy.forum_api.models.User;
import org.kennedy.forum_api.services.AccountService;
import org.kennedy.forum_api.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.kennedy.forum_api.dtos.UserDTO;

@RestController
@RequestMapping("/account")
@CrossOrigin("*")
public class AccountController {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private AccountService acctService;

    @PostMapping ("/login")
    public AccountResponseDTO login(@RequestBody UserDTO body){
        AccountResponseDTO loginResponse = authenticationService.loginUser(body.getUsername(), body.getPassword());
        return loginResponse;
    }

    @PostMapping("/register")
    public RegisterDTO registerUser(@RequestBody RegisterDTO rDTO) {
        User registeredUser = acctService.registerUser(rDTO.getUsername(), rDTO.getPassword());

        return new RegisterDTO(registeredUser.getUsername());

        //TODO: give user JWT after logging in
    }

    //TODO: implement a method to add admin role for regular user
}
