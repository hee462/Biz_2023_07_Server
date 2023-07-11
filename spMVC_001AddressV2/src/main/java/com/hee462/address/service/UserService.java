package com.hee462.address.service;

import com.hee462.address.models.UserDto;

public interface UserService {
	
	public UserDto findById(String id);
	
	public String userLogin(UserDto userDto);
	
	public int userJoin(UserDto userDto);

}
