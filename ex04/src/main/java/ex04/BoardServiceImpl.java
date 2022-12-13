package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

//@Component //bean등록 어노테이션
@Log4j
public class BoardServiceImpl implements BoardService{

	@Override
	public int boardInsert() {
		log.info("등록완료");
		return 0;
	}

}
