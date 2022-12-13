package com.micol.web.board.mapper;

import java.util.List;

import com.micol.web.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> getBoardAll(BoardVO vo); //��ü��ȸ
	int countBoard(BoardVO vo); //�Ǽ���ȸ
	BoardVO getBoard(String bno); //�ܰ���ȸ
	int insertBoard(BoardVO vo); // ���
	int updateBoard(BoardVO vo); // ����
	int deleteBoard(String bno); // ����
}
