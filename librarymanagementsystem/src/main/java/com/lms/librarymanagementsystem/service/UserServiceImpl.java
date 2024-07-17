package com.lms.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.librarymanagementsystem.entity.User;
import com.lms.librarymanagementsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository ur;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		ur.deleteById(userId);
	}

}
