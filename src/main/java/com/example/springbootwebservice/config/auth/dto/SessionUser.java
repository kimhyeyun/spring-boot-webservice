package com.example.springbootwebservice.config.auth.dto;

import com.example.springbootwebservice.domain.user.Users;
import lombok.Getter;

@Getter
public class SessionUser {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Users user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
