package com.itheima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContest-User2.xml");
        User2 user2 = (User2)classPathXmlApplicationContext.getBean("user2");
        System.out.println(user2.toString());
    }
}
