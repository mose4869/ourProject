package com.mose.user.service.impl;

import com.mose.user.mapper.UserMapper;
import com.mose.user.pojo.Userinfo;
import com.mose.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public Userinfo LoginGetUser(Userinfo userinfo) {
        return userMapper.LoginGetUser(userinfo);
    }
}
