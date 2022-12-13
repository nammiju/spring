package com.company.app.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Aspect
@Component
@Log4j
public class LoginAdvice {
	@After("LogAdvice.allpointcut()")
	public void logAtfer() {
		log.info("[after !!!!]");
	}
}
