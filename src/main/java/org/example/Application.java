package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example"); //Указываем, где искать наши бины
        context.refresh();  //Обновляем контекст, чтобы наши бины были созданы

        context.setId("123456");
        System.out.println(context.getId());

        Application bean = context.getBean(Application.class);
        bean.run();

        context.close();
    }

    public void run() {
        System.out.println("Привет! Я бин, созданный через аннотации");
    }
}