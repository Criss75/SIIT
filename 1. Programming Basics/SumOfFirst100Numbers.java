package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of first 100 integer numbers is " + sumOfNumbers(100));
    }
    public static int sumOfNumbers (int number) {
        int sum = 0;
        for (int i=1; i<=number; i++) {
            sum += i;
        }
        return sum;
    }
}
