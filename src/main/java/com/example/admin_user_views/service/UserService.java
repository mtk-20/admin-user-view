package com.example.admin_user_views.service;

import com.example.admin_user_views.dto.UserRequest;
import com.example.admin_user_views.entity.User;

public interface UserService {

    void createUser(UserRequest request);

    User getUserById(Long id);
}
