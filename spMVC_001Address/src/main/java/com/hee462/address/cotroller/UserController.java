package com.hee462.address.cotroller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.address.models.UserDto;
import com.hee462.address.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	protected final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String home() {
		return null;
	}

	/*
	 * Controller. method()에서 response 결과인 view 이름을 문자열로 return하면
	 * /WEB-INF.views/폴더에서 파일을 찾아 rendering 한후 응답을 한다.
	 * 
	 * 그런데 , 문자열이 아니고 null을 return하면 이 method가 호출된 requestMapping 주소가 view 파일 이름을
	 * 대신하게 된다
	 * 
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String error ,Model model) {
		model.addAttribute("BODY", "LOGIN");
		model.addAttribute("ERROR" ,error);

		return "home";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserDto userDto, HttpSession httpSession) {
		String result = userService.userLogin(userDto);
		if(result.equals("OK")) {
			httpSession.setAttribute("USER", userDto);
			return "redirect:/";
		}else {
			return "redirect:/user/login?error=" + result;
		}
	}


	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		return null;
	}

	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {

		return null;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {

		return null;
	}

}
