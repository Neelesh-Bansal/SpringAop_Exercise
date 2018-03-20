package Q2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

    @Before("execution(* Services.*(..))")
    public void beforeCalled()
    {
        System.out.println("Before method");
    }

    @After("execution(* Services.*(..))")
    public void afterCalled()
    {
        System.out.println("After method");
    }


}
