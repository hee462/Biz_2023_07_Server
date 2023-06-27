package com.hee462.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.hello.models.UserDto;

import lombok.extern.slf4j.Slf4j;
/*
 * class를 만들고 @Controller라는 Annotation 을 부착하면
 * Spring Framework에서 자동으로 이 클래스를  Controller 기능을 부여한다
 * 
 * Controller class는 web Application 에서 Request를 가장먼저 수신하는 객체이다
 * 
 * 이 클래스에 method를 선언하고 method에 @Request Annotation을 부착하면 
 * web 의 URL(URI)를 처리하는 method가 된다
 * 
 */
@Slf4j
@Controller
public class UserController {
	
	//http://localhost:8080/hello/user/login 으로 Request를 하면 처리할 method이다 라는 선언
	
	
	/* method=GET
	 * Browser 의 주소창에 URL을 입력하여 요청
	 * 또는 a tag의 href 에 주소를 연결하거나 요청
	 * 일반적인(결과) 화면을 요청하거나 할때
	 * 
	 */
	
	@RequestMapping(value ="/user/login" ,method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	/*
	 *
	 * method =POST
	 * form으로 감싼 input data를 보낼때 주로 사용
	 * form tag의 method 속성을 반드시 POST 로 지정해야 한다
	 * 데이터를 서버로 보낼때 사용하는 Request
	 */
	
	// client(web)에서 보낸 username 변수, password 변수에 담긴 데이터를 받을때는
	// method의 매개변수를 설정해 주면된다.
	@RequestMapping(value="/user/login" , method=RequestMethod.POST)
	public String login( String username, String password , Model model) {
		
		model.addAttribute("name" , username);
		model.addAttribute("password" , password);
		
		return "login_OK";
	
	}
	
	
	
	//  회원가입 form 보여줌 (입력창보여줌)
	@RequestMapping(value="/user/join" ,method=RequestMethod.GET)
	public String join() {
		return null;
	}
	
	/*
	 * method에서 String 값을 return 하면 views 폴더에서 
	 * 해당 Stirng의  jsp 파일을 찾아rendering을 실행함
	 *  
	 *  method 에서 null 값을 return 하면
	 *  views 폴더에서 RequestMapping 과 같은 path 위치에서 jsp 파일을 찾는다
	 *  => /views/user/join.jsp
	 */

	// 입력받은 from을 다시 보여줌
	/*
	 * Spring 에서 web에서 여러가지데이터를 받을 경우
	 * 모든 변수를 매개변수로 선언하지 않고,
	 * Dto class를 선언하고 Dto 클래스, 객체를 매개변수로 선언한다
	 * @ModelAttribute 속성을 지정한다
	 * 
	 *  Spring framework 의 도구들이 form에 전달된 데이터를
	 *  Dto 객체에 자동으로 담아준다
	 *  
	 *  "Java 코딩에서 method 에 전달할 데이터(변수)가 2개를 초과하면
	 *  무조건 Dto를 만들자"
	 *  
	 *  @ModelAttribute 속성은 현재 Spring Framework 에서는 
	 *  선택사항이지만 오래된 Spring Framework 에서는 필수 항목이다
	 *  그래서 선택사항이지만 부착하는 습관을 들여놓자
	 * 
	 */
	@RequestMapping(value="/user/join" ,method=RequestMethod.POST)
	public String join(@ModelAttribute UserDto user, Model model) {
		// web Project에서 console에 출력하여 확인하고 할때 절대 아래 코드금지
		System.out.println(user.toString());
		//logback을 사용하여 Console에 확인 메세지 출력
		log.debug(user.toString());
	
		model.addAttribute("USER", user);

	 return "/user/join_ok";	
	}
	
	
	
}
