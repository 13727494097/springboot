package com.gzx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.gzx.entity.User;
import com.gzx.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    public List<User> findAllUser() {
    	PageHelper.startPage(0,5);
        List<User> list = userMapper.findAll();
        return list;
    }


}
