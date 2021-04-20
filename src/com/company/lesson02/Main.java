package com.company.lesson02;

public class Main {
    public static void main(String[] args) {

        User user = new User(25, "Alex", "pass");
        System.out.println(user.getName());
        user.setName("vasya");
        System.out.println(user.getName());

        User user1 = new User(30, "Dron");
        System.out.println(user1.getName());

        User user2 = new User();
        System.out.println(user2.getName());
        System.out.println(user2.getAge());





    }
}
