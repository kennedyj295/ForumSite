package org.kennedy.forum_api.dtos;

public class AccountResponseDTO {
    public AccountResponseDTO(String username, String jwt) {
        this.username = username;
        this.jwt = jwt;
    }

    public AccountResponseDTO(String jwt) {
        this.jwt = jwt;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    private String jwt;

}
