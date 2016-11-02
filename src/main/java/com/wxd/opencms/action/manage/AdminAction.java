package com.wxd.opencms.action.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/manage/admin")
@Controller
public class AdminAction {
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("manage/login");
		
		return mv;
	}
	@RequestMapping("/index")
	public ModelAndView indexPage(){
		ModelAndView mv = new ModelAndView("manage/index");  
        mv.addObject("title", "Spring MVC And Freemarker");  
        mv.addObject("content", " Hello world ， test my first spring mvc ! ");  
        return mv; 
	}
	@RequestMapping("/logout")
	public ModelAndView logout(){
		ModelAndView mv = new ModelAndView("manage/logout");  
		mv.addObject("title", "Spring MVC And Freemarker");  
		mv.addObject("content", " Hello world ， test my first spring mvc ! ");  
		return mv; 
	}
}
