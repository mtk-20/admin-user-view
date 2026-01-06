package com.example.admin_user_views.repository;

import com.example.admin_user_views.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    boolean existsByUserName(String userName);
}
