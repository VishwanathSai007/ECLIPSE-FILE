package com.example.clayfinMVCC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")
public class MyApp {
	@Autowired
	public UserService service;
	
	@RequestMapping(value="/welcome" ,method= RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return"welcome to springMVC";
	}

	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public String UserRegister(@RequestBody User user) {
		service.UserRegister(user);
		return "user added";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	
	public String login() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public String loginvalid(@RequestParam ("uname") String name,@RequestParam ("pass") String pass ) {
	if(service.loginvalid(name, pass)) {
	return "user validated";
	}
		return "login failed";

}
	
}
