package com.jd.xya.springbootmybatis.service;

import com.jd.xya.springbootmybatis.BootMybatisApp;
import com.jd.xya.springbootmybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void addTest(){
        User user = new User(13,"xuya3","123456");
        userService.addUser(user);
    }

}
