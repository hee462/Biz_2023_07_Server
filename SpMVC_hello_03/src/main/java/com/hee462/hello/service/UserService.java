package com.hee462.hello.service;

import java.util.List;




public interface UserService {
	
	public List<String> selectAll();
	public String findByName(String name);
	
	
	

}
