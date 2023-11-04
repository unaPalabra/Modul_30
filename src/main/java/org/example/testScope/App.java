package org.example.testScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        HelloWorldSingleton singleton = context.getBean(HelloWorldSingleton.class);
        singleton.setMessage("Singleton");
        System.out.println(singleton.getMessage());

        singleton = context.getBean(HelloWorldSingleton.class);
        System.out.println(singleton.getMessage());


        HelloWorldPrototype prototype = context.getBean(HelloWorldPrototype.class);
        prototype.setMessage("Prototype");
        System.out.println(prototype.getMessage());

        prototype = context.getBean(HelloWorldPrototype.class);
        System.out.println(prototype.getMessage());
    }
}
