package com.micol.web.reply.mapper;

import java.util.List;

import com.micol.web.reply.service.ReplyVO;

public interface ReplyMapper {
	//�Խñ� ��ȣ�� ��ȸ
		List<ReplyVO> getReply(String bno);
		//��� ���
		int insertReply(ReplyVO vo);
		//��� ����
		int deleteReply(String rno);
}
