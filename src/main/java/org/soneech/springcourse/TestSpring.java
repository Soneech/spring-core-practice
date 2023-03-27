package org.soneech.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Smartphone smartphone = context.getBean("smartphone", Smartphone.class);
        System.out.println(smartphone);
        context.close();
    }
}
