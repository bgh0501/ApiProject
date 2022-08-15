package org.hdcd.controller;

import java.util.Calendar;
import java.util.List;

import org.hdcd.domain.Address;
import org.hdcd.domain.Card;
import org.hdcd.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//Date타입 처리
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody Member member) {
		logger.info("register");
		
		logger.info("userId = " + member.getUserId());
		logger.info("password = " + member.getPassword());
		
		logger.info("member.getDateOfBirth() = " + member.getDateOfBirth());
		
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public ResponseEntity<Member> read() {
		logger.info("read");
		
		Member member = new Member();
		member.setUserId("hongkd");
		member.setPassword("1234");
		
		Calendar cal = Calendar.getInstance();
		
		int year = 1999;
		int month = 5;
		int date =20;
		cal.set(year, month-1, date);
		
		member.setDateOfBirth(cal.getTime());
		logger.info(member.toString());
		return new ResponseEntity<Member>(member, HttpStatus.OK);
	}
	
	//요청 처리 자바빈즈
	@RequestMapping(value = "/register01", method = RequestMethod.POST)
	public ResponseEntity<String> register01(@RequestBody Member member) {
		logger.info("register01");
		
		logger.info("userId = " + member.getUserId());
		logger.info("password = " + member.getPassword());
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register01/{userId}", method = RequestMethod.POST)
	public ResponseEntity<String> register0101(@PathVariable("userId") String userId, @RequestBody Member member) {
		logger.info("register0101");
		
		logger.info("member.getUserId() = " + member.getUserId());
		logger.info("member.getPassword() = " + member.getPassword());
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register02", method = RequestMethod.POST)
	public ResponseEntity<String> register02(@RequestBody List<Member> memberList) {
		logger.info("register02");
		
		for(Member member : memberList) {
			logger.info("userId = " + member.getUserId());
			logger.info("password = " + member.getPassword());
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register03", method = RequestMethod.POST)
	public ResponseEntity<String> register03(@RequestBody Member member) {
		logger.info("register03");
		
		logger.info("userId = " + member.getUserId());
		logger.info("password = " + member.getPassword());
		
		Address address = member.getAddress();
		
		if (address != null) {
			logger.info("address.getPostCode() = " + address.getPostCode());
			logger.info("address.getLocation() = " + address.getLocation());
		} else {
			logger.info("address == null");
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/register04", method = RequestMethod.POST)
	public ResponseEntity<String> register04(@RequestBody Member member) {
		logger.info("register04");
		
		logger.info("userId = " + member.getUserId());
		logger.info("password = " + member.getPassword());
		
		List<Card> cardList = member.getCardList();
		
		if (cardList != null) {
			logger.info("cardList.size() = " + cardList.size());
			
			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				logger.info("card.getNo() =" + card.getNo());
				logger.info("card.getValidMonth() = " + card.getValidMonth());
			}
		} else {
			logger.info("cardList == null");
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	//요청처리
	/*
	 * @RequestMapping(value="/register/{userId}", method=RequestMethod.GET) public
	 * ResponseEntity<String> register01(@PathVariable("userId") String userId){
	 * logger.info("register01");
	 * 
	 * logger.info("userId= " + userId);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>
	 * ("SUCCESS",HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @RequestMapping(value = "/register/{userId}/{password}",
	 * method=RequestMethod.POST) public ResponseEntity<String>
	 * register02(@PathVariable("userId") String userId, @PathVariable("password")
	 * String password) { logger.info("register02");
	 * 
	 * logger.info("userId = " + userId); logger.info("password = " + password);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCEESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @RequestMapping(value = "/register03", method=RequestMethod.POST) public
	 * ResponseEntity<String> register03(String userId) { logger.info("register03");
	 * 
	 * logger.info("userId = " + userId);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @RequestMapping(value = "/register04", method=RequestMethod.POST) public
	 * ResponseEntity<String> register04(@RequestParam("userId") String
	 * userId, @RequestParam("password") String password){
	 * logger.info("register04");
	 * 
	 * logger.info("userId = " + userId); logger.info("password = " + password);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
}
