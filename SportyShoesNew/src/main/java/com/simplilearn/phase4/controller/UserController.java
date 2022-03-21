package com.simplilearn.phase4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.phase4.model.User;
import com.simplilearn.phase4.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value = "/UserReg", method = RequestMethod.GET)
	public String UserRegistration(Model model) {
		return "UserReg";
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String AddUser(@RequestParam(value="userName") String userName,@RequestParam(value="password") String password,Model model) {	
		if(userName == null || userName.trim()=="" || password == null || password.trim()=="") {
			return "error";
		}
		User user = new User(userName,passwordEncoder.encode(password),"USER");
		userService.createUser(user);
		model.addAttribute("message", "User Succesfully Added");
		return "/login";
	}
	
	@RequestMapping(value = "/vwChangePassword", method = RequestMethod.GET)
	public String vwChangePassword(Model model) {		
		return "ChangePassword";
	}
	
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public String ChangePassword(@RequestParam(value="password") String password,Model model) {
		if(password == null || password.trim()=="") {
			return "error";
		}
		String username ="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			username = ((UserDetails)principal).getUsername();
		} else {
			username = principal.toString();
		}
		User user = userService.getUser(username);
		User updateUser = new User(user.getId(),username,passwordEncoder.encode(password),"ADMIN");
		userService.updateUser(user.getId(), updateUser);
		return "home";
	}
	
	@RequestMapping(value = "/vwSearchUsers", method = RequestMethod.GET)
	public String vwSearchUsers(Model model) {	
		List<User> userList = userService.getUsers();
		model.addAttribute("userList", userList);
		return "SearchUsers";
	}
	
	@RequestMapping(value = "/searchUserbyName", method = RequestMethod.POST)
	public String searchUserbyName(@RequestParam(value="userName") String userName,Model model) {	
		User user = userService.getUser(userName);
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		model.addAttribute("userList", userList);
		return "SearchUsers";
	}
}
