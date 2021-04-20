package com.company.lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

    /*    for(int i = 0; i < 10; i+=2);{
            System.out.println("text");
        }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
            while (!str.equals("exit")){
                System.out.println(str);
                str = reader.readLine();
            }
        }

      /*  int i = 2;
        while (i < 10){
            System.out.println("text " + i);
            i+=2;
        }*/

    }

