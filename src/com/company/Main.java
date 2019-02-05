package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer you want to invert:");
        int number = scanner.nextInt();
        int reserseNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reserseNumber = (reserseNumber * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println(reserseNumber);
    }
}
