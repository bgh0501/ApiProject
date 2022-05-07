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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value ="", method = RequestMethod.GET)
	public ResponseEntity<List<Board>> list() {
		logger.info("list");
		
		List<Board> boardList = new ArrayList<>();
		
		Board board = new Board();
		
		board.setBardNo(1);
		board.setTitle("향수");
		board.setContent("넓은 별 동쪽 끝으로");
		board.setWriter("hongkd");
		board.setRegDate(new Date());
		
		boardList.add(board);
		
		board = new Board();
		
		board.setBardNo(2);
		board.setTitle("첫 마음");
		board.setContent("날마다 새로우며 깊어지고 넓어진다");
		board.setWriter("hongkd");
		board.setRegDate(new Date());
		
		boardList.add(board);
		
		ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList,HttpStatus.OK);
		
		return entity;
	}
}
