package com.app.ext.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingService {
	@Pointcut("execution(public * com.app..*.get*())")
	public void point1() {}
	
	@Before("point1()") //JoinPoint
	public void getMsg() {
		System.out.println("Im from advice");
	}
}








