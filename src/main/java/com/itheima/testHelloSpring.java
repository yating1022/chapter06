package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testHelloSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        helloSpring helloSpring = (helloSpring) applicationContext.getBean("helloSpring");
        helloSpring.show();
    }
}
