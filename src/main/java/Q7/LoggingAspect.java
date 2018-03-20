package Q7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("execution(* Services.*(..))")
    public void logAllMethods(){}


    @Before("logAllMethods()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Before Method called");
        System.out.println(joinPoint.getSignature()+" "+joinPoint.getArgs());
    }


}
