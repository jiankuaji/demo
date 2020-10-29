package com.kj.service;

import com.kj.service.config.Config;
import com.kj.service.dao.UserMapper;
import com.kj.service.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private User user;
    @Autowired
    private UserMapper userMapper;
    @Test
    void insertUserTest() {
        user.setId("411527200102060435");
        user.setName("简跨纪");
        user.setUsername("树洞先生");
        user.setPassword("123456");
        user.setEmail("2460228393");
        user.setCreatetime(new Date());
        userMapper.insertUser(user);
    }
    @Test
    void testSelectById(){
     user=userMapper.selectById("411527200102060436");
     System.out.println(user);

    }

}
