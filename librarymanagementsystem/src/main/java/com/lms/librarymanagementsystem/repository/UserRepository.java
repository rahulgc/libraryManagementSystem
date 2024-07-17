package com.lms.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.librarymanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
