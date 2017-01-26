package com.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String showHome(){
		return "logintheme";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showDashboard(){
		System.out.println("aaaa");
		return "dashboard";
	}

}
