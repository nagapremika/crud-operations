package com.stackroute.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int id;
    private String name;
    private int age;
    private String gender;

//setters and getters
    public Customer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Customer(int id, String name, int age, String gender) {      //Parameterized constructor
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Customer() {     //Default constructor
    }



    @Override
    public String toString() {      //overrides toString()
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
