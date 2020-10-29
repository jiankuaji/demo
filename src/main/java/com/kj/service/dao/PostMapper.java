package com.kj.service.dao;

import com.kj.service.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> selectPosts(String userid,int start,int limit);

    int selectPostRow(@Param("userid") String userid);

    int insertPost(Post post);

}
