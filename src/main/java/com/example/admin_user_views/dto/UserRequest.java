package com.example.admin_user_views.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank(message = "Username is required")
    @Size(min = 3, message = "Username must be between 3 and 50 characters")
    private String userName;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Role is required")
    private String roleUser;
}
