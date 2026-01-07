package com.example.admin_user_views.controller;

import com.example.admin_user_views.dto.UserRequest;
import com.example.admin_user_views.entity.User;
import com.example.admin_user_views.response.ApiResponse;
import com.example.admin_user_views.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    @PostMapping("/create")
    public ResponseEntity<?> handleCreateUser(@RequestBody UserRequest request) {
        service.createUser(request);
        log.info("User {} saved", request.getUserName());
        return ResponseEntity.status(HttpStatus.CREATED).body("User Created For " + request.getUserName());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> handleGetUser(@PathVariable("id") Long id) {
        User user = service.getUserById(id);
        log.info("User Id {} fetched", id);
        return ResponseEntity.ok().body(ApiResponse.success(HttpStatus.OK, user));
    }

    @GetMapping
    public ResponseEntity<?> handleGetALl() {
        List<User> user = service.getAll();
        return ResponseEntity.ok().body(ApiResponse.success(HttpStatus.FOUND, user));
    }
}
