package com.kj.service.service;

import com.kj.service.dao.PostMapper;
import com.kj.service.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> findPosts(String userid,int start,int limit){
        return  postMapper.selectPosts(userid,start,limit);
    }

    public int findPostRow(String userid){
        return  postMapper.selectPostRow(userid);
    }

    public void addPost(Post post){
        postMapper.insertPost(post);
    }
}
