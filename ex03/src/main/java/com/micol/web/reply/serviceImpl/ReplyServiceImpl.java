package com.micol.web.reply.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.micol.web.reply.service.ReplyService;
import com.micol.web.reply.service.ReplyVO;

@Component
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyService service;

	@Override
	public List<ReplyVO> getReply(Long bno) {
		// 글번호로 조회
		return service.getReply(bno);
	}

	@Override
	public int insertReply(ReplyVO vo) {
		// 댓글등록
		return service.insertReply(vo);
	}

	@Override
	public int deleteReply(Long rno) {
		// 댓글삭제
		return service.deleteReply(rno);
	}

}
