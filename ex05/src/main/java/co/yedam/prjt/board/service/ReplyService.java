package co.yedam.prjt.board.service;

import java.util.List;

public interface ReplyService {
	// 조회
	List<ReplyVO> getReply(Long bno);

	// 등록
	int insertReply(ReplyVO vo);

	// 수정
	int updateReply(ReplyVO vo);

	// 삭제
	int deleteReply(Long bno);

	// 단건조회
	ReplyVO ReplySelect(Long rno);
}
