package com.hee462.address.service.impl;

import org.springframework.stereotype.Service;

import com.hee462.address.models.UserDto;
import com.hee462.address.service.UserService;

@Service
public class UserServiceImplV1 implements UserService{

	@Override
	public UserDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userLogin(UserDto userDto) {
		// TODO Auto-generated method stub
		String username =userDto.getUsername();
		String password =userDto.getPassword();
		if(!username.equalsIgnoreCase("hee462")) {
			return "F_USERNAME";
		}else if(!password.equals("!aa1234")) {
			return "F_PASSWORD";
		}else {
			return "OK";
		}
	
	}

	@Override
	public int userJoin(UserDto userDto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
