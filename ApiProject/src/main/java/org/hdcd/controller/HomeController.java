package org.hdcd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/ajaxHome", method=RequestMethod.GET)
	public String ajaxHome() {
		return "ajaxHome";
	}
	
	@RequestMapping(value ="/registerForm", method = RequestMethod.GET)
	public String registerFrome() {
		Logger.info("registerForm");
		return "registerForm";
	}
}
