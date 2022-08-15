package org.hdcd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//요청처리
	@RequestMapping(value="/register/{userId}", method=RequestMethod.GET)
	public ResponseEntity<String> register01(@PathVariable("userId") String userId){
		logger.info("register01");
		
		logger.info("userId= " + userId);
		
		ResponseEntity<String> entity = new ResponseEntity<String> ("SUCCESS",HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register/{userId}/{password}", method=RequestMethod.POST)
	public ResponseEntity<String> register02(@PathVariable("userId") String userId, @PathVariable("password") String password) {
		logger.info("register02");
		
		logger.info("userId = " + userId);
		logger.info("password = " + password);
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCEESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register03", method=RequestMethod.POST)
	public ResponseEntity<String> register03(String userId) {
		logger.info("register03");

		logger.info("userId = " + userId);
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register04", method=RequestMethod.POST)
	public ResponseEntity<String> register04(@RequestParam("userId") String userId, @RequestParam("password") String password){
		logger.info("register04");
		
		logger.info("userId = " + userId);
		logger.info("password = " + password);
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
}
