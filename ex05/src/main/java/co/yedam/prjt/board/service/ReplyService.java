package co.yedam.prjt.board.service;

import java.util.List;

public interface ReplyService {
	//�Խñ� ��ȣ�� ��ȸ
	List<ReplyVO> getReply(Long bno);
	//��� ���
	int insertReply(ReplyVO vo);
	//��� ����
	int deleteReply(Long rno);
}
