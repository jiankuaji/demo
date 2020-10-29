package com.kj.service.controller;

import com.kj.service.entity.Page;
import com.kj.service.entity.Post;
import com.kj.service.entity.User;
import com.kj.service.service.PostService;
import com.kj.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HoneController {
    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index")
    public String getIndexPage(Model model, Page page){
        page.setRows(postService.findPostRow(""));

       List<Post> list=postService.findPosts("",page.getStart(),page.getLimit());
       List<Map<String,Object>> posts=new ArrayList<>();
       if(list!=null) {
           for (Post post : list) {
               Map<String,Object> map=new HashMap<>();
               User user = userService.findUserById(post.getId());
               map.put("user",user);
               map.put("post",post);
               posts.add(map);
           }
       }
       model.addAttribute("posts",posts);
        return "/index";
    }

}
