package com.jd.xya.springbootmybatis.service.impl;

import com.jd.xya.springbootmybatis.dao.UserMapper;
import com.jd.xya.springbootmybatis.entity.User;
import com.jd.xya.springbootmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public Boolean findByName(String username) {
        return userMapper.findByName(username);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void editUser(User user) {
        userMapper.editUser(user);
    }
}
