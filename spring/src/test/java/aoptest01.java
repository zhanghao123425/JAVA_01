
import com.haziy.service.HaziyAopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aoptest01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springAop01.xml");
        HaziyAopService haziyAopService = classPathXmlApplicationContext.getBean("haziyAopService", HaziyAopService.class);
//        System.out.println("haziyAopService = " + haziyAopService);
        haziyAopService.addNumber();

        // 手动销毁bean容器

    }
}
