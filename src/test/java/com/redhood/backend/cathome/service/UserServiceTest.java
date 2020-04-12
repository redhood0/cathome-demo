package com.redhood.backend.cathome.service;

import com.redhood.backend.cathome.mp_generator.c.entity.User;
import com.redhood.backend.cathome.mp_generator.c.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @PackgeName: com.redhood.backend.cathome.service
 * @ClassName: UserServiceTest
 * @Author: redhood
 * Date: 2020/4/12 22:10
 * project name: cathome
 * @Version:
 * @Description:
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    IUserService userService;


    @Test
    void contextLoads() {
        System.out.println( userService.save(new User().setNickname("aaa")));
//        adoptCatService.searchAll();
    }
}
