package q1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

//execution is pcd
    // String Services.*(..) pointcut expression


    @Pointcut("execution(* Services.*(..))")
    public void all(){}



    @Before("all()")
    public void advice1(){
        System.out.println("Before method");
    }


    @Before("within(Services)")
    public void advice3(){
        System.out.println("advice3");
    }




    @AfterThrowing(pointcut = "all()", throwing = "error")
    public void catchingError(JoinPoint jp,Throwable error){
        System.out.println(jp.getSignature()+" is throwing "+error);
    }


    @After("all()")
    public void advice2(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println("After method");
    }

    @After("@annotation(java.lang.Deprecated)")
    public void depr(){
        System.out.println("call after depricated method");
    }

    @After("args(..)")
    public void call1(){
        System.out.println("call1 is called");
    }
}
