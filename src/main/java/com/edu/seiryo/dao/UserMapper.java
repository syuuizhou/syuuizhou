package com.edu.seiryo.dao;

import com.edu.seiryo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int addUser(User user);
    int deleteUser(@Param("id") int id);
    int updateUser(User user);
    User queryUserById(@Param("id")int id);
    List<User> queryByAllUser();
}
