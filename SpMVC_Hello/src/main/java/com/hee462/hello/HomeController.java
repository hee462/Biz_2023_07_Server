package com.hee462.hello;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.hello.models.AddressDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name","홍길동");
		model.addAttribute("age",33);
		model.addAttribute("tel","010-1111-1111");
		return "home";
	}                
	@RequestMapping(value ="/hello")
	public String hello(Model model) {
		AddressDto addresDto = new AddressDto();
		addresDto.setName("성춘향");
		addresDto.setTel("010-1111-1111");
		addresDto.setAge(16);
		addresDto.setAddress("전라북도 남원시") ;
		
		model.addAttribute("ADDR" , addresDto);
		
		//  /WEB-INF/views/hello.jsp를 찾아서 rendering을 해달라
		return "hello";
	}
	@RequestMapping(value ="/user")
	public String user(Model model) {
		
		List<AddressDto> addrList = new ArrayList<AddressDto>();
		AddressDto addressDto = new AddressDto();
		addressDto.setName("이몽룡");
		addressDto.setTel("010-1234-1234");
		addressDto.setAge(18);
		addressDto.setAddress("광주광역시");
		addrList.add(addressDto);
		
		// 새로운 주소값에 추가하기 위해서 초기화 진행 후 저장
		addressDto = new AddressDto();
		addressDto.setName("변학도");
		addressDto.setTel("010-1000-1000");
		addressDto.setAge(20);
		addressDto.setAddress("울산광역시");
		addrList.add(addressDto);
		
		
		addressDto = new AddressDto();
		addressDto.setName("이몽길");
		addressDto.setTel("010-2000-2000");
		addressDto.setAge(19);
		addressDto.setAddress("부산광역시");
		addrList.add(addressDto);
		
		for(AddressDto dto : addrList) {
			System.out.println(addrList.toString());
		}
		
		model.addAttribute("ADDRS" , addrList);
		return "user2";
	}
	
}
