package org.kennedy.forum_api.dtos;

import org.kennedy.forum_api.models.User;

public class UserDTO {

    private String username;

    private String password;

    public UserDTO(String username, String password, String jwt){
        this.username = username;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
