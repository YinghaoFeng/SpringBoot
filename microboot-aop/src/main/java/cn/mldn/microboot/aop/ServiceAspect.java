package cn.mldn.microboot.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {
	@Around("execution(* cn.mldn..service..*.*(..))")
	public Object arroundHandle(ProceedingJoinPoint point) throws Throwable {
		System.err.println("【****** 环绕通知 ******】业务调用处理前：" + Arrays.toString(point.getArgs()));
		Object obj = point.proceed(point.getArgs()) ;
		System.err.println("【****** 环绕通知 ******】业务调用处理完成：" + obj);
		return obj ;
	} 
}
