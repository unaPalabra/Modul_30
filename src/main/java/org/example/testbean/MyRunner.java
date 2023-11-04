package org.example.testbean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        TestBeanWithRequired testBean = (TestBeanWithRequired) context.getBean("testBean");
        System.out.println(testBean.getName());
    }
}
