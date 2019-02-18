package com.likith.myproject.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component

public class GymLoggingAspect {

	 private Logger myLogger = Logger.getLogger(getClass().getName());
	 
	 @Pointcut("execution(* com.likith.myproject.Controller.*.*(..))")
	 public void forControllerPackage() {}
	 
	 
	 @Pointcut("execution(* com.likith.myproject.dao.*.*(..))")
	 public void forDaoPackage() {}
	 
	 
	 @Pointcut("execution(* com.likith.myproject.service.*.*(..))")
	 public void forServicePackage() {}
	 
	 
	 @Pointcut("forControllerPackage() || forDaoPackage() || forServicePackage()")
	 private void forAppFlow() {}
	 
	 @Before("forAppFlow()")
	 public void before(JoinPoint theJoinPoint) {
		 
		 String theMethod = theJoinPoint.getSignature().toShortString();
		 myLogger.info("------->> in @before:calling method "+ theMethod);
		 
		 Object args[] = theJoinPoint.getArgs();
		 for(Object o : args) {
			 myLogger.info("----->argument"+o);
		 }
	 }
	 @AfterReturning(pointcut="forAppFlow()",returning="theResult")
	 public void afterReturning(JoinPoint theJoinPoint,Object theResult) {
		 
		 String theMethod = theJoinPoint.getSignature().toShortString();
		 myLogger.info("------->> in @AfterReturning:calling method "+ theMethod);
			 myLogger.info("----->result"+theResult);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
