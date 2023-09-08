import com.haziy.entity.StuEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring05.xml");
        StuEntity stuEntity = classPathXmlApplicationContext.getBean("stuEntity", StuEntity.class);
        System.out.println("stuEntity = " + stuEntity);
    }
}
