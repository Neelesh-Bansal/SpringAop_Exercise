package Q7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Services services = applicationContext.getBean(Services.class);
        services.method1(6);
    }
}
