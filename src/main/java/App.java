import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld otherBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == otherBean);

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat otherCat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat == otherCat);
    }
}