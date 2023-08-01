package org.kennedy.forum_api.services;

import org.kennedy.forum_api.dtos.AccountResponseDTO;
import org.kennedy.forum_api.dtos.UserDTO;
import org.kennedy.forum_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    public AccountResponseDTO loginUser(String username, String password) {
        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            String jwt = tokenService.generateJwt(auth);

            return new AccountResponseDTO(username, jwt);
        } catch (Exception e) {
            return new AccountResponseDTO(" ");
            //TODO: set up proper HTTP response
        }
    }

}
