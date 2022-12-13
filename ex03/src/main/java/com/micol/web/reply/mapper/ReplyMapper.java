package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	//게시글 번호로 조회
		List<ReplyVO> getReply(String bno);
		//댓글 등록
		int insertReply(ReplyVO vo);
		//댓글 삭제
		int deleteReply(String rno);
}
