package com.itheima.service.impl;

import com.itheima.dao.userDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService{
    userDao userDao;

    public void setUserDao (userDao userDao) {

        this.userDao = userDao;
    }
    public boolean login (String name,String password){
        return userDao.login(name,password);
    }
}

