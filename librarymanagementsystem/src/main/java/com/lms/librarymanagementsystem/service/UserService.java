package com.lms.librarymanagementsystem.service;

import java.util.List;

import com.lms.librarymanagementsystem.entity.User;

public interface UserService {

	public List<User> findAll();
	public User save(User user);
	public void deleteUser(Long userId);
}
