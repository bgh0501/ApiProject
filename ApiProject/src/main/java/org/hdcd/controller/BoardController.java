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

import io.swagger.models.Response;

@Controller
@RequestMapping("/boards")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//rpoduces 속성값에 "application/xml 미디어 타입을 지정한
	@RequestMapping(value="/{boardNo}", method=RequestMethod.GET, produces="application/xml")
	public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
		logger.info("readToXml");
		
		Board board = new Board();
		
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board,HttpStatus.OK);
		
		return entity;
	}
	
	//produces 속성값에 "application/json" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
		logger.info("readToJson");
		
		Board board = new Board();
		
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
	//produces 속성값을 지정하지 않으면 기본값인 "application/json" 미디어 타입으로 지정된다
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
		logger.info("read");
		
		Board board = new Board();
		
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
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
	
//	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
//	public ResponseEntity<Board> red(@PathVariable("boardNo") int boardNo) {
//		logger.info("read");
//		
//		Board board = new Board();
//		
//		ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);
//		
//		return entity;
//	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.DELETE)
	public ResponseEntity<String> remove(@PathVariable("boardNo") int boardNo) {
		logger.info("remove");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		return entity; 
	}
	
	@RequestMapping(value = "/{boardNo}", method = RequestMethod.POST)
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modify");
		
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
		
		return entity;
	}
	
	//consumes 속성값에 "applicaiotn/json" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method=RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyByJson");
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		
		return entity;
	}
	
	//consumes 속성값에 "application/xml" 미디어 타입을 지정한다.
	@RequestMapping(value = "/{boardNo}", method=RequestMethod.PUT, consumes="application/xml")
	public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board) {
		logger.info("modifyBy XML boardNo" + boardNo);
		
		logger.info("modifyByXml board" + board);
		
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		
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
