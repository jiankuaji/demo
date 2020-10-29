package com.kj.service;

import com.kj.service.config.Config;
import com.kj.service.dao.PostMapper;
import com.kj.service.entity.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class PostMapperTest {
    @Autowired
    private Post post;
    @Autowired
    private PostMapper postMapper;
    @Test
    void insertPostTest(){

        for (int i = 0; i <10 ; i++) {
            post.setId(Config.getUUID());
            post.setTitle("你好"+i);
            post.setUserid("411527200102060436");
            post.setContent("在家吗");
            post.setStatus(1);
            post.setCreatetime(new Date());
            post.setCommentcount(10);
            postMapper.insertPost(post);
        }

    }

    @Test
    void selectPostRow(){

    int i=postMapper.selectPostRow("");
    System.out.println(i);

    }
    @Test
    void selectPosts(){

        List<Post> posts=postMapper.selectPosts("411527200102060436",0,5);
        System.out.println(posts);

    }
}
