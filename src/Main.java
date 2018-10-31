import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sping-config.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWord");
        helloWorld.sayHello();

    }

}
