package com.mkj.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkj.web.bean.Accounts;

@Controller
@RequestMapping("/accounts")
public class AccountsHandelingController {

	
	public AccountsHandelingController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" inside Accounts handling Controller Consutructor ");
	}

	@RequestMapping("/showAccountsForm")    
	public String getAccountsPage(Model model)
	{
		
		Accounts account = new Accounts();
		model.addAttribute("accountsAttribute",account);
		System.out.println(" inside getAccount Page ");
		return "accounts";
	}
	
	@RequestMapping(value="processAccountsInfo",method=RequestMethod.POST)
	public String getAccountProcessedPage(@Valid 
	                                      @ModelAttribute("accountsAttribute")Accounts accounts,
			                               BindingResult br)
	{
		if(br.hasErrors())
		{

			System.out.println(" -->> inside getAccountProcessedPage- error "+
								br.getFieldErrorCount()+" "+br.getErrorCount()+"  ");
			return "accounts";
		}
		else
		{

			System.out.println(" -->> inside getAccountProcessedPage - no error");
			return "accounts-info";
		}
		
	}
}
