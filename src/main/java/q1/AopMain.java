package q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class AopMain {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config1.xml");
        Services services =  applicationContext.getBean(Services.class);
        //services.Method1();
       // services.n3();

      //  services.n4();
        services.n3();


    }

}
