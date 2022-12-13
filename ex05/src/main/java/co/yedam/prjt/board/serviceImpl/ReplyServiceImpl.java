package co.yedam.prjt.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;

@Component
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyService service;

	@Override
	public List<ReplyVO> getReply(Long bno) {
		// 댓글가져오기
		return service.getReply(bno);
	}

	@Override
	public int insertReply(ReplyVO vo) {
		// 등록
		return service.insertReply(vo);
	}

	@Override
	public int deleteReply(Long rno) {
		// 삭제
		return service.deleteReply(rno);
	}

}
