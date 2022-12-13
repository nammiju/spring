package co.yedam.prjt.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;

@RestController
public class ReplyController {
	@Autowired
	ReplyService replyService;

	// 댓글 조회
	@GetMapping("/reply/{bno}")
	public List<ReplyVO> replyList(ReplyVO vo, @PathVariable Long bno) {
		vo.setBno(bno);
		return replyService.getReply(vo);
	}
	
	// 등록
	@PostMapping("/reply")
	public ReplyVO insert(ReplyVO vo) {
		replyService.insertReply(vo);
		return vo;
	}
	
	// 수정
	@PutMapping("/reply")
	public ReplyVO update(@RequestBody ReplyVO vo) {
		replyService.updateReply(vo);
		return vo;
	}
	
	// 삭제
	@DeleteMapping("/reply/{bno}")
	public int delete(ReplyVO vo, @PathVariable Long bno) {
		vo.setBno(bno);
		return replyService.deleteReply(vo);
	}
}
