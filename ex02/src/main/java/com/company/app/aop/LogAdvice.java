package com.company.app.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
@Aspect
public class LogAdvice {
	@Pointcut("execution(* com.company.app..*Impl.*(..))")
	public void allpointcut() {}
	
	@Before("allpointcut()")
	public void logBefore() {
		//log.info(jp);
		log.info("[before !!!!]");
	}
	
	@Around("allpointcut()")
	public void logtime(ProceedingJoinPoint pjp) throws Throwable {
		log.info("[around before]");
		long start = System.currentTimeMillis();
		Object result = pjp.proceed(); // 서비스 호출
		long end = System.currentTimeMillis();
		log.info("RETURN: " + result);
		log.info("TIME:" + (end-start) );
		log.info("[around after]");
	}
}
