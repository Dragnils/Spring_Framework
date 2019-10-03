package ru.anuar.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my Initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my Destruction");
    }
    @Override
    public String getSong() {
        return"Hungarian Rhapsody";
    }
}
