package Q3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Pointcut("execution(* Services.*(..))")
    public void logAllMethods(){}


    @AfterThrowing(pointcut = "logAllMethods()" , throwing = "error")
    public void catchError(JoinPoint joinPoint, Throwable error){
        System.out.println(joinPoint.getSignature()+" is throwing "+error);
    }


}
