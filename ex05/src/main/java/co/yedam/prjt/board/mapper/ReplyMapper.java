package co.yedam.prjt.board.mapper;

import java.util.List;

import co.yedam.prjt.board.service.ReplyVO;

public interface ReplyMapper {
	//댓글 목록
	List<ReplyVO> getReply(String bno);

	//댓글 등록
	int insertReply(ReplyVO vo);

	//댓글 삭제
	int deleteReply(String rno);
}
