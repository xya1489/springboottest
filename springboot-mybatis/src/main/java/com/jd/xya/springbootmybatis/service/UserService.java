package com.jd.xya.springbootmybatis.service;

import com.jd.xya.springbootmybatis.entity.User;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public interface UserService {

    User findById(Integer id);

    Boolean findByName(String username);

    void deleteUser(Integer id);

    void addUser(User user);

    void editUser(User user);

}
