package co.yedam.prjt.board.mapper;

import java.util.List;

import co.yedam.prjt.board.service.ReplyVO;

public interface ReplyMapper {
	// 댓글 목록
	List<ReplyVO> getReply(Long bno);

	// 댓글 등록
	int insertReply(ReplyVO vo);

	// 수정
	int updateReply(ReplyVO vo);

	// 댓글 삭제
	int deleteReply(Long bno);
	
	// 단건조회
	ReplyVO ReplySelect(Long rno);
}
