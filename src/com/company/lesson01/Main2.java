package com.company.lesson01;

public class Main2 {
    public static void main(String[] args) {

        int res = sum(20, 30);
        System.out.println(res);




    }

    public static int sum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }
    private static String convert(String str){
        String res1 = str + "end";
        return res1;
    }

    private static void printTwoTimes(String str){
        System.out.println(str);
        System.out.println(str);
    }

}
