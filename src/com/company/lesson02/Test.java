package com.company.lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(sum(num1, num2));

    }
    private static int sum(int num1, int num2){
        int res = num1 + num2;
        return res;
    }

}
