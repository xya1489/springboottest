package com.jd.xya.springbootmybatis.dao;

import com.jd.xya.springbootmybatis.entity.User;

public interface UserMapper {

     User findById(Integer id);

     Boolean findByName(String username);

     void deleteUser(Integer id);

     void addUser(User user);

     void editUser(User user);

}
