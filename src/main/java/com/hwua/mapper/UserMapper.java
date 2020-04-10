package com.hwua.mapper;


import com.hwua.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryAllUsers() throws Exception; //查询所有的用户
    public User queryByUsers(User user)throws Exception;  //登录
    public User addUser(User user) throws Exception;  //注册
    public User updateUser(User user)throws Exception;
    public String findUserByName(String name)throws Exception;
    public Long findUserById(Long id)throws Exception;
 }
