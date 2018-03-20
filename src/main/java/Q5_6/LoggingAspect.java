package Q5_6;

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

    @Pointcut("execution(* Services.*(..))")
    public void logAllMethods(){}

    @Before("logAllMethods()")
    public void beforeAdvice(){
        System.out.println("Before Method Called");
    }

    @After("logAllMethods()")
    public void afterAdvice(){
        System.out.println("After Method Called");
    }

    @Before("within(Services)")
    public void beforeAdvice2(){
        System.out.println("Before method 2 Called");
    }
    @Before("args(..)")
    public void argsMethod(){
        System.out.println("Args Method Called");
    }
    @Before("this(Services)")
    public void thisMethod(){
        System.out.println("This Method Called");
    }


}
