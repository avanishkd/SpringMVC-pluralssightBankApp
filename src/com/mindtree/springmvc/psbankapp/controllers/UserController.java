package com.mindtree.springmvc.psbankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/new")
	private String register() {
		System.out.println("inside register method");
		return "register";

	}
}
