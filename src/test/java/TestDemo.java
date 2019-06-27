import com.qf.pojo.User;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by DELL on 2019/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"}) //加载配置文件
public class TestDemo {
    @Autowired(required = false)
    UserInfoService userInfoService;

    @Test
    public void test(){
        UserInfo userInfo = userInfoService.getById(3);
        System.out.println(userInfo);
    }




}
