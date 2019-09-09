package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of numbers between 23 and 567 is " + sumOfNumbers(23, 567   ));
    }
    public static int sumOfNumbers (int n, int m) {
        int sum = 0;
        for (int i=n; i<=m; i++) {
            sum +=i;
        } return sum;
    }

    //bnpromanu@gmail.com
}
