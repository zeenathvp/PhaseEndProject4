package com.simplilearn.phase4.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.phase4.model.User;
import com.simplilearn.phase4.repository.UserRepository;
import com.simplilearn.phase4.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(Long id) {
		return null;
	}

	@Override
	public User getUser(String userName) {
		return userRepository.findByUsername(userName);
	}

	@Override
	public void updateUser(Long id, User user) {
		Optional<User> optUser = userRepository.findById(id);
		if(optUser.isPresent()) {
			userRepository.save(user);
		}
	}

	@Override
	public void deleteUser(Long id) {
		
	}

}
