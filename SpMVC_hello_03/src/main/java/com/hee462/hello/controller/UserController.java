package com.hee462.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * client의 요청을 제일먼저 수신하여 처리하는 클래스
 */

import com.hee462.hello.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	/*
	 * Spring project에서는 Service 객체를 생성할때
	 * Service 클래스의 생성자를 사용하지 않는다
	 * Service 클래스에 @Service Annotation을 부착하고
	 * 사용할 Service 객체에 @Autowired Annotation을 부착한다
	 * 
	 */
	@Autowired
	protected UserService userService;
//*************** 스프링에서는 생성자를 이용해서 만들지 않는다.*********
//	public UserController() {
//		userSerivce = new UserServiceImplV1();
//	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(){
		List<String> strList = userService.selectAll();
		return strList.get(0);
	}
	
	// RequestMethod.GET :데이터나 화면을 보여주는 용도
	@RequestMapping(value="/join",method = RequestMethod.GET)
	public String join() {
		
		
		
		//view/user/join.jsp 파일을 client 보내라
		return"/user/join";
	}
	//RequestMethod.POST : client에서 데이터를 보내는 용도
	// CRUD 에서 Create(Insert)를 하기위한 데이터를 받는 용도
	@RequestMapping(value="/join" , method=RequestMethod.POST)
	public String join(Model model) {
		
		return "/user/join";
	}
	
}
