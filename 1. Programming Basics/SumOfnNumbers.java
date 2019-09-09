package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sum of first 50 numbers is " + sum(50));
    }
    public static int sum (int number) {
        int sum = 0;
        for (int i=0; i<=number;i++) {
            sum+=i;
        } return sum;
    }
}
