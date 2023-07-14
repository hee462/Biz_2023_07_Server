package com.hee462.bbs;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hee462.bbs.dao.BBsDao;
import com.hee462.bbs.models.BBsDto;


@Controller
public class HomeController {
	
	private  final BBsDao bbsDao;
	public HomeController(BBsDao bbsDao) {
		this.bbsDao = bbsDao;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

//		List<BBsDto> bbsList = bbsDao.selectAll();
		List<BBsDto> bbsList = bbsDao.findUserSelectLimit();
		model.addAttribute("BBS_LIST" ,bbsList);
		return "home";
	}
	
	@RequestMapping(value="/detail" , method = RequestMethod.GET)
	public String detail( Model model , String seq) {
	BBsDto bbsDto = bbsDao.detail(seq);
		System.out.println(bbsDto);
		model.addAttribute("BBS",bbsDto);
		
		return "detail";
	} 
	
}
