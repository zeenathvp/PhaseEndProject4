package com.simplilearn.phase4.service;

import java.util.List;

import com.simplilearn.phase4.model.User;

public interface UserService {
	//CREATE
	User createUser(User user);

	//READ
	List<User> getUsers();
	User getUser(Long id);
	User getUser(String userName);

	//UPDATE
	void updateUser(Long id, User user);

	
	//DELETE
	void deleteUser(Long id);
}
