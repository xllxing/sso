package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.bean.User;
import com.company.service.IUserService;
import com.company.util.SSOFileUpload;

@Controller
public class SSOController {

	@Autowired
	IUserService userService;
	
	@Autowired
	SSOFileUpload ssoFileUpload;
	
	@RequestMapping(value="/ssologin",method=RequestMethod.GET)
	public String ssologin(String from,Model model) {
		model.addAttribute("from", from);
		return "login";
	}
	
	@RequestMapping(value="/ssologin",method=RequestMethod.POST)
	public String ssologin(User user,Model model) {
		
		return "";
	}
	
}
