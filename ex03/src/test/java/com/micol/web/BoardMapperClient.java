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

	// ��ü��ȸ
	@Test
	public void getBoardAll() {
		BoardVO vo = new BoardVO();
		// vo.setTitle("�׽�Ʈ");
		// vo.setWriter("user01");
		List<BoardVO> list = mapper.getBoardAll(vo);
		System.out.println(list);
	}

	// �۵��
	//@Test
	public void insertBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("������ �ݿ���");
		vo.setContent("�ƽθ� �ٵ� ���ϵ� �;��Ѵ�");
		//vo.setWriter("������");
		int result = mapper.insertBoard(vo);
		System.out.println(result + "���� ��ϵǾ����ϴ�~!!");
	}
}
