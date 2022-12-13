package com.micol.web;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.reply.service.ReplyService;
import com.micol.web.reply.service.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyServiceClient {
	@Autowired ReplyService service;
	
	@Test
	public void getReply() {
		List<ReplyVO> list = service.getReply(6L);
		log.info(list);
	}

}
