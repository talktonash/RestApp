package com.home.service.RestApp;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private int name;
    private String address;

    public Person() {
        System.out.println("object created");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
