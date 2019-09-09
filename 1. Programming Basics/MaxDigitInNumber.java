package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("Max digit is " + maxDigit(number));
    }

    public static int maxDigit (int number) {
        int maxDigit = 0;
        int lastDigit = number % 10;
        while (number > 0) {

            if (lastDigit>maxDigit) {
                maxDigit =  lastDigit;
            }
            number = number / 10;
            lastDigit = number % 10;
        }
        return maxDigit;
    }
}
