package org.example.testbean;

import org.springframework.beans.factory.annotation.Required;

public class TestBeanWithRequired {
    private int age;
    private String name;

    // обязательный метод, без передачи name мы получим ошибку
    @Required
    public void setName(String name) {
        this.name = name;
    }

    // необязательный метод, ошибки не будет
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    // + ещё некоторый код с геттерами, конструкторами, не требующийся в примере
}
