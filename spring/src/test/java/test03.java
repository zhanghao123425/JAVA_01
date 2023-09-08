import com.haziy.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test03 {
    public static void main(String[] args) {
        // 1.读取xml配置文件
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring03.xml");
        // 2.根据bean的id获取bean对象
        UserEntity userEntity = classPathXmlApplicationContext.getBean("userEntity", UserEntity.class);
        System.out.println("userEntity = " + userEntity);

    }
}
