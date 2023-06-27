package com.hee462.hello.controller;

import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
/*
 * lombok 에서 지원하는 log 객체
 */
@Slf4j
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	/*
	 * Web Application 에서는 Console 에 메세지를 표현할때 
	 * System
	 */
		log.info("Welcom home! The client locale is {}.", locale );
		
		return "home";
	}
	
}
