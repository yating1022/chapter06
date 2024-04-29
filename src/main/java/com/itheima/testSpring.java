package com.itheima;

import com.itheima.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");
        boolean flag = userService.login("张三","123");
        if (flag){
            System.out.println("登录成功");
        }else{
            System.out.println("登陆失败");
        }
    }
}
