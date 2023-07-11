package com.hui462.todolist;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hui462.todolist.models.TodoDto;
import com.hui462.todolist.service.TodoService;

@Service
@Controller
public class HomeController {
	
	
	
	protected final TodoService todoService;
	public HomeController(TodoService todoService) {
		this.todoService = todoService;
	}


	@ModelAttribute
	public TodoDto todoDto() {
		TodoDto dto = new TodoDto();
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat  timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		dto.setTo_sdate(dateFormat.format(date));
		dto.setTo_stime(timeFormat.format(date));
		return dto;
	}

	/*
	 * 매개변수에 Dto를 사용하고@ModelAttribute를 부착해 두면
	 * Dto 변수가 null 값이면, 어딘가에 이 Dto를 생성하는 method가 있는지 찾는다.
	 * 이 때 method에도 @ModelAttribute가 있어야 한다
	 * 
	 * @ModelAttribute가 있는 method를 찾으면 해당 method를 실행하여
	 * return값을 매개변수에  setting 하여 전달한다.
	 * 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute TodoDto dto,Model model) {
		if(dto.getTo_content() != null){
			todoService.insert(dto);
		}
		List<TodoDto> todoList = todoService.selectAll();
		model.addAttribute("TODO" , dto);
		model.addAttribute("TODOS",todoList);
		
		return "home";
	}
	
}
