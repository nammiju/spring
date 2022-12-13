package co.yedam.prjt.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.yedam.prjt.board.service.BoardService;
import co.yedam.prjt.board.service.BoardVO;
import co.yedam.prjt.common.Paging;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService boardService;

	// 전체 조회 페이지
	@GetMapping("/list")
	public ModelAndView list(BoardVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView("/board/list");
		mv.setViewName("board/list");
		paging.setPageUnit(3); // 한페이지의 게시글 수 정해주기
		mv.addObject("boards", boardService.getBoardAll(vo, paging));
		return mv;
	}

	// 상세 보기 페이지
	@GetMapping("/select")
	public String select(Model model, @RequestParam String bno) {
		model.addAttribute("board", boardService.getBoard(bno));
		return "board/select";
	}
}
