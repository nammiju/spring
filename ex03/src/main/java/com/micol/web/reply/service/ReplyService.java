package com.micol.web.reply.service;

import java.util.List;

public interface ReplyService {
	//게시글 번호로 조회
	List<ReplyVO> getReply(Long bno);
	//댓글 등록
	int insertReply(ReplyVO vo);
	//댓글 삭제
	int deleteReply(Long rno);
}
