package co.yedam.prjt.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ReplyVO {
	private Long rno;
	private Long bno;
	

	private String reply;
	private String replyer;
	
	private String replyDate;
	private String updateDate;
}
