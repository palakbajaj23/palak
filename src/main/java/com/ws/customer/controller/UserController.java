package com.ws.customer.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "rest/login", method = RequestMethod.GET)
	public String loginAuth(@RequestHeader(value = "username") String username,
			@RequestHeader(value = "password") String password) {
		if(username.equals("username")&& password.equals(password))
		{
			return "Login Successful";
		}
		return "Login Unsuccessful";
	}
}
