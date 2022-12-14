package com.example.lab2;

import java.util.Scanner;

public class zlab1 {
        public static void main(String[] args) {
            Scanner God = new Scanner(System.in);
            System.out.print("Введите год рождения: ");
            int BGod = 0;
            if (God.hasNextInt()){
                BGod = God.nextInt();
            }
            else {
                while (!God.hasNextInt()) {
                    System.out.println("Неверно введены данные");
                    System.out.print("Введите год рождения: ");
                    God.next();
                }
                BGod = God.nextInt();
            }
            Scanner mesyac = new Scanner(System.in);
            System.out.print("Введите месяц рождения: ");
            int Bmecyac = 0;
            if (mesyac.hasNextInt()) {
                Bmecyac = mesyac.nextInt();
            }
            else {
                while (!mesyac.hasNextInt()) {
                    System.out.println("Неверно введены данные");
                    System.out.print("Введите месяц рождения: ");
                    mesyac.next();
                }
                Bmecyac = mesyac.nextInt();
            }
            Scanner Day = new Scanner(System.in);
            System.out.print("Введите день рождения: ");
            int Den = 0;
            if (Day.hasNextInt()) {
                Den = Day.nextInt();
            }
            else {
                while (!Day.hasNextInt()) {
                    System.out.println("Введены неверные данные");
                    System.out.print("Вам необходимо ввести день рождения: ");
                    Day.next();
                }
                Den = Day.nextInt();
            }
            God.close();
            mesyac.close();
            Day.close();
            System.out.println();
            System.out.println("Дата рождения: " + Den + "." + mesyac + "." + God);
            int BGod = 2022 - God;
            int Bmesyac = 0;
            int BDen = 0;
            if (25 >= Den)
                BDen = 25 - Den;
            else
                BDen = 30 - (Den - 25);
            if (11 >= mesyac)
                Bmesyac = 11 - mesyac;
            else
                Bmesyac = 12 - (mesyac - 11);
            if (BGod < 0 || mesyac > 12 || Den > 31)
                System.out.println("К сожалению, я не могу вас понять");
            else
                System.out.println("Вам " + BDen + " дней " + Bmecyac + " месяцев " + BGod + "лет");
        }
    }

