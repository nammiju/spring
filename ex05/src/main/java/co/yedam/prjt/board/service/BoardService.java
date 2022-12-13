package co.yedam.prjt.board.service;

import java.util.List;

import co.yedam.prjt.common.Paging;

public interface BoardService {
	List<BoardVO> getBoardAll(BoardVO vo, Paging paging); //전체조회
	BoardVO getBoard(String bno); //상세조회
	int insertBoard(BoardVO vo); //등록
	int updateBoard(BoardVO vo); //수정
	int deleteBoard(String bno); //삭제
}
