//package com.company;

import java.util.Scanner;

/**
 * calculates the result of various operations between two real numbers
 *
 * @author Cristian Jurescu
 * @version 22/04/2018
 */

public class App {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Input from user
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Input number 1:");
        double x = scanner.nextInt();
        System.out.println("Input number 2:");
        double y =scanner.nextInt();
        System.out.println("Input operator");
        String operator = scanner.next();
        System.out.println("Result of " + x + " " + operator + " " + y + " is " + simpleCalculator(x,y, operator));
    }

    /**
     *
     * @param x first number
     * @param y second number
     * @param operator operator
     * @return return result of number operator number
     */
    public static double simpleCalculator(double x, double y, String operator) {
        double result=0;
        switch (operator) {
            case "*":
                result = x*y;
                break;
            case "/":
                result = x/y;
                break;
            case "-":
                result = x-y;
                break;
            case "+":
                result = x+y;
                break;
            default:
                System.out.println("Not a valid operator");
                break;
        }
        return result;
    }
}
