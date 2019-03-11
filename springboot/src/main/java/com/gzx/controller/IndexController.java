package com.gzx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gzx.entity.User;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
	@RequestMapping(value = "/login")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        
        List<String> userList=new ArrayList<String>();
        userList.add("admin");
        userList.add("user1");
        userList.add("user2");
        
        modelAndView.addObject("userList", userList);
        return modelAndView;
    }
	
	@RequestMapping("/list")
    public String  listUser(Model model) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <10; i++) {
            userList.add(new User(i,"张三"+i,"20"+i,"中国广州"));
        }
        model.addAttribute("users", userList);
        return "/user/list";
    }
}
