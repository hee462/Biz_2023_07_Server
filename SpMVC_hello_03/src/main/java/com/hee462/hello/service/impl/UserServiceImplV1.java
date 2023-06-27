package com.hee462.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hee462.hello.service.UserService;

@Service
public class UserServiceImplV1 implements UserService{
	
	protected List<String>strList;
	
	@Override
	public List<String> selectAll() {
		strList = new ArrayList<String>();
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		return strList;
	}

	@Override
	public String findByName(String name) {
		
		return null;
	}

}
