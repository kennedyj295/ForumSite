package org.kennedy.forum_api.dtos;

public class RegisterDTO {

    public RegisterDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public RegisterDTO(String username) {
        this.username = username;
    }
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
