package com.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping(value={"/","/home"})
	public String  HomePage(){		
		return "home";
	}
	@RequestMapping(value={"/productdetail"})
	public String  productDetail(){		
		return "productdetail";
	}

}
