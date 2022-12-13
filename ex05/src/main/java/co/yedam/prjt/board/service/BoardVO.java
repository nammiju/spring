package co.yedam.prjt.board.service;

import lombok.Data;

@Data
public class BoardVO {
	String bno;
	String title;
	String content;
	String writer;
	String regdate;
	String updatedate;
	
	//List<String> bnos;
	
	Integer first = 1;
	Integer last = 10;
}
