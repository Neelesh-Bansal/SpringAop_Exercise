package q1;

import org.springframework.stereotype.Component;

@Component
public class Services {

    public String m1(){

        System.out.println("method 1 is calling");
            return "hello";
    }



    public void m2(){
        System.out.println("method 2 is calling");
    }


    public void n3(){
        System.out.println("method 3 is calling");
    }


    public void n4(){
        throw new RuntimeException();
    }

    @Deprecated
    public void n5(){
        System.out.println("deprecated");

    }



}
