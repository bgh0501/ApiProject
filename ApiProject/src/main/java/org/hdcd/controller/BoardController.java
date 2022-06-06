package org.hdcd.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hdcd.domain.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/boards")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// /baords/ 경로에 GET 방식
	@RequestMapping(value ="", method = RequestMethod.GET)
	public ResponseEntity<List<Board>> list() {
		logger.info("list");
		
		List<Board> boardList = new ArrayList<>();
		
		boardList.add(new Board());
		
		ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList,HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<String> register() { 
		logger.info("register");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCES", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
	public ResponseEntity<Board> red(@PathVariable("boardNo") int boardNo) {
		logger.info("read");
		
		Board board = new Board();
		
		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.DELETE)
	public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
		logger.info("remove");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		return entity; 
	}
	
	@RequestMapping(value = "/{baordNo}", method = RequestMethod.PUT)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modify");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.PATCH)
	public ResponseEntity<String> modifyByPatch(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByPatch");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	@RequestMapping(value="/{boardNo}", method=RequestMethod.PUT, headers="X-HTTP-Method-Override=PUT")
	public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board) { 
		logger.info("modifyByHeader");
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		
		return entity;
	}
}
