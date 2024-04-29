package com.itheima.dao.impl;

import com.itheima.dao.userDao;

public class UserDaolmpl implements userDao {
    @Override
    public boolean login(String name,String password){
        if(name.equals("张三")&& password.equals("123")){
            return true;
        }
        return false;
    }
}
