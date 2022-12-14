package com.example.lab2;

import java.util.Scanner;

public class laba22 {
        public static void main(String[] args) {
            boolean Word1 = false;
            boolean Word2 = false;
            boolean Word3 = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите пароль ");
            String password = scanner.nextLine();

            if (password.length()<8)
            {
                System.out.println("Пароль должен состоять не менее, чем из 8 символов");
                System.exit (1);
            }

            for (int i = 0; i < password.length(); i++){
                char word = password.charAt(i);

                if ('a' <= word && word <= 'z') {
                    Word1 = true;
                }
                if('A' <= word && word <= 'Z'){
                    Word2 = true;
                }
                if('0' <= word && word <= '9') {
                    Word3 = true;
                }
                if (('a' <= word & word <= 'z') | ('A' <= word & word <= 'Z') | ('0' <= word & word <= '9')){
                    boolean result = true;
                }else{
                    System.out.println("Ненадёжный пароль");
                    System.exit (1);
                }

            }
            if (Word2 & Word1 & Word3){
                System.out.println("Надёжный пароль");
            } else {
                System.out.println("Ненадёжный пароль");
            }

        }


    }
}
