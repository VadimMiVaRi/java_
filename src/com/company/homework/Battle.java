package com.company.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Battle {
    public static void main(String[] args) throws IOException {
///////////////////////////////////Описание робота 1//////////////////////////////////
        RobotInventory robot = new RobotInventory("C3PO", 145, 810);
        System.out.println();

///////////////////////////////////Описание робота 2//////////////////////////////////
        RobotInventory robot1 = new RobotInventory("R2D2", 95, 606);
/////////////////////////////////Ввод слова ключь/////////////////////////////////////
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("You a ready!!!");                   ///начало боя
        System.out.println("Для начала боя введи -Fight-");     ///инструкция
        String s = reader.readLine();         ///чтение строки
        while (s.equals("Fight")){           ///слово ключь
            if(robot.power < robot1.power){  ///битва роботов
                System.out.println("Win R2D2");  ///результат боя
                break;
            }else {
                System.out.println("Win C3PO"); ///результат боя
                break;
            }
        }







    }
}
