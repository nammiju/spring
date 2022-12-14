package co.yedam.prjt.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.board.mapper.ReplyMapper;
import co.yedam.prjt.board.service.ReplyService;
import co.yedam.prjt.board.service.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	ReplyMapper mapper;

	@Override
	public List<ReplyVO> getReply(Long bno) {
		// 댓글가져오기
		return mapper.getReply(bno);
	}

	@Override
	public int insertReply(ReplyVO vo) {
		// 등록
		return mapper.insertReply(vo);
	}

	@Override
	public int updateReply(ReplyVO vo) {
		// 수정
		return mapper.updateReply(vo);
	}

	@Override
	public int deleteReply(Long bno) {
		// 삭제
		return mapper.deleteReply(bno);
	}

	@Override
	public ReplyVO ReplySelect(Long rno) {
		// TODO Auto-generated method stub
		return mapper.ReplySelect(rno);
	}


}
