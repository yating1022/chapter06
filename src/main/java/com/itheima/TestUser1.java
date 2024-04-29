package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new
                ClassPathXmlApplicationContext("applicationContest-User.xml");
        User1 user1 = (User1)classPathXmlApplicationContext.getBean("user1");
        System.out.println(user1);
    }
}
