package robotSpring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        T1000 t1000 = (T1000) context.getBean("t10004");
        t1000.action();


    }
}
