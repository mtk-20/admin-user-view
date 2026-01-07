package com.example.admin_user_views.service.impl;

import com.example.admin_user_views.dto.UserRequest;
import com.example.admin_user_views.entity.User;
import com.example.admin_user_views.exception.ConflictException;
import com.example.admin_user_views.exception.NotFoundException;
import com.example.admin_user_views.repository.UserRepo;
import com.example.admin_user_views.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo repo;
//    private final PasswordEncoder passwordEncoder;

    @Override
    public void createUser(UserRequest request) {
        User user = new User();
        if (repo.existsByUserName(request.getUserName())) {
            throw new ConflictException("User Name Already Exists.");
        } else {
            user.setUserName(request.getUserName());
        }
//        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setPassword(request.getPassword());
        user.setRoleUser(request.getRoleUser());
        repo.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found!"));
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

}
