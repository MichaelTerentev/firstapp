package ru.web;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("appContext.xml");

        HelloBean helloBean = context.getBean("helloBean", HelloBean.class);

        System.out.println(helloBean.getText());

        context.close();
    }
}