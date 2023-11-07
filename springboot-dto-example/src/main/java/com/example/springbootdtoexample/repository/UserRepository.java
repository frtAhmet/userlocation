package com.example.springbootdtoexample.repository;

import com.example.springbootdtoexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
