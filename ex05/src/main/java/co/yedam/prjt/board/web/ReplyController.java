package co.yedam.prjt.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;

@RestController
public class ReplyController {
	@Autowired
	ReplyService replyService;

	// 댓글 전체 조회
	@GetMapping("/relpy/{bno}")
	public List<ReplyVO> replyList(@PathVariable long bno) {
		return replyService.getReply(bno);
	}
}
