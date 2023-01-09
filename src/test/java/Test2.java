import com.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Chun Zhang
 * @Date: 2022/9/5
 * @Description: PACKAGE_NAME
 */

/**
 * spring_di 注解方式实现 1
 */
public class Test2 {
    @Test
    public void testGetBean(){
        //
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext0.xml");

        // 获取 UserServiceImpl 实现类
        UserServiceImpl userServiceImpl = classPathXmlApplicationContext.getBean("userServiceImpl", UserServiceImpl.class);

        //调用实现类方法
        userServiceImpl.add();
    }
}
