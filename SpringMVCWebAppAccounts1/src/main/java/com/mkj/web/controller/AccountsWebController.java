package com.mkj.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountsWebController {
	
	public AccountsWebController() {
	}

	@RequestMapping("/")
	public String webHomeRequest()
	{
		return "index";
	}
	
	@RequestMapping("/accountsInput")
	public String webAccountRequest()
	{
		return "accounts";
	}
	
	@RequestMapping(value="/userform",method=RequestMethod.GET)
	public String webUserformGETRequest(HttpServletRequest req,Model model )
	{
		String username = req.getParameter("username");
		model.addAttribute("usernameUpdated",username+" verified user");
		return "display-user";
	}
	
	
	
	@RequestMapping(value="/userform",method=RequestMethod.POST)
	public String webUserformRequest(HttpServletRequest req)
	{
		String username = req.getParameter("username");
		System.out.println(" --->> webUserformRequest Post() is called by "+username);
		return "index";
	}
	

	@RequestMapping(value="/readAccounts",method=RequestMethod.POST)
	public String handelAccountsInput(HttpServletRequest req)
	{
		return "display-accounts";
	}
	
	
}//end controller




















