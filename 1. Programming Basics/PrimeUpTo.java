package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isPrimeUpTo(1000);
    }


    public static boolean isPrime(int num)    {
            for (int i = 2; i <=num/2; i++)
                if(num%i == 0)
                    return false;
            return true;
            }

    public static void isPrimeUpTo (int number) {
        for (int i=2; i<=number; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime.");
            }
        }
    }
}