package Q3;

import org.springframework.stereotype.Component;

@Component
public class Services {

    public void method1(){
        System.out.println("Inside Method 1");
    }
    public void method2(){
        System.out.println("Inside Method 2");
    }
    public void method3(){
        System.out.println("Inside Method 3");
    }
    public void method4(){
        throw new RuntimeException();
    }
}
