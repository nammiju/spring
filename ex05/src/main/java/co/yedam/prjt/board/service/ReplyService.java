package co.yedam.prjt.board.service;

import java.util.List;

public interface ReplyService {
	//조회
	List<ReplyVO> getReply(ReplyVO vo);
	//등록
	int insertReply(ReplyVO vo);
	//수정
	int updateReply(ReplyVO vo);
	//삭제
	int deleteReply(ReplyVO vo);
}
