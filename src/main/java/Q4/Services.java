package Q4;

import org.springframework.stereotype.Component;

@Component
public class Services {

    @Deprecated
    public void method1()
    {
        System.out.println("Inside Method 1");
    }

    @Deprecated
    public void method2()
    {
        System.out.println("Inside Method 2");
    }
}
