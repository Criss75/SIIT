package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("the 23rd fibonacci number is " + fibonacciSeq(23));
    }
    public static int fibonacciSeq (int number) {
        int a = 0;
        int b = 1;
        for (int i=2; i<=number; i++) {
        int num = a+b;
        a=b;
        b = num;
        } return b;
    }
}
