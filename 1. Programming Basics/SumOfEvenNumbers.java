package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumOfEvenNumbers(200));
    }
    public static int sumOfEvenNumbers (int n) {
        int sum = 0;
        for (int i=0; i<=n; i++) {
            if (i%2 ==0) {
                sum +=i;
            }
        }return  sum;
    }
}
