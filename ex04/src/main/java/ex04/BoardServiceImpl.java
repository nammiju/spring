package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

//@Component //bean��� ������̼�
@Log4j
public class BoardServiceImpl implements BoardService{

	@Override
	public int boardInsert() {
		log.info("��ϿϷ�");
		return 0;
	}

}
