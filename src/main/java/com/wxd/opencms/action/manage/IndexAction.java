package com.wxd.opencms.action.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {
	
	@RequestMapping("/index")
	public String indexPage(){
		return "index";
	}
}
