package com.in28minutes.springbooot.myFirstWebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	// http://localhost:8080/login?name=deep
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AuthenticationService authentication;
	
	
	@RequestMapping("logindemo")
	public String goLoginPage(@RequestParam String name, Model model)
	{
		model.addAttribute("username", name);
		
		//SOUT - Not Recommended at Production Code
		System.out.println("SOUT : Request parameter is="+name);
		
		//SOUT - Recommended at Production Code
		logger.debug("{}", name);
		
		logger.info("Printed at info level");
		
		logger.warn("Printed at warn level");
		
		return "logindemo";
	}
	
	
	
	// GET 
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String LoginPage()
	{	
		return "login";
	}
	
	
	// POST
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String WelcomePage(@RequestParam String username,@RequestParam String userpassword ,Model model)
	{	
		
			if(authentication.authenticate(username,userpassword))
			{
				model.addAttribute("name",username );
				model.addAttribute("password", userpassword);
				
				return "welcome";
			}
			else
			{
				model.addAttribute("errormsg","Invalid Credentials!!!");
				return "login";
			}
				
		
		
		    /*
		     
		     ***********HARDCODED AUTHENTICATION**************
		     
		    if(username.equalsIgnoreCase("deep")&&userpassword.equalsIgnoreCase("admin"))
		     
			{
				model.addAttribute("name",username );
				model.addAttribute("password", userpassword);
				
				return "welcome";
			}
			else
			{
			return "login";					
			}
			
			*/
		
				
	}
	
	
}
