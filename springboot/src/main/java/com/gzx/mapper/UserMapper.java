package com.gzx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.gzx.entity.User;

@Mapper
public interface UserMapper {
    public List<User> findAll();

}