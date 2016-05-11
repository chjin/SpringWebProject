package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("main/input.do")
	public String main_input(){
		return "main/input";
	}
	
	//public String main_output()
}
































































