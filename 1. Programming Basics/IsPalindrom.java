package com.company;

public class Main {

    public static void main(String[] args) {
	// read number
        //getLastDigit = number % 10;
        //newNumber = getLastDigit + (10*i)
        isPalindrom(124111421);
    }

    public static int isPalindrom (int number) {
        int temp = number;
        int reversedNumber = 0;
        while (temp != 0) {
            reversedNumber = reversedNumber*10 + temp%10;
            temp = temp/10;
        }
        if (number == reversedNumber) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not palindrom");
        } return reversedNumber;
    }
}
