package org.zerock.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Aspect
@Log4j2
@Component
public class TimeCheckAdvice {
	
	@Before("execution(* org.zerock.**.service.*.*(..))")
	public void ex1() {
		
		log.info("╔═════ °• ♔ •° ═════╗");
		log.info(" ──────Check~!────── ");
		log.info("╚═════ °• ♔ •° ═════╝");
	}
}
