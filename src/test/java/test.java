import com.mose.user.pojo.Userinfo;
import com.mose.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml", "pagehelper-config.xml");
        UserService userService =context.getBean(UserService.class);
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername("admin");
        userinfo.setPassword("admin");
        Userinfo userinfo1 = userService.LoginGetUser(userinfo);
        System.out.println(userinfo1);
    }
}
