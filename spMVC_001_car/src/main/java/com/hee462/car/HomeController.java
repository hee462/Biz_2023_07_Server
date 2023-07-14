package com.hee462.car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.car.Dao.carDao;
import com.hee462.car.models.carDto;

@Controller
public class HomeController {
	private final carDao dao;

	public HomeController(carDao dao) {
		super();
		this.dao = dao;
	}

	@ModelAttribute
	public carDto todoDto() {
		carDto dto = new carDto();
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		dto.setC_startDate(dateFormat.format(date));
		dto.setC_startTime(timeFormat.format(date));
		return dto;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute carDto dto, Model model) {
		dto = todoDto();
		List<carDto> carList = dao.selectAll();
		model.addAttribute("CAR_LIST", carList);
		model.addAttribute("CAR", dto);

		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute carDto dto, Model model) {
		int result = dao.insert(dto);
		model.addAttribute("CAR", dto);
		return "redirect:/";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute Model model,carDto dto) {
		dto = todoDto();
		int result =dao.update(dto);
		model.addAttribute("CAR",dto);

		return "redirect:/";
	}
	
}
