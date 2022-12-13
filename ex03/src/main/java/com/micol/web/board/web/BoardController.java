package com.micol.web.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;
import com.micol.web.common.Paging;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardService boardservice;
	
	//전체조회
	@RequestMapping("/boardSelectAll")
	public String boardSelectAll(Model model, BoardVO vo, Paging paging) {
		paging.setPageUnit(3); // 한페이지의 게시글 수 정해주기
		model.addAttribute("boards", boardservice.getBoardAll(vo, paging));
		return "board/boardSelectAll";
	}
}
