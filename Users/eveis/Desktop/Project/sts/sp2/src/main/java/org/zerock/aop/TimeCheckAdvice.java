package org.zerock.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Aspect
@Log4j2
@Component
public class TimeCheckAdvice {
	
	// PointCut
	@Around("execution(* org.zerock.**.service.*.*(..))")
	public Object logTime(ProceedingJoinPoint pjp)throws Throwable {
		
		log.info(Arrays.toString(pjp.getArgs()));
		
		log.info("╔═════ °• ♔ •° ═════╗");
		
		long start = System.currentTimeMillis();
		
		// result는 메서드의 실행 결과
		Object result = pjp.proceed(); // 실제 메서드를 싱행
		long end = System.currentTimeMillis();
		log.info(" ──────Check~!────── ");
		log.info("      Time: " + (end - start));
		
		log.info("╚═════ °• ♔ •° ═════╝");
		
		return result;
	}
}
