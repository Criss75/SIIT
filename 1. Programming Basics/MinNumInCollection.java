package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] collection = {23,3,4,5,6,78,2,56};
        System.out.println("Minimum number in collection is " + smallestNumber(collection));
    }

    public static int smallestNumber (int[] numbers) {
        int min = numbers [0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        } return min;
    }
}
