package com.micol.web.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardService;
import com.micol.web.board.service.BoardVO;
import com.micol.web.common.Paging;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> getBoardAll(BoardVO vo, Paging paging) {
		// 전체조회
		paging.setTotalRecord(boardMapper.countBoard(vo));
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return boardMapper.getBoardAll(vo);
	}

	@Override
	public BoardVO getBoard(String bno) {
		// 상세조회
		return null;
	}

	@Override
	public int insertBoard(BoardVO vo) {
		// 등록
		return 0;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// 수정
		return 0;
	}

	@Override
	public int deleteBoard(String bno) {
		// 삭제
		return 0;
	}

}
