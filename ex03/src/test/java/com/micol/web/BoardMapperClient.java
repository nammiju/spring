package com.micol.web;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.board.mapper.BoardMapper;
import com.micol.web.board.service.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperClient {
	@Autowired
	BoardMapper mapper;

	// 전체조회
	@Test
	public void getBoardAll() {
		BoardVO vo = new BoardVO();
		// vo.setTitle("테스트");
		// vo.setWriter("user01");
		List<BoardVO> list = mapper.getBoardAll(vo);
		System.out.println(list);
	}

	// 글등록
	//@Test
	public void insertBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("오늘은 금요일");
		vo.setContent("아싸리 근데 내일도 와야한다");
		//vo.setWriter("갓바위");
		int result = mapper.insertBoard(vo);
		System.out.println(result + "건이 등록되었습니다~!!");
	}
}
