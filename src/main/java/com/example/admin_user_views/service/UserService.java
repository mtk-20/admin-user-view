package com.example.admin_user_views.service;

import com.example.admin_user_views.dto.UserRequest;
import com.example.admin_user_views.entity.User;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface UserService {

    void createUser(UserRequest request);

    User getUserById(Long id);

    List<User> getAll();
}
