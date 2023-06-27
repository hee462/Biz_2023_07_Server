package com.hee462.hello.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hee462.hello.models.UserDto;
import com.hee462.hello.service.UserService;
@Service
public class UserServiceImplV1 implements UserService{
	/*
	 * List<UserDto> userList 객체를 생성하고
	 * 임의로 생성한 3명의 User 정보를 add하기
	 * userList 리스트를 return 하기 
	 * 
	 * 
	 */
	@Override
	/*
	 * 
	 */
	public List<UserDto> selectAll() {
		List<UserDto> userList = new ArrayList<UserDto>();
		UserDto dto = new UserDto();
		
		// setter 사용하여 데이터 추가
		dto.setUsername("0001");
		dto.setPassword("1234");
		dto.setName("홍길동");
		dto.setTel("010-0000-0000");
		dto.setAddr("광주 광역시");
		dto.setAge(18);
		userList.add(dto);
		
		dto = new UserDto();
		dto.setUsername("0002");
		dto.setPassword("1234");
		dto.setName("홍길순");
		dto.setTel("010-1234-1234");
		dto.setAddr("광주 광역시");
		dto.setAge(18);
		userList.add(dto);
		
		dto = new UserDto();
		dto.setUsername("0003");
		dto.setPassword("1234");
		dto.setName("홍길영");
		dto.setTel("010-4567-4567");
		dto.setAddr("광주 광역시");
		dto.setAge(18);
		userList.add(dto);
		
		
		//field 생성자 사용하여 데이터 추가
		// field 생성자를 사용하는 경우 원하는 변수에 값이 정확하게 저장되는지 확인하기 어렵다
//		dto = new UserDto("ddd" ,"1234",
//				"임꺽정" ,"010-1111-1111","함경도",20);
//		userList.add(dto);
	
		return userList;
	}

	@Override
	public UserDto findById(String id) {
		
		return null;
	}

	@Override
	public int input(UserDto dto) {
		
		return 0;
	}

}
