package com.company.homework;

public class RobotInventory {
    private String name;
    private int age;
    public int power;

    public RobotInventory(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }


    public String getName(){return name;}
    public int getAge(){return age;}
    public  int getPower(){return power;}



}
