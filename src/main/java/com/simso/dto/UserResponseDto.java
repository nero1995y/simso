package com.simso.dto;

import com.simso.domain.User;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class UserResponseDto {

    private Long id;
    private String username;
    private String password;

    public UserResponseDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
    }
}
