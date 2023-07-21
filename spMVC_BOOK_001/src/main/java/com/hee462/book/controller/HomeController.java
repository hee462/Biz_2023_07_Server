package com.hee462.book.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.book.models.UserDto;
import com.hee462.book.models.bookDto;
import com.hee462.book.service.BookService;


@Controller
public class HomeController {
	protected final BookService bookService;


	public HomeController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( bookDto bookDto, Model model) {
		List<bookDto> bookList = bookService.selectAll();
		model.addAttribute("BOOK_LIST" ,bookList);

		return "home";
	}
	

	@RequestMapping(value = "/book_input" , method = RequestMethod.POST)
	public String input(bookDto bookDto ,Model model){
		int result = bookService.insert(bookDto);
		model.addAttribute("BOOK",bookDto);
		return "home";
	}
	
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
//	public String insert(bookDto bookDto , Model model) {
//		int result = bookService.insert(bookDto);
//		model.addAttribute("BOOK",bookDto);
//		return "input";
//	}

	
}
