package com.suhaib.springtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {

//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");


        Triangle triangle = (Triangle)beanFactory.getBean("triangle", Triangle.class);

        triangle.draw();
    }
}
