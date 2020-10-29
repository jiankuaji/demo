package com.kj.service.service;

import com.kj.service.dao.UserMapper;
import com.kj.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User findUserById(String id){
        return userMapper.selectById(id);
    }
}
