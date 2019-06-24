package classes.item.random;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Beaning {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/Users/shubhkj/Desktop/TestProject/src/res/Beans.xml");
        String obj = (String)context.getBean("hello");
        System.out.println(obj);
    }
}

