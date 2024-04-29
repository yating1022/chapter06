package com.itheima;

public class helloSpring {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void show(){
        System.out.println(userName + ":欢迎来到Spring");
    }
}
