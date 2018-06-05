package com.mindtree.springmvc.psbankapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.springmvc.psbankapp.model.Account;

@Controller
public class AccountController {

	@RequestMapping("/")
	public String showHomePage() {
		// TODO Auto-generated method stub
		return "index";
	}

	@RequestMapping(value="/new", method = RequestMethod.GET)
	private String newAccount(Model model) {
		model.addAttribute("account",new Account());
		return "newAccount";

	}

	
	@RequestMapping("/showAccount")
	private String showAccount() {
		return "showAccount";

	}

	@RequestMapping(value="/saveAccount" ,method=RequestMethod.POST)
	private String saveAccount(Model model,
			@RequestParam("accountNo" )String accNo,@RequestParam("accountHolderName" )String customerName,@RequestParam("balance" )String balance) {
		/*String accNo=request.getParameter("accountNo");
		String customerName=request.getParameter("accountHolderName");
		String balance=request.getParameter("balance");*/
		
		/*model.addAttribute("accountNumber",accNo);
		model.addAttribute("accountHolderName",customerName);
		model.addAttribute("balance",balance);*/
		
		Account account = new Account();
		account.setAccountHolderName(customerName);
		account.setAccountNo(Integer.parseInt(accNo));
		account.setBalance(Integer.parseInt(balance));
		
		model.addAttribute("account",account);
		return "showAccount";

	}
}
