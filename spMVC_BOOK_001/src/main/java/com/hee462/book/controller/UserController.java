package com.hee462.book.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.book.models.UserDto;
import com.hee462.book.models.bookDto;
import com.hee462.book.service.UserService;

public class UserController {
	
	
	protected final UserService userservice;
	
	
	
	
	public UserController(UserService userservice) {
		this.userservice = userservice;
	}


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( UserDto userDto, Model model) {
		List<UserDto> userList = userservice.selectAll();
		model.addAttribute("USER_LIST" ,userDto);

		return "home";
	}
	

	@RequestMapping(value = "/user_list" , method = RequestMethod.POST)
	public String input(UserDto userDto ,Model model){
		int result = userservice.insert(userDto);
		model.addAttribute("USER",userDto);
		return "user_list";
	}
}
