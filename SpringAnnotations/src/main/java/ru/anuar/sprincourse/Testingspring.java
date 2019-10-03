package ru.anuar.sprincourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testingspring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );



        Computer computer = context.getBean("computer", Computer.class);
        computer.display();




        context.close();
    }
}
