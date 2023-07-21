package com.hee462.book.service;

import java.util.List;

import com.hee462.book.models.UserDto;

public interface UserService {
	public List<UserDto> selectAll();
	public int insert(UserDto UserDto);
	public int update(UserDto UserDto);
	
}
