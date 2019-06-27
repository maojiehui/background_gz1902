import com.qf.pojo.MenuInfo;
import com.qf.pojo.User;
import com.qf.pojo.UserInfo;
import com.qf.service.MenuInfoService;
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
import java.util.List;

/**
 * Created by DELL on 2019/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-service.xml"}) //加载配置文件
public class TestDemo {
    @Autowired(required = false)
    UserInfoService userInfoService;

    @Autowired
    MenuInfoService menuInfoService;

    @Test
    public void test(){
//        UserInfo userInfo = userInfoService.getById(3);
//        System.out.println(userInfo);
//
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName("小彬彬");
//        userInfo.setPassword("123456");
//        userInfoService.addUserInfo(userInfo);

        List<MenuInfo> menuInfoList = menuInfoService.listAllMenuInfo();
        System.out.println(menuInfoList);
    }




}
