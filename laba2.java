package com.example.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class laba2 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner ( System.in );
            System.out.println("Введите число, месяц и год");
            String String = scanner.nextLine();
            String[] words = data.split(".");
            if (words.length != 3) {
                System.out.println("Введены неверные данные!");
            } else {
                int[] array = Arrays.asList(words).stream().mapToInt(Integer::parseInt).toArray();
                if (array [0] > 31 | array [0] < 0 | array [1] > 12 | array [1] < 0 | array [2] > 9999 | array [2] <1900){
                    System.out.println("Неверный формат");
                } else {
                    System.out.println("Верный формат даты.");
                }
            }
        }
}
