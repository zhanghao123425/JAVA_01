import com.haziy.entity.MemberEntity;
import com.haziy.entity.StuEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test06 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring06.xml");
        MemberEntity memberEntity = classPathXmlApplicationContext.getBean("memberEntity", MemberEntity.class);
        System.out.println("[第四步]-获取使用到的memberEntity");
        System.out.println("memberEntity = " + memberEntity);
        // 手动销毁bean容器
        classPathXmlApplicationContext.close();
    }
}
