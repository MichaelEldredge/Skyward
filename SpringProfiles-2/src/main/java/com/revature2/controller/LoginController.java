package com.revature2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	String globalN;
	@RequestMapping(value = "/loginpage" , method = RequestMethod.GET)
	public String loginPage() {
		return "loginpage";
	}
	
	@RequestMapping(value = "/loginpage" , method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String username, @RequestParam String password) {
		if (username.equals("admin") && password.equals("root")) {
			model.put("uName", username);
			System.out.println(globalN);
		return "profile";
	}else {
		model.put("errorMsg", "Please provide the correct username and password");
		return "loginpage";
	}
	}
	
	
	@RequestMapping(value = "/welcome" , method = RequestMethod.GET)
	public String checkBooks() {
		return "welcome";
	}
	
//	@RequestMapping(value = "/loginpage/profile" , method = RequestMethod.GET)
//	public String loggedPage(ModelMap model) {
//		model.put("uName", "globalN");
//		return "/profile";
//	}
}
