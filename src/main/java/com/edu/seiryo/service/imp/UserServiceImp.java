package com.edu.seiryo.service.imp;

import com.edu.seiryo.dao.UserMapper;
import com.edu.seiryo.entity.User;
import com.edu.seiryo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User queryUserById(int id) {
        return userMapper.queryUserById(id);
    }

    public List<User> queryByAllUser() {
        return userMapper.queryByAllUser();
    }
}
