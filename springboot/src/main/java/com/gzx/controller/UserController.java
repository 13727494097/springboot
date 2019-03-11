package com.gzx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gzx.entity.User;
import com.gzx.service.UserService;

@RestController/**�Զ����ص���json��ʽ����***/
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public List<User> list(){
        List<User> list = userService.findAllUser();
        return list;
    }
}
