package com.mindtree.springmvc.psbankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value={"/index","","/index*","/view/*"})
	private String index() {
		return "/testRequestMapping";

	}
	
	@RequestMapping(value="/name")
	private String methodWithParams(@RequestParam(value="userName",required=false,defaultValue="Guest") String userName, Model model) {
		System.out.println("Page requested by "+userName);
		model.addAttribute("userName", userName);
		return "/testRequestMapping";

	}
	
//	it will accept only characters in url before the username
	@RequestMapping(value="/dynamic/{category:[a-z]+}/{userName}")
	private String dynamicURL(@PathVariable("userName") String userName) {
		System.out.println("Page requested by "+userName);
		
		return "/testRequestMapping";

	}
	
	@RequestMapping(value="*")
	private String fallBackPage() {
		
		
		return "/fileNotFound";

	}
}
