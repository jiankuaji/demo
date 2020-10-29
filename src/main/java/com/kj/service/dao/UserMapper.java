package com.kj.service.dao;

import com.kj.service.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(String id);

    int insertUser(User user);
}
