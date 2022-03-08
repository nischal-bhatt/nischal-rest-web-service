package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
   
	@RequestMapping(method=RequestMethod.GET, path="/welcomeNish")
	public String welcomeMessage()
	{
		return "nischal says hello";
	}
}