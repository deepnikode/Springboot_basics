package com.in28minutes.springbooot.myFirstWebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {

	@RequestMapping("hello")
	@ResponseBody
	public String sayHello()
	{
		return "Hello";
	}
	
	
	@RequestMapping("html")
	@ResponseBody
	public String sayHTML()
	{ 
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First webpage </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Hello Deep, this is your first html page String");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("success")
	// @ResponseBody
	public String indexHandler()
	{
		return "success";
	}
	
	
}
