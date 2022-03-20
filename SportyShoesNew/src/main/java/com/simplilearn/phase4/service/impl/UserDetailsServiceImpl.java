package com.simplilearn.phase4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.simplilearn.phase4.model.User;
import com.simplilearn.phase4.repository.UserRepository;
import com.simplilearn.security.MyUserDetails;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User databaseUser = userRepository.findByUsername(username);
		
		if (databaseUser == null) {
			throw new UsernameNotFoundException("Cannot find the User!");
		}
		System.out.println("the role issssssss "+ databaseUser.getRole());
		if(!databaseUser.getRole().equals("ADMIN")) {
			throw new UsernameNotFoundException("User not Admin!");
		}

		return new MyUserDetails(databaseUser);
	}
}